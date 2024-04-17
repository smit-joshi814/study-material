/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.lang;

/**
 *
 * @author smit
 */
public class StringConversions {
    
    public static void main(String[] args) {
        int num = 19648;
        System.out.println(num + " Binary: " + Integer.toBinaryString(num));
        
        System.out.println(num + " Octal: " + Integer.toOctalString(num));
        
        System.out.println(num + " HexaDecimal " + Integer.toHexString(num));
    }
}
