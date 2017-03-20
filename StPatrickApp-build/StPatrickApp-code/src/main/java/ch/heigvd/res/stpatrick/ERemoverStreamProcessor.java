package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Project : StPatrickApp-build
 * Author(s) : Antoine Friant
 * Date : 20.03.17
 */
public class ERemoverStreamProcessor implements IStreamProcessor {

    @Override
    public void process(Reader in, Writer out) throws IOException {
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);
        int c = br.read();
        while (c != -1) {
            if(c != 'e' && c != 'E') {
                bw.write(c);
            }
            c = br.read();
        }
        bw.flush();
    }
}
