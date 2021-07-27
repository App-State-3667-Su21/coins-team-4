public class usdMint extends Mint {
    public Coin makeCoin(double denomination) {
        Coin coin = new fakeCoin();
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

        System.out.println(coin);
        System.out.println("Inspecting coin");
        System.out.println("Smoothing coin");
        System.out.println("Buffing coin");
        return coin;
    }
}
