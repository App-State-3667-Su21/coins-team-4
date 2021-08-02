public class CadNickel extends Coin {
    public CadNickel(){
        super("CAD", 0.05);
        setSmelter(new UnknownSmelter());
    }
    public void imprint() {
        System.out.println("Imprinting a CAD nickel...");
    }
    public String toString() {
        return " "+getCountryCode()+" Nickel";
    }
}
