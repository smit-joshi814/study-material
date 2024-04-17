

package applets;

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
 *Text Fields > RollNo,name,address,result
 * Text area 1
 * Buttons 2 (Read,write)
 * FileReader & Writer
 * 
 * @author smit
 */
public class t1 extends Applet implements ActionListener{
    TextField Rn,Name,Address,Res;
    Button Read,Write;
    TextArea Show;
    FileReader fr;
    FileWriter fw;
    Label l1,l2,l3,l4,l5;
    public void init() {
        
        Rn=new TextField();          l1=new Label("Roll No");
        Name=new TextField();        l2=new Label("Name");
        Address=new TextField();     l3=new Label("Address");
        Res=new TextField();         l4=new Label("Result");
        Read=new Button("READ");
        Write=new Button("WRITE");
        Show=new TextArea(10,30);    l5=new Label("DATA");
        setLayout(new GridLayout(6,1));
        
        add(l1);    add(Rn);
        add(l2);    add(Name);
        add(l3);    add(Address);
        add(l4);    add(Res);
        add(Read);  add(Write);
        add(l5);    add(Show);
        
        Read.addActionListener(this);
        Write.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Read){
            try{
            fr=new FileReader("d:/Hello.txt");
            int i;
            Show.setText(null);
            while((i=fr.read())!=-1){
                Show.append(""+(char)i);
            }
            fr.close();
            }catch(IOException io){
                System.out.println(io);
            }
        }
        if(e.getSource()==Write){
            try{
            fw=new FileWriter("d:/Hello.txt");
            String s;
            s=Rn.getText()+"\n"+Name.getText()+"\n"+Address.getText()+"\n"+Res.getText();
            fw.write(s);
            fw.close();
            }catch(IOException er){
                System.out.println(er);
            }
        }
    }
}
