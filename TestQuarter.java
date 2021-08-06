
// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestQuarter {
    @Test
        public void testConstructor() {
        Quarter d = new Quarter();
        assertTrue(true);
    }
    @Test
        public void testConstructorSetValues() {
        Quarter d = new Quarter();
        String expectedCC = "USD";
        String actualCC = d.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.25;
        double actualVal = d.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}
