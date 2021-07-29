// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestDollar {
    @Test
        public void testConstructor() {
        Dollar doll = new Dollar();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues() {
        Dollar doll = new Dollar();
        String expectedCC = "USD";
        String actualCC = doll.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 1.00;
        double actualVal = doll.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}
