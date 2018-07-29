package pbouda.bytecode.inspection;

import org.apache.commons.lang3.StringUtils;
import pbouda.bytecode.modulea.Printer;

public class CrossModule {

    public static void main(String[] args) {
        printReversedWithDate("Print Cross module Something");
    }

    private static void printReversedWithDate(String statement) {
        Printer.printWithDate(StringUtils.reverse(statement));
    }
}
