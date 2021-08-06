public class Nickel extends Coin {
    public Nickel(){
        super("USD", 0.05);
        setSmelter(new UsdNickelSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a USD nickel...");
    }
    public String toString() {
        return " "+getCountryCode()+" Nickel";
    }
}
