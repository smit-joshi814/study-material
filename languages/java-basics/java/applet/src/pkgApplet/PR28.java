/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgApplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author smit
 */
public class PR28 extends Applet implements ActionListener {

    Button b1, b2;
    TextField tf;
    TextArea ta;
    Label l1, l2;

   
    public void init() {
        b1 = new Button("READ");
        b2 = new Button("WRITE");
        tf = new TextField();
        l1 = new Label("ENTER TEXT");
        l2 = new Label("Data");
        ta = new TextArea(10, 30);
        setLayout(new GridLayout(3, 1));

        add(l1);
        add(tf);
        add(b1);
        add(b2);
        add(l2);
        add(ta);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

   
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                ta.setText(null);
                FileInputStream fi = new FileInputStream("D:/Hello.txt");
                int i;

                while ((i = fi.read()) != -1) {
                    ta.append("" + (char) i);
                }
                fi.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        if (ae.getSource() == b2) {
            try {
                FileOutputStream fo = new FileOutputStream("D:/Hello.txt");
                String s = tf.getText();
                byte b[] = s.getBytes();
                fo.write(b);
                fo.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
