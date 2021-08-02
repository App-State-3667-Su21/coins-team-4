public class Loonie extends Coin {
    public Loonie(){
        super("CAD", 1.00);
        setSmelter(new UnknownSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a CAD Loonie...");
    }
    public String toString() {
        return " "+getCountryCode()+" Loonie";
    }
}
