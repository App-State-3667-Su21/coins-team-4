public class Dollar extends Coin {
    public Dollar(){
        super("USD", 1.00);
        setSmelter(new UsdDollarSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a USD dollar...");
    }
    public String toString() {
        return " "+getCountryCode()+" Dollar";
    }
}
