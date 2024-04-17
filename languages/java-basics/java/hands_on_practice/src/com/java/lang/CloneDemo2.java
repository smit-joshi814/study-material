/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.lang;

/**
 *
 * @author smit
 */
class TestClone1 implements Cloneable {

    int a;
    double b;

    public Object clone() {
        try {
//call clone in object
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clonning Not Allowed");
            return this;
        }
    }
}

public class CloneDemo2 {

    public static void main(String[] args) {
        TestClone1 x1 = new TestClone1();
        TestClone1 x2;

x1.a=10;
x1.b=20.98;
//here, clone() is called directly
        x2 = (TestClone1) x1.clone();
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x1.b);
    }
}
