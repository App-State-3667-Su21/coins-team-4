// I need a Mint class to test it.

// No specific specs for what attributes might be in a Mint.

public abstract class Mint {
    private String name;
    private String location;

    public Mint(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Mint() {
        this("NoName", "NoLocation");
    }

    // I LOVE LOVE LOVE overriding this so println works!
    public String toString() {
	return "[Mint: name="+name+",location="+location+"]";
    }

    public abstract Coin makeCoin(double denomination);
}
