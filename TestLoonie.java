// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestLoonie {
    @Test
        public void testConstructor() {
        Loonie d = new Loonie();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues() {
        Loonie d = new Loonie();
        String expectedCC = "CAD";
        String actualCC = d.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 1.00;
        double actualVal = d.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}