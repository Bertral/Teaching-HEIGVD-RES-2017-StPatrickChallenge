package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Project : StPatrickApp-build
 * Author(s) : Antoine Friant
 * Date : 20.03.17
 */
public class RemoveAStreamDecoratorController implements IStreamDecoratorController {
    @Override
    public Reader decorateReader(Reader inputReader) {
        return inputReader;
    }

    @Override
    public Writer decorateWriter(Writer outputWriter) {
        return new RemoveAWriter(outputWriter);
    }
}
