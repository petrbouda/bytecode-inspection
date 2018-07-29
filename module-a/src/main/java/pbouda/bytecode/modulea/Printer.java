package pbouda.bytecode.modulea;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;

public class Printer {

    public static void printWithDate(String text) {
        System.out.println(DateTime.now() + " - " + StringUtils.upperCase(text));
    }
}
