
/* 
 * JUnit5 test class for Coin class
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestPenny {
    @Test
    public void testConstructor() {
	Penny p = new Penny();
	assertTrue(true);
    }

    @Test
    public void testConstructorSetValues() {
	Penny p = new Penny();
	String expectedCC = "USD";
	String actualCC = p.getCountryCode();
	assertEquals(expectedCC, actualCC);

	double expectedVal = 0.01;
	double actualVal = p.getValue();
	assertEquals(expectedVal, actualVal, 0.00001);
    }
}
