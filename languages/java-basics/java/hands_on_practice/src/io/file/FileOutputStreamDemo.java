
package io.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author smit
 */
class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        String source = "hy there How are you ?"
                + "\n I Hope you'r Fine And Happy"
                + "\n But I miss you Soooooo Much";

        byte buf[] = source.getBytes();
        OutputStream f0 = new FileOutputStream("file1.txt");

        for (int i = 0; i < buf.length; i += 2) {
            f0.write(buf[i]);
        }
        f0.close();

        OutputStream f1 = new FileOutputStream("file2.txt");
        f1.write(buf);
        f1.close();

        OutputStream f2 = new FileOutputStream("file3.txt");
        f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        f2.close();

        InputStream r1 = new FileInputStream("file1.txt");
        System.out.println("file1.txt");
        int i;
        while ((i = r1.read()) != -1) {
            System.out.print((char) i);
            i++;
        }
        System.out.println();
        
        InputStream r2 = new FileInputStream("file2.txt");
        System.out.println("file2.txt");
        
        while ((i = r2.read()) != -1) {
            System.out.print((char) i);
            i++;
        }
        System.out.println();
        
        InputStream r3 = new FileInputStream("file3.txt");
        System.out.println("file3.txt");
        
        while ((i = r3.read()) != -1) {
            System.out.print((char) i);
            i++;
        }
        System.out.println();
    }
}
