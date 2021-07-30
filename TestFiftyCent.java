// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestFiftyCent {
    @Test
        public void testConstructor() {
            FiftyCent d = new FiftyCent();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues() {
        FiftyCent d = new FiftyCent();
        String expectedCC = "CAD";
        String actualCC = d.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.50;
        double actualVal = d.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}
