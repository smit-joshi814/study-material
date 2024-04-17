/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author smit
 */
class InputStreamEnumerator implements Enumeration<FileInputStream> {

    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException e) {
            return null;
        }
    }
}

class SequenceInputStreamDemo {

    public static void main(String args[]) throws Exception {
        int c;
        Vector<String> files = new Vector<String>();
        files.addElement("d:/Hello.txt");
        files.addElement("d:/hay.txt");
        InputStreamEnumerator e = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(e);
        while ((c = input.read()) != -1) {
            System.out.print((char) c);
        }
        input.close();
    }
}