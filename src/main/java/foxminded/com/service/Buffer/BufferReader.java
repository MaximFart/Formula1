package foxminded.com.service.Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferReader {

    public BufferReader() {
    }

    public static HashMap<String, Double> inputFileEnd() throws IOException {
        HashMap<String, Double> mapEnd = new HashMap<String, Double>();
        try (BufferedReader buffer = new BufferedReader(new FileReader("end.log"))) {
            String line = buffer.readLine();
            while (line != null) {
                String[] temp = line.split("_");
                String[] time = temp[1].substring(3, temp[1].length()).split(":");
                double abc = Double.parseDouble(time[0]) * 60 + Double.parseDouble(time[1]);
                mapEnd.put(temp[0].substring(0, 3), Double.parseDouble(time[0]) * 60 + Double.parseDouble(time[1]));
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return mapEnd;
    }

    public static HashMap<String, Double> inputFileStart() throws IOException {
        HashMap<String, Double> mapStart = new HashMap<String, Double>();
        try (BufferedReader buffer = new BufferedReader(new FileReader("start.log"))) {
            String line = buffer.readLine();
            while (line != null) {
                String[] data = line.split("_");
                String[] time = data[1].substring(3, data[1].length()).split(":");

                mapStart.put(data[0].substring(0, 3), Double.parseDouble(time[0]) * 60 + Double.parseDouble(time[1]));
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return mapStart;
    }

    public static HashMap<String, String> inputFileAbbreviations() throws IOException {
        HashMap<String, String> mapAbbreviations = new HashMap<String, String>();
        try (BufferedReader buffer = new BufferedReader(new FileReader("abbreviations.txt"))) {
            String line = buffer.readLine();
            while (line != null) {
                String[] data = line.split("_");
                mapAbbreviations.put(data[0], data[1]+ "_" + data[2]);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return mapAbbreviations;
    }
}