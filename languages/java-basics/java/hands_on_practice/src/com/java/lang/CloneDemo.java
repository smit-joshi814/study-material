/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.lang;

/**
 *
 * @author smit
 */
class TestClone implements Cloneable {

    int a;
    double b;

    TestClone clonetest() {
        try {
//call clone in object
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clonning Not Allowed");
            return this;
        }
    }
}

public class CloneDemo {

    public static void main(String[] args) {
        TestClone x1 = new TestClone();
        TestClone x2;

        x1.a = 10;
        x1.b = 20.98;

        x2 = x1.clonetest();  //clone x1

        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}