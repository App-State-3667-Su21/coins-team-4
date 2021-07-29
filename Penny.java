public class Penny extends Coin {
    public Penny() {
	    super("USD", 0.01);
    }
    public String toString() {
        return "Smelting coin. "+getCountryCode()+" Pennies are smelted with 2.5% Cu and 97.5% Zn.";
    }
}
