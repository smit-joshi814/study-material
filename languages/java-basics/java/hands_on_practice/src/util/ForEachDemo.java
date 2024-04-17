/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;

/**
 *
 * @author smit
 */
public class ForEachDemo {

    public static void main(String[] args) {
        //create an array list for integers.

        ArrayList<Integer> vals = new ArrayList<Integer>();
        //add values to the array list

        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        //use for loop to display the values.
        System.out.print("Orignal contents of vals: ");
        for (int v : vals) {
            System.out.print(v + " ");
        }
        System.out.println();

        //Now sum the values by using a for loop.
        int sum = 0;
        for (int v : vals) {
            sum += v;
        }

        System.out.println("Sum of values: " + sum);

    }
}
