/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgApplet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author smit
 */
public class pr20 extends Applet implements ActionListener {

    TextField tf;
    TextArea ta;
    Button b;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        b = new Button("SHOW");
        tf = new TextField();
        ta = new TextArea(10, 30);
        setLayout(new GridLayout(3, 1));
        b.addActionListener(this);

        add(tf);
        add(b);
        add(ta);
        // TODO start asynchronous download of heavy resources
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int i;
            FileReader fr = new FileReader("d:/" + tf.getText());
            ta.setText(null);
            while ((i = fr.read()) != -1) {
                ta.append("" + (char) i);
            }
            fr.close();
        } catch (IOException ae) {
            System.out.println(ae);
        }
    }

}
