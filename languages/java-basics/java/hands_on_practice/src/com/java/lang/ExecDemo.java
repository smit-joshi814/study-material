/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.lang;

/**
 *
 * @author smit
 */
public class ExecDemo {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        @SuppressWarnings("unused")
		Process p= null;
        try {
            p = r.exec("notepad");
        } catch (Exception e) {
            System.out.println("Error executing notepad: " + e);
        }

    }
}
