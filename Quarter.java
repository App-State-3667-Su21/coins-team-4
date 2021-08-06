public class Quarter extends Coin {
    public Quarter(){
        super("USD", 0.25);
        setSmelter(new UsdDQHSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a USD quarter...");
    }
    public String toString() {
        return " "+getCountryCode()+" Quarter";
    }
}
