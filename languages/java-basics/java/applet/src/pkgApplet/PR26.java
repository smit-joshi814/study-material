/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgApplet;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author DELL
 */
class MyDlg extends Dialog implements ActionListener {

    Label l1, l2, l3, l4;
    Button Exit;

    public MyDlg(Frame f, int Sum, int Sub, int Mul, int Div) {
        super(f);
        setLayout(new GridLayout(6, 1));
        l1 = new Label(null);
        l2 = new Label(null);
        l3 = new Label(null);
        l4 = new Label(null);

        l1.setText("sum: " + Sum);
        l2.setText("Substrction: " + Sub);
        l3.setText("Multiplicaction: " + Mul);
        l4.setText("Dividion: " + Div);

        Exit = new Button("Exit");
        Exit.addActionListener(this);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(Exit);
        setSize(150, 150);
        setVisible(true);
        Exit.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Exit) {
            dispose();
        }
    }

}

public class PR26 extends Frame implements ActionListener {

    TextField t1, t2;
    Button b;
    Label l1, l2;
    int Sum, Sub, Div, Mul;

    public PR26() {
        setLayout(new GridLayout(5, 1));
        l1 = new Label("Enter Number1: ");
        l2 = new Label("Enter Number2: ");
        b = new Button("Ans");
        t1 = new TextField();
        t2 = new TextField();

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);

        b.addActionListener(this);
        setVisible(true);
        setSize(600, 600);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        int tmp1, tmp2;

        tmp1 = Integer.parseInt(t1.getText());
        tmp2 = Integer.parseInt(t2.getText());
        Sum = tmp1 + tmp2;
        Sub = tmp1 - tmp2;
        Mul = tmp1 * tmp2;
        Div = tmp1 / tmp2;

        new MyDlg(this, Sum, Sub, Mul, Div);
    }

    public static void main(String[] args) {
        PR26 ob = new PR26();
    }
}