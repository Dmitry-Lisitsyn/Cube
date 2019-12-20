import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.Color;
import javax.swing.*;
public class Facet {
    private R3Vector[] vertex;
    Color color;
    //protected Color color=Color.magenta;
    public Facet(R3Vector v1, R3Vector v2,R3Vector v3,R3Vector v4){
        vertex = new R3Vector[4];
        vertex[0] = v1;
        vertex[1] = v2;
        vertex[2] = v3;
        vertex[3] = v4;

       // Color color = new Color();
    }
    public void out() {

        for (int i = 0; i < 4; i++) {
            System.out.println("(" + vertex[i].x + ", " + vertex[i].y + ", " + vertex[i].z + ")");
        }
    }
        public R3Vector normal()
        {
            R3Vector a = R3Vector.netral(vertex[0], vertex[1]);
            R3Vector b = R3Vector.netral(vertex[0], vertex[3]);
            return R3Vector.Vektor(a,b);
        }


    public void rotate(double dx, double dy, double dz)
    {
        for ( int i = 0 ; i < vertex.length; i++)
        {
            vertex[i].rotate(dx,dy,dz);
        }
    }

    public void scale(double k){

        for (int i = 0; i < 4; i++) {

            R3Vector.scale(vertex[i],k);
        }
    }
    public  void translate(double dx, double dy, double dz) {

        for ( int i = 0 ; i < vertex.length; i++)
        {
            vertex[i].move(dx,dy,dz);
        }
    }


    //Отрисовка граней
    public void perspdraw(Graphics2D g)
    {
        int c = 200;
        double t[] =  new double[4];
        t[0] = (vertex[0].getz()-c)/-c;
        t[1] = (vertex[1].getz()-c)/-c;
        t[2] = (vertex[2].getz()-c)/-c;
        t[3] = (vertex[3].getz()-c)/-c;
        R3Vector Pers[] = new R3Vector[4];
        for(int i=0;i<4;i++){
            Pers[i] = new R3Vector(vertex[i].getx()*t[i], vertex[i].gety()*t[i], vertex[i].getz()*t[i]);
        }
        Path2D p = new Path2D.Double();
        p.moveTo(Pers[0].getx(), Pers[0].gety());
        p.lineTo(Pers[1].getx(), Pers[1].gety());
        p.lineTo(Pers[2].getx(), Pers[2].gety());
        p.lineTo(Pers[3].getx(), Pers[3].gety());
        p.lineTo(Pers[0].getx(), Pers[0].gety());
        p.closePath();
        //g.draw(p);
        Facet face = new Facet(Pers[0],Pers[1],Pers[2],Pers[3]);
        vertex[0] = Pers[0];
        vertex[1] = Pers[1];
        vertex[2] = Pers[2];
        vertex[3] = Pers[3];

        if (face.normal().getz() > 0) {
            Path2D p1 = new Path2D.Double();
            p1.moveTo(vertex[0].getx(), vertex[0].gety());
            p1.lineTo(vertex[1].getx(), vertex[1].gety());
            p1.lineTo(vertex[2].getx(), vertex[2].gety());
            p1.lineTo(vertex[3].getx(), vertex[3].gety());
            p1.lineTo(vertex[0].getx(), vertex[0].gety());

            g.setColor(color);
            g.fill(p1);


            this.normal();
        }




    }
    public boolean light()
    {
        if (normal().getz() > 0)
        {
            return true;
        }
        else
            return false;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }
}