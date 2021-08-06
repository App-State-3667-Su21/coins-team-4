
// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestNickel {
    @Test
        public void testConstructor() {
        Nickel d = new Nickel();
        assertTrue(true);
    }
    @Test
        public void testConstructorSetValues() {
        Nickel d = new Nickel();
        String expectedCC = "USD";
        String actualCC = d.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.05;
        double actualVal = d.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}
