public abstract class Coin {

    // Common attriutes shared by all coins.
    // Subclasses provide details.
    private double value;
    private String countryCode; // one of: USD, GBP, EUR, CAD
    private Smelter myCoinSmelter;

    public Coin(String cc, double v) {
	this.countryCode = cc;
	this.value = v;
        this.myCoinSmelter = null;
    }
    public Coin() {
	this("Unspecified", 0.0);
    }
    
    // Simple field accessors
    public double getValue() { return value; }
    public String getCountryCode() { return countryCode; }

    // Simple field mutators
    // can't change value, countryCode of a coin!! (Can make a different coin!)
    public void setSmelter(Smelter smelter) {
        myCoinSmelter = smelter;
    }

    // Common coin methods
    
}



