public class Dime extends Coin {
    public Dime() {
        super("USD", 0.10);
        setSmelter(new UsdDQHSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a USD dime...");
    }
    public String toString() {
        return " "+getCountryCode()+" Dime";
    }
}
