import java.awt.*;
import java.awt.Color;
public class Cube {
private Facet[] facets;
public Cube(){
    facets = new Facet[6];



    facets[0] = new Facet(new R3Vector(0,0,0), new R3Vector(1,0,0), new R3Vector(1,1,0), new R3Vector(0,1,0));
    facets[1] = new Facet(new R3Vector(1,0,1), new R3Vector(1,1,1), new R3Vector(1,1,0), new R3Vector(1,0,0));
    facets[2] = new Facet(new R3Vector(0,0,0), new R3Vector(0,1,0), new R3Vector(0,1,1), new R3Vector(0,0,1));
    facets[3] = new Facet(new R3Vector(0,0,0), new R3Vector(0,0,1), new R3Vector(1,0,1), new R3Vector(1,0,0));
    facets[4] = new Facet(new R3Vector(0,1,0), new R3Vector(1,1,0), new R3Vector(1,1,1), new R3Vector(0,1,1));
    facets[5] = new Facet(new R3Vector(0,0,1), new R3Vector(0,1,1), new R3Vector(1,1,1), new R3Vector(1,0,1));
    facets[0].setColor(Color.magenta);
    facets[1].setColor(Color.green);
    facets[2].setColor(Color.orange);
    facets[3].setColor(Color.yellow);
    facets[4].setColor(Color.blue);
    facets[5].setColor(Color.red);

}
    public void translate(double dx, double dy, double dz) {
        for (int i = 0; i < 6; i++) {
                facets[i].translate(dx, dy, dz);
        }
    }
    public void scale(double k){

        for (int i = 0; i < 6; i++) {

            facets[i].scale(k);
        }
    }
    public void rotate(double degx,double degy,double degz){

        for (int i = 0; i < 6; i++) {

           facets[i].rotate(degx,degy,degz);
        }
    }

    /////Отрисовка граней куба
    public void perspdraw(Graphics2D g)
    {
        for ( int i = 0 ; i < facets.length; i++)
        {
            facets[i].perspdraw(g);
        }
    }
}
