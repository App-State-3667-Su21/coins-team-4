public class FiftyCent extends Coin {
    public FiftyCent(){
        super("CAD", 0.50);
        setSmelter(new UnknownSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a CAD fifty cent coin...");
    }
    public String toString() {
        return " "+getCountryCode()+" Fifty Cent";
    }
}
