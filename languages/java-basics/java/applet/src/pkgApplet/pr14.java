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
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author smit
 */
public class pr14 extends Applet implements ActionListener {
Button b1,b2;
TextField t1,t2,t3;
Label l1,l2,l3;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        b1=new Button("ADD");
        b2=new Button("SUB");
        l1=new Label("No1");
        l2=new Label("No2");
        l3=new Label("Ans");
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
       setLayout(new GridLayout(4,1));
        
        add(l1);    add(t1);
        add(l2);    add(t2);
        add(b1);    add(b2);
        add(l3);    add(t3);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

       public void actionPerformed(ActionEvent e){
          int n1,n2,ans;
          n1=Integer.parseInt(t1.getText());
          n2=Integer.parseInt(t2.getText());
           if(e.getSource()==b1){
               ans=n1+n2;
               t3.setText("addition is: "+ans);
           }
           if(e.getSource()==b2){
               ans=n1-n2;
               t3.setText("substraction is: "+ans);
           }
       }
    // TODO overwrite start(), stop() and destroy() methods
}
