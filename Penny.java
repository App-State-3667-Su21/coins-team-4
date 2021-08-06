public class Penny extends Coin {
    public Penny() {
	super("USD", 0.01);
        setSmelter(new UsdPennySmelter());
    }
    public void imprint() { 
        System.out.println("Imprinting a USD penny...");
    }
    public String toString() {
        return " "+getCountryCode()+" Penny";
    }
}
