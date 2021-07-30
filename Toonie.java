public class Toonie extends Coin {
    public Toonie(){
        super("CAD", 2.00);
    }
    public String toString() {
        return " "+getCountryCode()+" Toonie Coins are smelted with 99% Ni on the outer core and 92% Cu, 6% Al, 2% Ni on the inner core.";
    }
}