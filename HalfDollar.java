public class HalfDollar extends Coin {
    public HalfDollar(){
        super("USD", 0.50);
        setSmelter(new UsdDQHSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a USD half dollar...");
    }
    public String toString() {
        return " "+getCountryCode()+" Half Dollar";
    }
}
