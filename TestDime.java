
// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestDime {
    @Test
        public void testConstructor() {
        Dime d = new Dime();
        assertTrue(true);
    }
    @Test
        public void testConstructorSetValues() {
        Dime d = new Dime();
        String expectedCC = "USD";
        String actualCC = d.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.10;
        double actualVal = d.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}
