/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.lang;

/**
 *
 * @author smit
 */
public class ISDemo {

    public static void main(String args[]) {
        char a[] = {'a', 'b', '5', '?', 'A', ' '};

        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i])) {
                System.out.println(a[i] + " is Digit");
            }

            if (Character.isLowerCase(a[i])) {
                System.out.println(a[i] + " is Lowercase");
            }

            if (Character.isUpperCase(a[i])) {
                System.out.println(a[i] + " is Uppercase");
            }

            if (Character.isWhitespace(a[i])) {
                System.out.println(a[i] + " is white space");
            }

            if (Character.isLetter(a[i])) {
                System.out.println(a[i] + " is Latter");
            }
            if (Character.isSpaceChar(a[i])) {
                System.out.println(a[i] + " is Special Char");
            }

        }
    }
}
