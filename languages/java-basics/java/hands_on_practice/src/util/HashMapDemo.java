/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author smit
 */
public class HashMapDemo {
    public static void main(String[] args){
        //create a hash map
        HashMap<String,Double> hm=new HashMap<>();
        
        //put elememnts to the map
        hm.put("Smit", 234.100);
        hm.put("vijay", 5680.90);
        hm.put("Ish", 143.143);
        
        //get Set of the entries
        Set<Map.Entry<String,Double>> set =hm.entrySet();
        
        //Display the set
        for(Map.Entry<String,Double> me: set){
            System.out.print(me.getKey()+" ");
            System.out.println(me.getValue());
        }
        System.out.println();
        
        //Deposit 1000 into Ishu's account
        double bal=hm.get("Ish");
        hm.put("Ish", bal+1000);
        
        System.out.println("Ish's new Balance "+hm.get("Ish"));
    }
}