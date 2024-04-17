package pkgApplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author smit
 */
public class PR31 extends Applet implements Runnable {

    Thread t;
    //int x, y;
    int c;

    public void init() {
        t = new Thread(this);
        t.start();
        c=0;
    }

    public void paint(Graphics g){
//       x=(int) (Math.random()*1000);
//       y=(int)(Math.random()*1000);
//       g.fillOval(x, y, 50, 50);
        g.setColor(Color.BLUE);
        g.drawString("Counter: "+ c, 150,150);
        c++;
    }
    
    public void run() {
        try {
            while (true) {
                repaint();
                Thread.sleep(500);
            }
        } catch (InterruptedException x) {
            System.out.println(x);
        }
    }
}