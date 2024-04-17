package io.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author smit
 */
public class FileInputStreamDemo {
       public static void main(String[] args) throws IOException{
          int size;
          InputStream f=new FileInputStream("C:\\Users\\smit\\eclipse-workspace\\BY ME\\src\\io\\file\\FileInputStreamDemo.java");
          
          System.out.println("Total available bytes: "+ (size=f.available()));
          int n=size/40;
          System.out.println("First "+n+" bytes of the file one read() at a time");
          
          for(int i=0;i<n;i++){
              System.out.print((char)f.read());
          }
          System.out.println("\n Still Available: "+f.available());
          System.out.println("reading the next "+n+"with one read(b[])");
          byte b[]=new byte[n];
          if(f.read(b) !=n){
              System.err.println("Coudn't read "+n+" bytes");
          }
          System.out.println(new String(b,0,n));
          System.out.println("\nStill Available: "+(size=f.available()));
          System.out.println("Skipping half of remaining bytes with skip()");
          f.skip(size/2);
          System.out.println("Still available: "+f.available());
          System.out.println("reading "+n/2+" into the end of the array");
          if(f.read(b,n/2,n/2)!=n/2){
              System.err.println("couden't read: "+f.available());
          }
          System.out.println(new String(b,0,b.length));
          System.out.println("\nStill available: "+f.available());
          f.close();
       }
}
