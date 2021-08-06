// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCadNickel {
    @Test
        public void testConstructor() {
        CadNickel n = new CadNickel();
        assertTrue(true);
    }
    @Test
        public void testConstructorSetValues() {
        CadNickel n = new CadNickel();
        String expectedCC = "CAD";
        String actualCC = n.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.05;
        double actualVal = n.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}