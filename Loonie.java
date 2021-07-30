public class Loonie extends Coin {
    public Loonie(){
        super("CAD", 1.00);
    }
    public String toString() {
        return " "+getCountryCode()+" Loonie Coins are smelted with 91.5% Ni, 8.5% bronze plating";
    }
}