/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author smit
 */
class MyComp implements Comparator<String>{
    @Override
    public int compare(String a, String b){
        String aStr;
        String bStr;
        
        aStr=a;
        bStr=b;
        
        //reverse the comparision
        return bStr.compareTo(aStr);
    }
}

public class CompDemo {
    public static void main(String args[]){
        //create a tree set
        TreeSet<String> ts=new TreeSet<>(new MyComp());
        
        //add Elements to tree set
        ts.add("C");
        ts.add("A");
        ts.add("D");
        ts.add("B");
        ts.add("S");
        ts.add("i");
        ts.add("H");
        
        //Display the elements
        
        for(String elements: ts){
            System.out.print(elements+" ");
        }
        System.out.println();
    }
}
