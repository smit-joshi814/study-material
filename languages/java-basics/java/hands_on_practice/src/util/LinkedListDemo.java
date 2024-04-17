/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.LinkedList;

/**
 *
 * @author smit
 */
public class LinkedListDemo {
 public static void main(String[] args){
LinkedList<String> ll=new LinkedList<String>();

ll.add("A");
ll.add("b");
ll.add("c");
ll.add("h");
ll.add("iiii");
ll.add("ssss");
ll.add("e");
ll.add("ish");

ll.add(1,"a1");
System.out.println("Original: "+ll);

ll.removeFirst();
ll.removeLast();

System.out.println("first & last removed "+ll);

ll.remove("b");
ll.remove("e");

System.out.println("After deleting: "+ll);

String val=ll.get(2);
ll.set(2, val+" changed");

System.out.println("ll after change "+ll);
}
}
