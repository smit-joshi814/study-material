/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgApplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author smit
 */
public class pr24 extends Applet implements ActionListener{
Button b1,b2;
List li;
TextField tf;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        b1=new Button("ADD");
        b2=new Button("REMOVE");
        li=new List(10);
        tf=new TextField();
        setLayout(new GridLayout(0,1));
        add(tf);
        add(b1);
        add(b2);
        add(li);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String s;
        
        if(e.getSource()==b1){
            s=tf.getText();
            li.add(s);
        }
        try{
        if(e.getSource()==b2){
            s=li.getSelectedItem();
            li.remove(s);
        }
        }catch(IllegalArgumentException err){
            System.out.println("Runtime Exception : "+err);
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
