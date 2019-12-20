import java.awt.*;
public class R3Vector {
    public double x, y, z;
    Color color;

    public R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void out() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public R3Vector sum(R3Vector a) {
        return new R3Vector(x + a.x, y + a.y, z + a.z);
    }

    public static R3Vector sum(R3Vector a, R3Vector b) {

        return new R3Vector(a.x + a.x, a.y + a.y, a.z + a.z);
    }
    public static R3Vector scale(R3Vector a,double k){
        a.x = a.x*k;
        a.y = a.y*k;
        a.z = a.z*k;
        return new R3Vector(a.x,a.y,a.z);
    }
    /*
    public static void translate(R3Vector a, double dx, double dy, double dz){
        System.out.println("(" + (a.x+dx) + ", " + (a.y+dy) + ", " + (a.z+dz) + ")");
    }
    */

    public void moveX(double dx) {
        x += dx;
    }
    public void moveY(double dy) {
        y += dy;
    }
    public void moveZ(double dz) {
        z += dz;
    }

    public void move(double dx, double dy, double dz)
    {
        moveX(dx);
        moveY(dy);
        moveZ(dz);
    }

    public static double Skalar(R3Vector a,R3Vector b)
    {
       return ((a.x+b.x)+(a.y+b.y)+(a.z+b.z));

    }
    public static R3Vector Vektor(R3Vector a,R3Vector b)
    {

        return new R3Vector(((a.y*b.z)-(a.z*b.y)),((a.z*b.x)-(a.x*b.z)),((a.x*b.y)-(a.y*b.x)));

    }

    public void rotateZ(double degr){

        degr = Math.toRadians(degr);

        double x_deg = x * Math.cos(degr) - y * Math.sin(degr);
        double y_deg = x * Math.sin(degr) + y * Math.cos(degr);
        x = x_deg; y = y_deg;
    }
    public void rotateY(double degr){
        degr = Math.toRadians(degr);

      double  z_deg = z * Math.cos(degr) - x * Math.sin(degr);
      double  x_deg = z * Math.sin(degr) + x * Math.cos(degr);
        x = x_deg; z = z_deg;
    }

    public void rotateX(double degr){
        degr = Math.toRadians(degr);

      double  y_deg = y * Math.cos(degr) - z * Math.sin(degr);
      double z_deg = y * Math.sin(degr) + z * Math.cos(degr);
        y = y_deg; z = z_deg;
    }

    public void rotate(double degrx, double degry, double degrz){

        rotateX(degrx);
        rotateY(degry);
        rotateZ(degrz);

    }
    public double  getx(){
        return x;
    }
    public double  gety() {
        return y;
    }
    public double getz(){
        return z;
        }


    public static R3Vector netral(R3Vector a, R3Vector b)
    {
        return new R3Vector(b.x-a.x,b.y-a.y,b.z-a.z);
    }
}
