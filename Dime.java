public class Dime extends Coin {
    public Dime() {
        super("USD", 0.10);
    }
    public String toString() {
        return "Smelting coin. "+getCountryCode()+" Dimes are smelted with 91.67% Cu and 8.33% Ni.";
    }
}
