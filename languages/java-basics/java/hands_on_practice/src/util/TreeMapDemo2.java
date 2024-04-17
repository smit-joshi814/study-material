/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author smit
 */
class TComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int i, j, k;
        String aStr, bStr;

        aStr = a;
        bStr = b;

        //FInd the index of Begning of last name
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) //last names match, check entire name
        {
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
    }
}

public class TreeMapDemo2 {

    public static void main(String[] args) {
         //create a tree map
        TreeMap<String,Double> tm=new TreeMap<>(new TComp());
        
        //put elements
        tm.put("Smit Joshi",123.80);
        tm.put("Zara khan", 890.76);
        tm.put("Isha Sharma", 143.143);
        
        //get a set of Enteries
        Set<Map.Entry<String,Double>> set=tm.entrySet();
        
        //display the elements
        for(Map.Entry<String,Double> me: set){
            System.out.print(me.getKey()+" ");
            System.out.println(me.getValue());
        }
        System.out.println();
        
        //deposit 1000 in ishu's acc
        double bal=tm.get("Isha Sharma");
        tm.put("Isha Sharma", bal+1000);
        
        System.out.println("Updated Bal of isha: "+tm.get("Isha Sharma"));
    }
}
