public class CadQuarter extends Coin {
    public CadQuarter(){
        super("CAD", 0.25);
    }
    public String toString() {
        return " "+getCountryCode()+" Quarters are smelted 94% steel, 3.8% Cu, 2.2% Ni plating.";
    }
}