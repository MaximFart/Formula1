package foxminded.com.service.formatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FormatterTest {
    private final Formatter formatter = new Formatter();
    private final int SIZE = 19;

    @Test
    void process_shouldMapContainsSizeElements_whenCreatedThisMap() throws IOException {
        assertEquals(SIZE, formatter.creatingRacers().size());
    }
}
