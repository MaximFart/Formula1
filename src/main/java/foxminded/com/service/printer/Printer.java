package foxminded.com.service.printer;

import foxminded.com.service.formatter.Formatter;
import foxminded.com.service.racer.Racer;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Printer {
    private Formatter formatter;
    private final int MAX_CHARS_NAME = 17;
    private final int MAX_CHARS_COMPANY = 25;

    public Printer() {
    }

    public Printer(Formatter formatter) {
        this.formatter = formatter;
    }

    public String printingReport() throws IOException {
        StringBuilder output = new StringBuilder();
        StringBuilder space = new StringBuilder("");
        List<Double> roundTimeList =  formatter.creatingRacers().values().stream().map(Racer::getRoundTime).sorted().collect(Collectors.toList());
        int index = 0;
        for (Map.Entry<String, Racer> entry : formatter.creatingRacers().entrySet()) {
            if (index == 16) {
                output.append("--------------------------------------------------------" + "\n");
            }
            output.append(entry.getValue().getName());
            for (int i = 0; i < MAX_CHARS_NAME - entry.getValue().getName().length(); i++) {
                output.append(" ");
            }
            output.append(" | " + entry.getValue().getCompany());
            for (int i = 0; i < MAX_CHARS_COMPANY - entry.getValue().getCompany().length(); i++) {
                output.append(" ");
            }
            output.append(" | " + String.format("%d:%06.3f", (int) (roundTimeList.get(index) / 60), roundTimeList.get(index) - 60) + "\n");
            index++;
        }
        return output.toString();
    }
}
