/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.lang;

/**
 *
 * @author smit
 */
public class Elapsed {

    public static void main(String[] args) {
        long start, end;

        System.out.println("Timing a for loop from 0 to 1,000,000");

//time a for loop from 0 to 1000000
        start = System.currentTimeMillis();   //get starting time

        for (int i = 0; i < 100000; i++);
        end = System.currentTimeMillis(); //get ending time

        System.out.println("Elapsed time: " + (end - start));
    }
}
