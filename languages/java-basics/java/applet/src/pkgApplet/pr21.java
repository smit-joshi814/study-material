/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgApplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author smit
 */
public class pr21 extends Applet implements ActionListener {

    Button b1;
    List li;
    TextField tf;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        b1 = new Button("FIND");
        li = new List(10);
        tf = new TextField();

        add(tf);
        add(b1);
        add(li);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int n, ans;

        n = Integer.parseInt(tf.getText());
        for (int i = 1; i <= 10; i++) {
            ans = n * i;
            li.add(n + " x " + i + " =" + ans);
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
