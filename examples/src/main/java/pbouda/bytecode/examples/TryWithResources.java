package pbouda.bytecode.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public String tryWithResources() {
        try (BufferedReader br = new BufferedReader(new FileReader(getClass().getResource("file.txt").getFile()))) {
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
