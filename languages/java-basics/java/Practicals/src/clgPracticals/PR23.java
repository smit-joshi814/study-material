/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clgPracticals;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author smit
 */
public class PR23 extends Frame implements ActionListener {

    Menu m1, m2, m3, m4, m5;
    MenuItem mi11, mi12, mi13, mi21, mi22, mi23, mi31, mi32, mi33, mi41, mi42, mi43, miexit;
    MenuBar mb;
    Label l1;
    Font ff;

    public PR23() {
        ff = new Font("Vivaldi", Font.TYPE1_FONT, 15);

        l1 = new Label("HI ISHU");
        l1.setFont(ff);
        add(l1);
        setLayout(new FlowLayout());
        m1 = new Menu("Bg Colors");
        m2 = new Menu("Fonts");
        m3 = new Menu("Font Bg");
        m4 = new Menu("Font Color");
        m5 = new Menu("Exit");

        mb = new MenuBar();
        mi11 = new MenuItem("RED");
        mi12 = new MenuItem("BLUE");
        mi13 = new MenuItem("GREEN");

        mi21 = new MenuItem("Jokerman");
        mi22 = new MenuItem("Cambria");
        mi23 = new MenuItem("Candara");

        mi31 = new MenuItem("RED");
        mi32 = new MenuItem("BLUE");
        mi33 = new MenuItem("GREEN");

        mi41 = new MenuItem("RED");
        mi42 = new MenuItem("BLUE");
        mi43 = new MenuItem("GREEN");

        miexit = new MenuItem("Exit");

        m1.add(mi11);
        m1.add(mi12);
        m1.add(mi13);

        m2.add(mi21);
        m2.add(mi22);
        m2.add(mi23);

        m3.add(mi31);
        m3.add(mi32);
        m3.add(mi33);

        m4.add(mi41);
        m4.add(mi42);
        m4.add(mi43);

        m5.add(miexit);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);

        setMenuBar(mb);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                dispose();
            }
        });

        mi11.addActionListener(this);
        mi12.addActionListener(this);
        mi13.addActionListener(this);

        mi21.addActionListener(this);
        mi22.addActionListener(this);
        mi23.addActionListener(this);

        mi31.addActionListener(this);
        mi32.addActionListener(this);
        mi33.addActionListener(this);

        mi41.addActionListener(this);
        mi42.addActionListener(this);
        mi43.addActionListener(this);

        m5.addActionListener(this);
        setSize(600, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mi11) {
            setBackground(Color.red);
        }
        if (e.getSource() == mi12) {
            setBackground(Color.blue);
        }
        if (e.getSource() == mi13) {
            setBackground(Color.green);
        }
        if (e.getSource() == mi21) {
            ff = new Font("Jokerman", Font.BOLD, 15);
            l1.setFont(ff);
        }
        if (e.getSource() == mi22) {
            ff = new Font("Cambria", Font.HANGING_BASELINE, 15);
            l1.setFont(ff);
        }
        if (e.getSource() == mi23) {
            ff = new Font("Candara", Font.TRUETYPE_FONT, 15);
            l1.setFont(ff);
        }
        if (e.getSource() == mi31) {
            l1.setBackground(Color.red);
        }
        if (e.getSource() == mi32) {
            l1.setBackground(Color.blue);
        }
        if (e.getSource() == mi33) {
            l1.setBackground(Color.green);
        }
        if (e.getSource() == mi41) {
            l1.setForeground(Color.red);
        }
        if (e.getSource() == mi42) {
            l1.setForeground(Color.blue);
        }
        if (e.getSource() == mi43) {
            l1.setForeground(Color.green);
        }

        if (e.getSource() == m5) {
            dispose();
        }
    }

    public static void main(String[] args) {
        PR23 ob = new PR23();
    }
}
