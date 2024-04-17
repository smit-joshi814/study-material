/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.TreeSet;

/**
 *
 * @author smit
 */
public class TreeSetDemo {

    public static void main(String[] args) {
//create a tree set
        TreeSet<String> ts = new TreeSet<String>();

//add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("E");
        ts.add("F");
        ts.add("H");
        ts.add("G");

        System.out.println(ts);
    }
}
