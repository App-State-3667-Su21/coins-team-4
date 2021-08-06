// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestToonie {
    @Test
        public void testConstructor() {
        Toonie d = new Toonie();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues() {
        Toonie d = new Toonie();
        String expectedCC = "CAD";
        String actualCC = d.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 2.00;
        double actualVal = d.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}