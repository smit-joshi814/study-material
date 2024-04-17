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
public class OnlyExt implements FilenameFilter{
    String ext;
    public OnlyExt(String ext){
        this.ext="."+ext;
    }
    public boolean accept(File dir,String name){
        return name.endsWith(ext);
    }
}
