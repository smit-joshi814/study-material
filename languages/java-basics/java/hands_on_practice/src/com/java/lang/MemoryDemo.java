/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.lang;

/**
 *
 * @author smit
 */
public class MemoryDemo {

    @SuppressWarnings("removal")
	public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer someints[] = new Integer[1000];
        System.out.println("Total emory is: " + r.totalMemory());

        mem1 = r.freeMemory();
        System.out.println("Initial Free memory: " + mem1);
        r.gc();

        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection: " + mem1);

        for (int i = 0; i < 1000; i++) {
            someints[i] = new Integer(i); //alocates integers
        }
        mem2 = r.freeMemory();
        System.out.println("Free Memory after allocaction: " + mem2);

        System.out.println("Memory used by Allocaction : " + (mem1 + mem2));

//discard Integers
        for (int i = 0; i < 1000; i++) {
            someints[i] = null;
        }
        r.gc(); //request garbage collection

        mem2 = r.freeMemory();
        System.out.println("Free memory after collecting discarded integers: " + mem2);
    }
}
