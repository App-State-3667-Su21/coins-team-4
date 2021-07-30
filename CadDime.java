public class CadDime extends Coin {
    public CadDime() {
        super("CAD", 0.10);
    }
    public String toString() {
        return " "+getCountryCode()+" Dimes are smelted 92% steel, 5.5% Cu, 2.5% Ni plating.";
    }
}