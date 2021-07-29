public class Demo {
    public static void main(String[] args) {
        Mint federalReserve = new usdMint();
        java.util.Scanner kb = new java.util.Scanner(System.in);
        double denomination = 100.0;
        while (denomination != 0) {
            System.out.print("Enter the denomination for your coin (0 to quit): ");
            denomination = kb.nextDouble();
            if (denomination == 0) break;
            System.out.println();
            federalReserve.makeCoin(denomination);
        }
    }
}