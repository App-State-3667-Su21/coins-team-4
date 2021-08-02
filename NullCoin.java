
public class NullCoin extends Coin {
    // use: NullCoin.NULL
    public static final NullCoin NULL = new NullCoin();

    // Use the singleton NullCoin object above
    private NullCoin() {
        super("None", 0);
    }
}
