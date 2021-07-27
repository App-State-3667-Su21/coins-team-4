<<<<<<< HEAD
class UsdMint extends Mint{
    
}
=======
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
<<<<<<< HEAD
}:w
>>>>>>> 0e1a4768f169f4a324db48555a3d18e16c075dc1
=======
}
>>>>>>> 650d7a495965b2094a0e2862bac16bd591e71b2f
