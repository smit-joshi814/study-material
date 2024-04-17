/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.Scanner;

/**
 *
 * @author smit
 */
public class scann {

    public static void main(String[] args) {
        Scanner jay = new Scanner(System.in);
        System.out.print("Enter Age ");
        int age = jay.nextInt();
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
        jay.close();
    }
}
