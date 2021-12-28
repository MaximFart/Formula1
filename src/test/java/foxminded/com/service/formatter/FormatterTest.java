package foxminded.com.service.formatter;

import static foxminded.com.service.inputFileReader.InputFileReader.*;
import static org.junit.jupiter.api.Assertions.*;

import foxminded.com.entity.racer.Racer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.util.HashMap;

public class FormatterTest {
    private final Formatter formatter = new Formatter();
    private final int SIZE = 19;

    @Test
    void process_shouldMapContainsSizeElements_whenCreatedThisMap() throws IOException {
        assertEquals(SIZE, formatter.creatingRacers("start.log","end.log", "abbreviations.txt").size());
    }

    @Test
    void process_shouldThrowIOException_whenPathFileIncorrect() throws IOException {
        assertThrows(IOException.class, () -> formatter.creatingRacers("", "end.log", "abbreviations.txt"));
    }

    @Test
    void  process_shouldThrowNullPointerException_whenPathFileNull() {
        assertThrows(NullPointerException.class, () -> formatter.creatingRacers(null, "end.log", "abbreviations.txt"));
    }
}
