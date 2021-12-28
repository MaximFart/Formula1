package foxminded.com.service.formatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FormatterTest {
    private final Formatter formatter = new Formatter();
    private final int SIZE = 19;

    @Test
    void process_shouldMatchResults_whenCallCreatingRacers() throws IOException {
        String excepted = "{VBM=Racer{company='MERCEDES', name='Valtteri Bottas', roundTime=72.434}, SVF=Racer{company='FERRARI', name='Sebastian Vettel', roundTime=64.415}, CSR=Racer{company='RENAULT', name='Carlos Sainz', roundTime=72.95}, DRR=Racer{company='RED BULL RACING TAG HEUER', name='Daniel Ricciardo', roundTime=72.013}, KMH=Racer{company='HAAS FERRARI', name='Kevin Magnussen', roundTime=73.393}, SPF=Racer{company='FORCE INDIA MERCEDES', name='Sergio Perez', roundTime=72.848}, SVM=Racer{company='MCLAREN RENAULT', name='Stoffel Vandoorne', roundTime=72.463}, CLS=Racer{company='SAUBER FERRARI', name='Charles Leclerc', roundTime=72.829}, BHS=Racer{company='SCUDERIA TORO ROSSO HONDA', name='Brendon Hartley', roundTime=73.179}, LHM=Racer{company='MERCEDES', name='Lewis Hamilton', roundTime=72.46}, LSW=Racer{company='WILLIAMS MERCEDES', name='Lance Stroll', roundTime=73.323}, RGH=Racer{company='HAAS FERRARI', name='Romain Grosjean', roundTime=72.93}, FAM=Racer{company='MCLAREN RENAULT', name='Fernando Alonso', roundTime=72.657}, SSW=Racer{company='WILLIAMS MERCEDES', name='Sergey Sirotkin', roundTime=72.706}, NHR=Racer{company='RENAULT', name='Nico Hulkenberg', roundTime=73.065}, MES=Racer{company='SAUBER FERRARI', name='Marcus Ericsson', roundTime=73.265}, EOF=Racer{company='FORCE INDIA MERCEDES', name='Esteban Ocon', roundTime=73.028}, PGS=Racer{company='SCUDERIA TORO ROSSO HONDA', name='Pierre Gasly', roundTime=72.941}, KRF=Racer{company='FERRARI', name='Kimi Raikkonen', roundTime=72.639}}";
        assertEquals(excepted, formatter.creatingRacers("start.log","end.log", "abbreviations.txt").toString());
    }

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
