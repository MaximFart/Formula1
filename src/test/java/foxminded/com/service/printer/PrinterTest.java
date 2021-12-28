package foxminded.com.service.printer;

import foxminded.com.service.formatter.Formatter;
import foxminded.com.service.formatter.FormatterTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class PrinterTest {

    @Test
    void process_shouldThrowNullPointerException_whenInputNull() throws IOException {
        Formatter formatterMock = mock(Formatter.class);
        Printer printer = new Printer(formatterMock);
        when(formatterMock.creatingRacers()).thenReturn(null);
        assertThrows(NullPointerException.class, printer::printingReport);
    }
}
