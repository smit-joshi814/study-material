
package pkgApplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 *
 * @author smit
 */
public class PR16 extends Applet implements AdjustmentListener{
Scrollbar r,g,b;
Label l;
    public void init() {
        r=new Scrollbar(0,1,10,1,255);
        g=new Scrollbar(0,1,10,1,255);
        b=new Scrollbar(0,1,10,1,255);
        l=new Label("SMIT");
        setLayout(new GridLayout(4,1));
        
        add(r);
        add(g);
        add(b);
        add(l);
        
        r.addAdjustmentListener(this);
        g.addAdjustmentListener(this);
        b.addAdjustmentListener(this);
    }
    
    public void adjustmentValueChanged(AdjustmentEvent e){
        int red,green,blue;
        red=r.getValue();
        green=g.getValue();
        blue=b.getValue();
        l.setBackground(new Color(red,green,blue));
    }


}
