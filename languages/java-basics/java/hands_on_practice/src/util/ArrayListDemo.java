/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.*;

/**
 *
 * @author smit
 */
public class ArrayListDemo {

    public static void main(String[] args) {
//create an array list
        ArrayList<String> a1 = new ArrayList<String>();
        System.out.println("Initial Size of a1: " + a1.size());

//Add Elements to the array list
        a1.add("I");
        a1.add("W");
        a1.add("H");
        a1.add("S");
        a1.add("M");
        a1.add(5, ":)");
System.out.println("Size of a1 after aditions: "+a1.size());

//Display the list
System.out.println("Contents Of a1 "+a1);

//Remove Elements From the array list
a1.remove(":)");
a1.remove(4);

System.out.println("Size of al after dilition: "+a1.size());

System.out.println("Contents of a1: "+a1);
    }
}
