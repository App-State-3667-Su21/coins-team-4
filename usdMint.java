public class usdMint extends Mint {
    public Coin makeCoin(double denomination) {
        Coin coin = NullCoin.NULL;
        if (denomination == 0.01) {
            coin = new Penny();
        } else if (denomination == 0.05) {
            coin = new Nickel();
        } else if (denomination == 0.1) {
            coin = new Dime();
        } else if (denomination == 0.25) {
            coin = new Quarter();
        } else if (denomination == 0.5) {
            coin = new HalfDollar();
        } else if (denomination == 1) {
            coin = new Dollar();
        }

        coin.manufacture();        
        return coin;
    }
/*
    public void manufactureCoin(Coin coin) {
        System.out.println("Smelting coin."+coin);
    }

    public void afterManufacture() {
        System.out.println("Inspecting coin");
        System.out.println("Smoothing coin");
        System.out.println("Buffing coin");
        System.out.println();
    }
*/
}
