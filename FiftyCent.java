public class FiftyCent extends Coin {
    public FiftyCent(){
        super("CAD", 0.50);
    }
    public String toString() {
        return "Smelting coin. "+getCountryCode()+" Fifty Cent are smelted with 93.15% steel, 4.75% Cu, 2.1% Ni plating";
    }
}