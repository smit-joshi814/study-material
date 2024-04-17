/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgApplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author smit
 */
public class pr17 extends Applet implements ActionListener{
Button b1,b2;
TextArea ta;
TextField t1,t2,t3;
Label l1,l2,l3,l4,l5;
Choice c;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        b1=new Button("ADD");
        b2=new Button("Clear");
        ta=new TextArea(10,10);
        l1=new Label("Roll no");
        l2=new Label("Name");
        l3=new Label("Course");
        l4=new Label("Department");
        l5=new Label("Inserted Item");
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        c=new Choice();
        setLayout(new GridLayout(7,2));
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        c.addItem("MCA");
        c.addItem("BCOM");
        c.addItem("MSC( CA & IT )");
        
        add(l1);    add(t1);
        add(l2);    add(t2);
        add(l4);    add(t3);
        add(l3);    add(c);
        add(b1);
        add(b2);
        add(l5);
        add(ta);
        
    }

    public void actionPerformed(ActionEvent e){
        String Roll,Name,Dept,Cou;
        Roll=t1.getText();
        Name=t2.getText();
        Cou=c.getSelectedItem();
        Dept=t3.getText();
        if(e.getSource()==b1){
            ta.append("Rollno: "+Roll+"\nName: "+Name+"\nCourse: "+Cou+"\nDept Name: "+Dept+"\n\n");
        }
        if(e.getSource()==b2){
            ta.selectAll();
            ta.setText(null);
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
            c.select(0);
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
