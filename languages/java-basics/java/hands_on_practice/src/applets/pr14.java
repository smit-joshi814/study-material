/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author smit
 */
public class pr14 extends Applet implements ActionListener {

    Button b1, b2, b3;
    TextField t1, t2, t3;

    @Override
    public void init() {
        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("CLEAR");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        setLayout(new GridLayout(6, 1));

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(t3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());

        if (e.getSource() == b1) {
            t3.setText("Addition is: " + (x + y));
        }
        if (e.getSource() == b2) {
            t3.setText("Substraction is: " + (x - y));
        }
        if (e.getSource() == b3) {
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
