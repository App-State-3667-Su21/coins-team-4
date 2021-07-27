<<<<<<< HEAD
class UsdMint extends Mint{
    
}
=======
public class usdMint extends Mint {
    public Coin makeCoin(double denomination) {
        Coin coin;
        switch (denomination) {
            case 0.01:
                coin = new Penny();
                break;
            case 0.05:
                coin = new Nickel();
                break;
            case 0.1:
                coin = new Dime();
                break;
            case 0.25:
                coin = new Quarter();
                break;
            case 0.5:
                coin = new halfDollar();
                break;
            case 1:
                coin = new dollarCoin();
                break;
            default:
                break;
        }
        System.out.println("Inspecting coin");
        System.out.println("Smoothing coin");
        System.out.println("Buffing coin");
        return coin;
    }
}:w
>>>>>>> 0e1a4768f169f4a324db48555a3d18e16c075dc1
