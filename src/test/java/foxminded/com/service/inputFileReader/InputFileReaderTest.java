package foxminded.com.service.inputFileReader;

import static foxminded.com.service.inputFileReader.InputFileReader.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class InputFileReaderTest {

    @Test
    void process_shouldIsNotEmptyReadingFileAbbreviations_whenInputFileAbbreviations() throws IOException {
        assertFalse(readingFileAbbreviations().isEmpty());
    }

    @Test
    void process_shouldIsNotEmptyReadingFileStart_whenInputFileStart() throws IOException {
        assertFalse(readingFileStart().isEmpty());
    }

    @Test
    void process_shouldIsNotEmptyReadingFileEnd_whenInputFileEnd() throws IOException {
        assertFalse(readingFileEnd().isEmpty());
    }
}
