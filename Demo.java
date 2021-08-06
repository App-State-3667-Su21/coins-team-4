public class Demo {
    public static void main(String[] args) {
        Mint federalReserve = new usdMint();
        Mint canuckReserve = new CadMint();
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Select country (USD or CAD)");
        String country = kb.nextLine();
        while (!(country.equals("USD") || country.equals("CAD"))) {
            System.out.println("Not a valid country enter USD or CAD");
            country = kb.nextLine();
        }

        Coin coin = NullCoin.NULL;
        double denomination = 100.0;
        while (denomination != 0) {
            System.out.print("Enter the denomination for your coin (0 to quit): ");
            denomination = kb.nextDouble();
            if (denomination == 0) break;
            System.out.println();
            if (country.equals("USD")) {
                coin = federalReserve.makeCoin(denomination);
/*
		// NullCoin pattern should eliminate these null checks?!!
                if (!(coin.getCountryCode() == null)) {
                    federalReserve.manufactureCoin(coin);
                    federalReserve.afterManufacture();  
                }        
*/
            } else if (country.equals("CAD")) {
                coin = federalReserve.makeCoin(denomination);
/*
                if (!(coin.getCountryCode() == null)) {
                    canuckReserve.manufactureCoin(coin);
                    canuckReserve.afterManufacture();
                }
*/
            } else {
                System.out.println("Unknown mint requested. Use USD or CAD.");
            }
 	    System.out.println("Made a " + coin + " coin.");
        }
    }
}
