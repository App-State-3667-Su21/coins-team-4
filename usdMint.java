/*
 * There MUST only be one usdMint object allowed!
 * So, deploying threadsafe eager Singleton pattern
 */

public class usdMint extends Mint {

    private static usdMint instance = new usdMint();
    public static usdMint getInstance() {
	return instance;
    }

    private usdMint() {
        this("UsdMint", "Washington D.C.");
    }
    private usdMint(String name, String location) {
        super(name, location);
    }

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
        System.out.println();
        return coin;
    }
}
