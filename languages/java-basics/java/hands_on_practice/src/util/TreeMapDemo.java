/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author smit
 */
public class TreeMapDemo {
    public static void main(String[] args){
        //create a tree map
        TreeMap<String,Double> tm=new TreeMap<>();
        
        //put elements
        tm.put("Smit",123.80);
        tm.put("zara", 890.76);
        tm.put("ish", 143.143);
        
        //get a set of Enteries
        Set<Map.Entry<String,Double>> set=tm.entrySet();
        
        //display the elements
        for(Map.Entry<String,Double> me: set){
            System.out.print(me.getKey()+" ");
            System.out.println(me.getValue());
        }
        System.out.println();
        
        //deposit 1000 in ishu's acc
        double bal=tm.get("ish");
        tm.put("ish", bal+1000);
        
        System.out.println("Updated Bal of ishu: "+tm.get("ishu"));
    }
}