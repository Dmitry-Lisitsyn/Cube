import javax.swing.*;
import java.awt.*;

public class Viewer extends JFrame {

    public static int width=700;

    public static int height=600;

    private Cube c;

    public Viewer(String name){
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Окно");


    }

    public Viewer(Cube c){
        this("Окошко");
        this.c=c;


    }
    public void paint(Graphics g1){
        Graphics2D g =(Graphics2D)g1;
        g.clearRect(0,0,getWidth(),getHeight());
        g.translate(getWidth()/2, getHeight()/2);
        g.drawLine(0,-getHeight(),0,getHeight());
        g.drawLine(-getWidth(),0,getWidth(),0);
       // c.draw(g);
        c.perspdraw(g);
    }



}
//g.drawLine(0,-getHeight(),0,getHeight());
//g.drawLine(-getWidth(),0,getWidth(),0);
/*    g.setColor(new Color(255,0,0));
        g.drawLine(50,50,100,100);
        g.setColor(new Color(0,255,0));
        g.fillOval(100,50,50,50);*/
