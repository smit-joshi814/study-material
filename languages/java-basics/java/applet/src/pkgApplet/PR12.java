package pkgApplet;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

class MyClass extends Canvas {

    int pv;

    MyClass(int p) {
        pv = p;
        setSize(100, 100);
        setBackground(Color.CYAN);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawOval(10, 10, 50, 50);
        g.drawString("i= " + pv, 10, 10);

    }
}

public class PR12 extends Applet {

    MyClass c;

    public void init() {
        setLayout(new GridLayout(4,3));
        for(int i=1;i<=9;i++){
            c=new MyClass(i);
            add(c);
        }
    }

}
