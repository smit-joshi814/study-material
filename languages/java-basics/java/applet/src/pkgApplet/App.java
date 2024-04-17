package pkgApplet;


import java.awt.*;
import java.applet.Applet;

/*
 <applet code="SimpleApplet" width=200 height=60>
 </applet>
 */

public class App extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawString("A simple Applet", 20, 20);
    }
}