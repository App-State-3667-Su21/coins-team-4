
/* 
 * JUnit5 test class for Mint class
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestMint {
    @Test
    public void TestParameterLessConstructor() {
	MockMint mockMint = new MockMint();
	// if make it here then believing it
	// worked! Will test toString to ensure
	// field values.
	assertTrue(true);
    }

    @Test
    public void TestParameterLessConstructorValues() {
	MockMint mockMint = new MockMint();
	String actualValue = mockMint.toString();
	String expectedValue = "[Mint: name="
	    + "NoName"
	    + ",location="
	    + "NoLocation"
	    + "]";

	assertEquals(expectedValue, actualValue);
    }
}

// Mint is abstract so to test it I need 
// a concrete subclass
class MockMint extends Mint {
    // Not adding anything, my job is
    // to provide a way to get to the
    // inherited items.
}
