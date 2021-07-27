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

    public String toString() {
        return "[Mint: name="+name+",location="+location+"]";
    }

    public Coin makeCoin(double denomination);
}
