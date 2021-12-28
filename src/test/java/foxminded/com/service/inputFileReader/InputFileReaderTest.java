package foxminded.com.service.inputFileReader;

import static foxminded.com.service.inputFileReader.InputFileReader.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class InputFileReaderTest {

    @Test
    void process_shouldMatchResults_whenReadingFileEnd() throws IOException {
    String expected = "{VBM=72.434, SVF=243.332, CSR=268.095, DRR=924.067, KMH=244.396, SPF=793.883, SVM=1190.198, CLS=654.75, BHS=965.164, LHM=1172.585, LSW=446.834, RGH=387.441, FAM=857.169, SSW=1044.354, NHR=242.979, MES=358.778, EOF=1151.838, PGS=516.586, KRF=253.889}";
    assertEquals(expected, readingFileEnd("end.log").toString());
    }

    @Test
    void process_shouldMatchResults_whenReadingFileStart() throws IOException {
        String expected = "{VBM=0.0, SVF=178.917, CSR=195.145, DRR=852.054, KMH=171.003, SPF=721.035, SVM=1117.735, CLS=581.921, BHS=891.985, LHM=1100.125, LSW=373.511, RGH=314.511, FAM=784.512, SSW=971.648, NHR=169.914, MES=285.513, EOF=1078.81, PGS=443.645, KRF=181.25}";
        assertEquals(expected, readingFileStart("start.log").toString());
    }

    @Test
    void process_shouldMatchResults_whenReadingFileAbbreviations() throws IOException {
        String expected = "{VBM=Valtteri Bottas_MERCEDES, SVF=Sebastian Vettel_FERRARI, CSR=Carlos Sainz_RENAULT, DRR=Daniel Ricciardo_RED BULL RACING TAG HEUER, KMH=Kevin Magnussen_HAAS FERRARI, SPF=Sergio Perez_FORCE INDIA MERCEDES, SVM=Stoffel Vandoorne_MCLAREN RENAULT, CLS=Charles Leclerc_SAUBER FERRARI, BHS=Brendon Hartley_SCUDERIA TORO ROSSO HONDA, LHM=Lewis Hamilton_MERCEDES, LSW=Lance Stroll_WILLIAMS MERCEDES, RGH=Romain Grosjean_HAAS FERRARI, FAM=Fernando Alonso_MCLAREN RENAULT, SSW=Sergey Sirotkin_WILLIAMS MERCEDES, NHR=Nico Hulkenberg_RENAULT, MES=Marcus Ericsson_SAUBER FERRARI, EOF=Esteban Ocon_FORCE INDIA MERCEDES, PGS=Pierre Gasly_SCUDERIA TORO ROSSO HONDA, KRF=Kimi Raikkonen_FERRARI}";
        assertEquals(expected, readingFileAbbreviations("abbreviations.txt").toString());
    }

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
