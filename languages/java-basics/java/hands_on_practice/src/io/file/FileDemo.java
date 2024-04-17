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
public class FileDemo {

    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("\\");
        p("File name : " + f1.getName());
        p("Path: " + f1.getPath());
        p("Abs path: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "is readable" : "is not redable");
        p(f1.canWrite() ? "is writable" : "is not writable");
        p(f1.canRead() ? "is redable" : "is not redable");
        p("is " + (f1.isDirectory() ? " " : "is not directory"));
        p(f1.isFile()?"is normal file":"might be named pipe");
        p(f1.isAbsolute()?"is absolute":"is not absolute");
        p("File last modifided "+f1.lastModified());
        p("File size :"+f1.length());
    }
}
