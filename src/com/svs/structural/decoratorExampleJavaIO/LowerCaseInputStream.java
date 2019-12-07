package com.svs.structural.decoratorExampleJavaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * This is a demo of the Decorator Pattern extending the Java IO functionality.
 *
 * @author baike
 */
class LowerCaseInputStream extends FilterInputStream {
    LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        return (c == -1) ? c : Character.toLowerCase((char) c);
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);

        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return result;
    }
}
