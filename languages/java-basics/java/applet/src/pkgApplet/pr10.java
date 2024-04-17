package pkgApplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class pr10 extends Applet implements ActionListener {

    Button b1, b2, b3, b4, b5;

    public void init() {
        b1 = new Button("Red");
        b2 = new Button("Blue");
        b3 = new Button("Green");
        b4 = new Button("Yellow");
        b5 = new Button("Black");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        // TODO start asynchronous download of heavy resources
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setBackground(Color.red);
        }
        if (e.getSource() == b2) {
            setBackground(Color.blue);
        }
        if (e.getSource() == b3) {
            setBackground(Color.green);
        }
        if (e.getSource() == b4) {
            setBackground(Color.yellow);
        }
        if (e.getSource() == b5) {
            setBackground(Color.black);
        }
        // TODO overwrite start(), stop() and destroy() methods
    }
}
