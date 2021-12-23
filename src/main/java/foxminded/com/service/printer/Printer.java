package foxminded.com.service.printer;

import foxminded.com.service.formatter.Formatter;
import foxminded.com.service.racer.Racer;

import java.io.IOException;
import java.util.Map;

public class Printer {
    private Formatter formatter;

    public Printer() {
    }

    public Printer(Formatter formatter) {
        this.formatter = formatter;
    }

    public String printingReport() throws IOException {
        StringBuilder output = new StringBuilder();
        StringBuilder space = new StringBuilder("");
        final int maxCharsName = 17;
        final int maxCharsCompany = 25;
        for (Map.Entry<String, Racer> entry : formatter.creatingRacers().entrySet()) {
            output.append(entry.getValue().getName());
            for (int i = 0; i < maxCharsName - entry.getValue().getName().length(); i++) {
                output.append(" ");
            }
            output.append(" | " + entry.getValue().getCompany());
            for (int i = 0; i < maxCharsCompany - entry.getValue().getCompany().length(); i++) {
                output.append(" ");
            }
            output.append(" | " + entry.getValue().getRoundTime() + "\n");
        }
        return output.toString();
    }
}
