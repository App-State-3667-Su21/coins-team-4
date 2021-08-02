
// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestNullCoin {
    @Test
    public void testConstructor() {
        NullCoin nullCoin = NullCoin.NULL;
        assertTrue(true);
    }

    @Test
    public void testConstructorSetValues() {
        NullCoin nullCoin = NullCoin.NULL;
        String expectedCC = "None";
        String actualCC = nullCoin.getCountryCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.0;
        double actualVal = nullCoin.getValue();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}

