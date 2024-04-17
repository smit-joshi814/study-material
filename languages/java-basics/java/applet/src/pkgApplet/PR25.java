
package pkgApplet;

import java.applet.Applet;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PR25 extends Applet implements MouseMotionListener {

    Label l1, l2;
    int c = 0;

    public void init() {
        l1 = new Label("      (x,)        ");
        l2 = new Label("      Mouse Dragged       ");
        
        add(l1);
        add(l2);
        
        addMouseMotionListener(this);
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        c++;
        l2.setText("Mouse Dragged " + c + " Piexls");
        
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        l1.setText("(x,y) " + e.getX() + " " + e.getY());
    }
    
}
