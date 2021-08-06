public class CadQuarter extends Coin {
    public CadQuarter(){
        super("CAD", 0.25);
        setSmelter(new UnknownSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a CAD quarter...");
    }
    public String toString() {
        return " "+getCountryCode()+" Quarter";
    }
}
