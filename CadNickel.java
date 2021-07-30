public class CadNickel extends Coin {
    public CadNickel(){
        super("CAD", 0.05);
    }
    public String toString() {
        return "Smelting coin. "+getCountryCode()+" Nickels are smelted 94.5% steel, 3.5% Cu, 2% Ni plating.";
    }