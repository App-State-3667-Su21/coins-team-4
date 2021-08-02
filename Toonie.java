public class Toonie extends Coin {
    public Toonie(){
        super("CAD", 2.00);
        setSmelter(new UnknownSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a CAD Toonie...");
    }
    public String toString() {
        return " "+getCountryCode()+" Toonie";
    }
}
