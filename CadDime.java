public class CadDime extends Coin {
    public CadDime() {
        super("CAD", 0.10);
        setSmelter(new UnknownSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a CAD dime...");
    }
    public String toString() {
        return " "+getCountryCode()+" Dime";
    }
}
