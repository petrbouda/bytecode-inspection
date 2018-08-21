package pbouda.bytecode.examples;

import java.io.IOException;
import java.io.StringReader;

public class TryWithResources {

    public void tryWithResources() throws IOException {
        try (StringReader reader = new StringReader("")) {
            System.out.println(reader.read());
        }
    }
}
