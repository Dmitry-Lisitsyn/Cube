import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

       R3Vector a = new R3Vector(5,2,4);
      // a.rotateZ(90);
       //a.rotate(0,0,90);

       //a.out();
       //R3Vector b = new R3Vector(6,1,1);

       /*a.out();
        (a.sum(a).sum(a)).out();
       R3Vector.sum(a,a).sum(a).out();
       R3Vector.translate(a,-5,-2,6);
       System.out.println(R3Vector.Skalar(a,b));
        System.out.println(R3Vector.Vektor(a,b));
        R3Vector.scale(a,5);
    */
     Facet f = new Facet(new R3Vector(0,0,0),new R3Vector(0,1,0),new R3Vector(1,1,0),new R3Vector(1,0,0));
   // f.out();
    //f.rotate(10,10,10);
   // f.out();
   // f.translate(10 ,20,30);
        // f.scale(10);
        Cube c = new Cube();
        c.scale(100);
        //c.translate(-100 ,50,-25);
        c.rotate(78,67,29);
        Viewer v = new Viewer(c);
    }

}
