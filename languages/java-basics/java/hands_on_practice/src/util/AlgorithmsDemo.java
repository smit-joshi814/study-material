

package util;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author smit
 */
public class AlgorithmsDemo {
    public static void main(String[] args){
        //create and initialize link list
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(-8);
        ll.add(80);
        ll.add(7);
        ll.add(10);
        
        //create a reverse order comparator
        Comparator<Integer> r=Collections.reverseOrder();
        
        //sort list by using comparator
        Collections.sort(ll,r);
        
        System.out.print("Sorted list: in reversr: ");
        for(int i:ll){
            System.out.print(i+" ");
        }
            System.out.println();
            
            //suffle list
            Collections.shuffle(ll);
            
            //Display randomized list
            System.out.print("List suffled: ");
            for(int i:ll){
             System.out.print(i+" ");
            }
            System.out.println();
            
            System.out.println();
    }
}
