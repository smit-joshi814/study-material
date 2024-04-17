
package pkgApplet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class pr22 extends Applet implements ActionListener {

    FileReader fr;
    FileWriter fw;
    TextArea ta;
    Button b1, b2;

    @Override
    public void init() {
        ta = new TextArea(10, 20);
        b1 = new Button("READ");
        b2 = new Button("WRITE");

        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        add(ta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            try {
                fr = new FileReader("Hello.txt");
                char c[] = new char[50];
                fr.read(c);
                ta.append(new String(c));
            } catch (IOException ai) {
                System.out.println(ai);
            }
        }

        if (e.getSource() == b2) {
            try {
                fw = new FileWriter("Hello.txt");
                fw.write("hello I'm Smit ;) \n");
                fw.close();
            } catch (IOException is) {
                System.out.println(is);
            }
        }
    }

}
