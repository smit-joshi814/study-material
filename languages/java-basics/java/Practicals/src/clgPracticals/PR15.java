/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clgPracticals;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author smit
 */
class MyFrame extends Frame implements Runnable {

    Thread t;
    int c, m = 1, x;
    Dimension d;

    MyFrame() {
        t = new Thread(this);
        setSize(500, 500);
        d = getSize();
        c = 0;
        x = 0;
        t.start();
        addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent we) {
                t.resume();
            }

            public void windowDeactivated(WindowEvent we) {
                t.suspend();
            }

            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
        setVisible(true);
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(100);
                repaint();
            }
        } catch (Exception a) {
        }
    }

    public void paint(Graphics g) {
        if (m == 1) {

            g.setColor(Color.darkGray);
            g.drawString("Hello", x, 250);
            x += 5;
            if (x >= d.width) {
                m = 0;
            }
        }
        if (m == 0) {
            g.setColor(Color.black);
            g.drawString("Hello", x, 250);
            x -= 5;
            if (x - 10 < 0) {
                m = 1;
            }
        }
    }
}

class PR15 {

    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
    }
}
