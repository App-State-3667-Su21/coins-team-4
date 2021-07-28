

// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestCoin {

    @Test
    public void TestParameterLessConstructor() {
	MockCoin mockCoin = new MockCoin();
	// if make it here then believing it
	// worked! Will test field values separately 
	// to ensure proper setting.
	assertTrue(true);
    }

    @Test
    public void TestParameterLessConstructorValues() {
	MockCoin mockCoin = new MockCoin();
	String actualValue = mockCoin.toString();
	String expectedValue = "[Coin: countryCode="
	    + "Unspecified"
	    + ",value="
	    + "0.0"
	    + "]";

	assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestParameteriedConstructor() {
	MockCoin mockCoin = new MockCoin("Costa Rica", 0.35);
	// if make it here then believing it
	// worked! Will test toString to ensure
	// field values.
	assertTrue(true);
    }

    @Test
    public void TestParameterizedConstructorValues() {
	MockCoin mockCoin = new MockCoin("Costa Rica", 0.35);
	String actualValue = mockCoin.toString();
	String expectedValue = "[Coin: countryCode="
	    + "Costa Rica"
	    + ",value="
	    + 0.35
	    + "]";

	assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestGetCountryCode() {
	MockCoin mockCoin = new MockCoin("Costa Rica", 0.35);
	String expectedValue = "Costa Rica";
	String actualValue = mockCoin.getCountryCode();
	assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TestGetValue() {
	MockCoin mockCoin = new MockCoin("Costa Rica", 0.35);
	double expectedValue = 0.35;
	double actualValue = mockCoin.getValue();

	// representing doubles is tricky (remember 1100, 2450, 3481 lectures
	// on IEEE 754 format), so comparing them is equally tricky
	// JUnit allows an "error tolerance delta" when comparing doubles!!
	assertEquals(expectedValue, actualValue, 0.00001);
    }
}

// Coin is abstract so to test it I need 
// a concrete subclass
class MockCoin extends Coin {
    public MockCoin() {
	super();
    }
    public MockCoin(String cc, double v) {
	super(cc, v);
    }
    public String toString() {
	return "[Coin: countryCode="
	    + getCountryCode()
	    + ",value="
	    + getValue()
	    + "]";
    }
}
