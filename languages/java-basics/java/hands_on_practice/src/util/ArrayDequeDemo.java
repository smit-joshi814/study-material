/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayDeque;

/**
 *
 * @author smit
 */
public class ArrayDequeDemo {

    public static void main(String[] args) {
//create a tree set
        ArrayDeque<String> adq = new ArrayDeque<String>();

        adq.push("A");
        adq.push("B");
        adq.push("C");
        adq.push("E");
        adq.push("G");

        System.out.print("Poping The Stack: ");
        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }

        System.out.println();
    }
}
