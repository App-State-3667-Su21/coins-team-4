public class Quarter extends Coin {
    public Quarter(){
        super("USD", 0.25);
    }
    public String toString() {
        return "Smelting coin. "+getCountryCode()+" Quarters are smelted with 91.67% Cu and 8.33% Ni.";
    }
}
