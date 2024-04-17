/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgApplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author smit
 */
public class PR29 extends Applet implements ActionListener {
    Button b1,b2;
    TextArea ta;
    public void init() {
      b1=new Button("Read");
      b2=new Button("Write");
      ta=new TextArea(10,30);
      
      add(b1);  add(b2);
      add(ta);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
       if(e.getSource()==b1) {
           try{
               RandomAccessFile rf=new RandomAccessFile("D:/Hello.txt","r");
               
               int i;
               while((i=rf.read())!=-1){
                   ta.append(""+(char)i);
               }
           }catch(IOException ae){
               System.out.println(ae);
           }
       }
       if(e.getSource()==b2){
           try{
               RandomAccessFile rw=new RandomAccessFile("D:/Hello.txt","rw");
               rw.writeBytes("Department of Computer Science");
               rw.writeBytes("\nHemchandraChayra North Gujarat University");
           }catch(IOException ex){
               System.out.println(ex);
           }
       }
    }
}
