/*
 * There MUST only be one usdMint object allowed!
 * So, deploying threadsafe eager Singleton pattern
 */

public class CadMint extends Mint {
    private static CadMint instance = new CadMint();
    public static CadMint getInstance() {
	return instance;
    }

    private CadMint() {
        this("Canada Mint", "Ottawa, Can.");
    }
    private CadMint(String name, String location) {
        super(name, location);
    }

    public Coin makeCoin(double denomination) {
        Coin coin = new fakeCoin();
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

        System.out.println(coin);
        System.out.println("Inspecting coin");
        System.out.println("Smoothing coin");
        System.out.println("Buffing coin");
        System.out.println();
        return coin;
    }
}
