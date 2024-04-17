

package pkgApplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author smit
 */
public class PR27 extends Applet implements ActionListener {
    Button b1,b2;
    TextField t1,t2,t3,t4;
    TextArea ta;
    Label l1,l2,l3,l4,l5;
    public void init() {
        b1=new Button("Write");
        b2=new Button("Read");
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t4=new TextField();
        l1=new Label("Rollno");
        l2=new Label("Name");
        l3=new Label("Address");
        l4=new Label("Result");
        l5=new Label("Output");
        ta=new TextArea(10,30);
        setLayout(new GridLayout(6,1));
        
        add(l1);    add(t1);
        add(l2);    add(t2);
        add(l3);    add(t3);
        add(l4);    add(t4);
        add(b1);    add(b2);
        add(l5);    add(ta);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
       
        if(e.getSource()==b1){
            try{
            FileWriter fw=new FileWriter("D:/Hello.txt");
            fw.write(t1.getText()+"\n"+t2.getText()+"\n"+t3.getText()+"\n"+t4.getText());
            fw.close();
            }catch(IOException ae){
                System.out.println(ae);
            }
        }
        if(e.getSource()==b2){
            try{
                FileReader fr=new FileReader("D:/Hello.txt");
                int i;
                
                while((i=fr.read())!=-1){
                    ta.append(""+(char)i);
                }
                fr.close();
            }catch(IOException ax){
                System.out.println(ax);
            }
        }
    }


}
