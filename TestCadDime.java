// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCadDime {
    @Test
        public void testConstructor() {
        CadDime d = new CadDime();
        assertTrue(true);
    }
    @Test
        public void testConstructorSetValues() {
        CadDime d = new CadDime();
        String expectedCC = "CAD";
        String actualCC = d.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.10;
        double actualVal = d.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}