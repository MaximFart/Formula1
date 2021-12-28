package foxminded.com.service.inputFileReader;

import static foxminded.com.service.inputFileReader.InputFileReader.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class InputFileReaderTest {

    @Test
    void process_shouldIsNotEmptyReadingFileAbbreviations_whenInputFileAbbreviations() throws IOException {
        assertEquals(true, !readingFileAbbreviations( "abbreviations.txt").isEmpty());
    }

    @Test
    void process_shouldIsNotEmptyReadingFileStart_whenInputFileStart() throws IOException {
        assertEquals(true, !readingFileStart("start.log").isEmpty());
    }

    @Test
    void process_shouldIsNotEmptyReadingFileEnd_whenInputFileEnd() throws IOException {
        assertEquals(true, !readingFileEnd("end.log").isEmpty());
    }
}
