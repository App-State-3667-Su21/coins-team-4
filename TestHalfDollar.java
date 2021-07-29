// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestHalfDollar {
    @Test
        public void testConstructor() {
        HalfDollar half = new HalfDollar();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues() {
        HalfDollar half = new HalfDollar();
        String expectedCC = "USD";
        String actualCC = half.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.50;
        double actualVal = half.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}
