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
public class ArrayListToArray {

    public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();

//add elements to the array list
al.add(1);
al.add(2);
al.add(3);
al.add(4);

System.out.println("Contents of al "+al);

//get the array
Integer ai[]=new Integer[al.size()];
ai=al.toArray(ai);

int sum=0;

for(int i:ai) sum+=i;

System.out.println("sum is: "+sum);
    }
}
