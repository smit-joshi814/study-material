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
public class PR13 extends Applet implements ItemListener{
Choice c;
TextArea ta;
 
@Override
    public void init() {
        c=new Choice();
        ta=new TextArea(10,30);
        
        c.add("f1.txt");
        c.add("f2.txt");
        
        add(c);
        add(ta);
        c.addItemListener(this);
        // TODO start asynchronous download of heavy resources
    }

@Override
    public void itemStateChanged(ItemEvent e){
        System.out.println("Selected File: "+c.getSelectedItem());
        try{
            FileReader fr=new FileReader("d:/"+c.getSelectedItem());
            int i;
            ta.setText(null);
            while((i=fr.read())!=-1){
               ta.append(""+(char)i);
            }
            fr.close();
        }catch(IOException ea){
            System.out.println(ea);
        }
    }
        
}