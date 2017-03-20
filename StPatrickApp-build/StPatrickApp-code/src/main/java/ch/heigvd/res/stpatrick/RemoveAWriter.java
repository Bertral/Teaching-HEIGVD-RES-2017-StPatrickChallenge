package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Project : StPatrickApp-build
 * Author(s) : Antoine Friant
 * Date : 20.03.17
 */
public class RemoveAWriter extends BufferedWriter {

    public RemoveAWriter(Writer writer) {
        super(writer);
    }

    @Override
    public void write(char[] chars, int off, int len) throws IOException {
        for(int i = off; i < off + len; i++) {
            if(chars[i] != 'a' && chars[i] != 'A') {
                write(chars[i]);
            }
        }
    }
}
