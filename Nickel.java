public class Nickel extends Coin {
    public Nickel(){
        super("USD", 0.05);
    }
    public String toString() {
        return "Smelting coin. Nickels are smelted with 75% Cu and 25% Ni.";
    }
}
