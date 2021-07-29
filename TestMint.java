
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
    @Test
    public void TestParameteriedConstructor() {
	MockMint mockMint = new MockMint("U.S.Treasury", "Washington D.C.");
	// if make it here then believing it
	// worked! Will test toString to ensure
	// field values.
	assertTrue(true);
    }

    @Test
    public void TestParameterizedConstructorValues() {
	MockMint mockMint = new MockMint("U.S.Treasury", "Washington D.C.");
	String actualValue = mockMint.toString();
	String expectedValue = "[Mint: name="
	    + "U.S.Treasury"
	    + ",location="
	    + "Washington D.C."
	    + "]";

	assertEquals(expectedValue, actualValue);
    }
}

// Mint is abstract so to test it I need 
// a concrete subclass
class MockMint extends Mint {
    public MockMint() {
	super();
    }
    public MockMint(String nam, String loc) {
	super(nam, loc);
    }
	public Coin makeCoin(double denomination) {return null;}
}