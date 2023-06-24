package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception2 {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finaly start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finaly finish");

        }
    }
}
