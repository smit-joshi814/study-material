package pkgApplet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author smit
 */
public class PR32 extends Applet implements Runnable {

    Thread t;
    int x, y;

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g){
       x=(int) (Math.random()*1000);
       y=(int)(Math.random()*1000);
       g.fillOval(x, y, 50, 50);
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