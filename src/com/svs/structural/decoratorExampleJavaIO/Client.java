package com.svs.structural.decoratorExampleJavaIO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) {
        int c;

        byte[] bytes = "Tupac Shakur bbbAAAdddMMMaaNN".getBytes();

        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) >= 0) System.out.print((char) c);

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
