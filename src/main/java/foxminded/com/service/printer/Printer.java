package foxminded.com.service.printer;

import foxminded.com.service.formatter.Formatter;
import foxminded.com.service.racer.Racer;

import java.io.IOException;
import java.util.Map;

public class Printer {
    private  Formatter formatter;

    public Printer() {
    }

    public Printer(Formatter formatter) {
        this.formatter = formatter;
    }

    public String printingReport() throws IOException {
        StringBuilder output = new StringBuilder();
        for (Map.Entry<String, Racer> entry : formatter.creatingRacers().entrySet()) {
           output.append(entry.getValue().getName() + space(17 - entry.getValue().getName().length()) + " | " + entry.getValue().getCompany() + space(25 - entry.getValue().getCompany().length()) + " | " + entry.getValue().getRoundTime() + "\n");
        }
        return output.toString();
    }
    public String space(int c) {
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < c; i++) {
            space.append(" ");
        }
        return space.toString();
    }
}
