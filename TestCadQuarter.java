// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCadQuarter {
    @Test
        public void testConstructor() {
        CadQuarter d = new CadQuarter();
        assertTrue(true);
    }
    @Test
        public void testConstructorSetValues() {
        CadQuarter d = new CadQuarter();
        String expectedCC = "CAD";
        String actualCC = d.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.25;
        double actualVal = d.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}