/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.lang;

import java.util.Scanner;

/**
 *
 * @author smit
 */
public class ParseDemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        int i;
        int sum = 0;
        System.out.println("Enter numbers 0 to Quit");
        do {
            str = s.nextLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Format");
                i = 0;
            }
            sum += i;
            System.out.println("Current sum is: " + sum);
        } while (i != 0);
        s.close();
    }
}
