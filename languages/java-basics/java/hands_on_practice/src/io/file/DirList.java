/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.file;

import java.io.File;

/**
 *
 * @author smit
 */
public class DirList {

    public static void main(String[] args) {
        String dirname = "\\TURBOC3";
        File f1 = new File(dirname);

        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);

            for (String s : f1.list()) {
                File f = new File(dirname + "/" + s);
                if (f.isDirectory()) {
                    System.out.println(s + " is directory");
                } else {
                    System.out.println(s + " is file");
                }
            }
        } else {
            System.out.println(dirname + " is not directory");
        }
    }
}
