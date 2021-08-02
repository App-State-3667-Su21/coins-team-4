
public class NullCoin extends Coin {
    // use: NullCoin.NULL
    public static final NullCoin NULL = new NullCoin();

    // Use the singleton NullCoin object above
    private NullCoin() {
        super("None", 0);
    }

    public void smelt() { }
    public void imprint() { }
    public void inspect() { } 
    public void smooth() { } 
    public void buff() { } 
}
