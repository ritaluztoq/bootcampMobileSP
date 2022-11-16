import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge1Test {
    @Test
    @DisplayName("Generates a 10-digit random number as a string")
    void randomNumbers() {
        assertNotNull(Challenge1.randomNumbers("TipoA"));
        assertNotNull(Challenge1.randomNumbers("TipoB"));
        assertEquals(10, Challenge1.randomNumbers("TipoA").length());
        assertEquals(10, Challenge1.randomNumbers("TipoB").length());
        assertEquals("54", Challenge1.randomNumbers("TipoA").substring(0, 2));
        assertEquals("08", Challenge1.randomNumbers("TipoB").substring(0, 2));
        assertTrue(Challenge1.randomNumbers("TipoA").matches("^\\d+$"));
        assertTrue(Challenge1.randomNumbers("TipoB").matches("^\\d+$"));
    }

    @Test
    @DisplayName("Sort a number list")
    void sortNumbers() {
        int[] numbers = {8,0,43,6,4,2,23,10};
        int[] asc = {0,2,4,6,8,10,23,43};
        int[] desc = {43,23,10,8,6,4,2,0};
        assertArrayEquals(asc, Challenge1.sortNumbers(numbers, "Asc"));
        assertArrayEquals(desc, Challenge1.sortNumbers(numbers, "Desc"));
    }
}