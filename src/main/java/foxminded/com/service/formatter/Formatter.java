package foxminded.com.service.formatter;

import foxminded.com.entity.racer.Racer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static foxminded.com.service.inputFileReader.InputFileReader.*;


public class Formatter {

    public Formatter() {
    }

    public HashMap<String, Racer> creatingRacers(String start, String end, String abbreviations) throws IOException {
        HashMap<String,Double> mapStart = readingFileStart(start);
        HashMap<String,Double> mapEnd = readingFileEnd(end);
        HashMap<String,String> mapAbbreviations = readingFileAbbreviations(abbreviations);
        HashMap<String, Racer> mapRacers = new HashMap<>();
        for (Map.Entry<String, String> entry : mapAbbreviations.entrySet()) {
            String[] array = entry.getValue().split("_");
            mapRacers.put(entry.getKey(), new Racer(array[1], array[0], Double.parseDouble(String.format("%.3f",(mapEnd.get(entry.getKey()) - mapStart.get(entry.getKey()))))));
        }
        return mapRacers;
    }
}
