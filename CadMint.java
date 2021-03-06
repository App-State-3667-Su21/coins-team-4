public class CadMint extends Mint {
    public Coin makeCoin(double denomination) {
        Coin coin = NullCoin.NULL;
        if (denomination == 0.05) {
            coin = new CadNickel();
        } else if (denomination == 0.10) {
            coin = new CadDime();
        } else if (denomination == 0.25) {
            coin = new CadQuarter();
        } else if (denomination == 0.50) {
            coin = new FiftyCent();
        } else if (denomination == 1) {
            coin = new Loonie();
        } else if (denomination == 2) {
            coin = new Toonie();
        }
        
        return coin;
    }

    public void manufactureCoin(Coin coin) {
        System.out.println("Smelting coin."+coin);
    }

    public void afterManufacture() {
        System.out.println("Inspecting coin");
        System.out.println("Smoothing coin");
        System.out.println("Buffing coin");
        System.out.println();
    }
}
