/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * @author smit
 */
public class ByteArrayInputStreamReset {
    public static void main(String[] args) throws IOException{
        String tmp="abc";
        byte b[]=tmp.getBytes();
        ByteArrayInputStream in=new ByteArrayInputStream(b);
        
        for(int i=0;i<2;i++){
            int c;
            while((c=in.read())!=-1){
                if(i==0){
                    System.out.print((char)c);
                }else{
                    System.out.print(Character.toUpperCase((char)c));
                }
            }
            System.out.println();
            in.reset();
        }
    }
}