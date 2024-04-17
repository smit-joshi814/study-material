/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author smit
 */
public class IteratorDemo {
    public static void main(String []args){
        //Create an array list
        ArrayList<String> al=new ArrayList<String>();
        
        //add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        
        //use iterator to display contents of al.
        System.out.print("Orignal contents of al ");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            String element=itr.next();
            System.out.print(element+"+");
        }
        System.out.println();
        
        //Modify objects being itrated
        ListIterator<String> litr=al.listIterator();
        while(litr.hasNext()){
            String element=litr.next();
            litr.set(element+"+");
        }
        System.out.print("Modifided contentd of al ");
        itr=al.iterator();
        while(itr.hasNext()){
            String element=itr.next();
            System.out.print(element+" ");
        }
        System.out.println();
        
        //Now, display the list backwords
        System.out.print("Modifided list backwords: ");
        while(litr.hasPrevious()){
            String element=litr.previous();
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
