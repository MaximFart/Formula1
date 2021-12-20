package foxminded.com.service.formatter;

import foxminded.com.service.racer.Racer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static foxminded.com.service.Buffer.BufferReader.*;


public class Formatter {

    public Formatter() {
    }

    public static void main(String[] args) throws IOException {
        Formatter formatter = new Formatter();
        formatter.creatingRacers();
    }

    public HashMap<String, Racer> creatingRacers() throws IOException {
        HashMap<String,Double> mapStart = inputFileStart();
        HashMap<String,Double> mapEnd = inputFileEnd();
        HashMap<String,String> mapAbbreviations = inputFileAbbreviations();
        HashMap<String, Racer> mapRacers = new HashMap<>();
        for (Map.Entry<String, String> entry : mapAbbreviations.entrySet()) {
            String[] array = entry.getValue().split("_");
            mapRacers.put(entry.getKey(), new Racer(array[1], array[0], Double.parseDouble(String.format("%.3f",(mapEnd.get(entry.getKey()) - mapStart.get(entry.getKey()))))));
        }
        return mapRacers;
    }
}