import foxminded.com.service.formatter.Formatter;
import foxminded.com.service.printer.Printer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Printer printer = new Printer(new Formatter());
        System.out.println(printer.printingReport());
    }
}
