/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author smit
 */
class DirListOnly {

    public static void main(String[] args) {
        String dirname="\\";
        File f1=new File(dirname);
        FilenameFilter only=new OnlyExt("html");
        
        for(String s:f1.list(only)){
            System.out.println(s);
        }
    }
}
