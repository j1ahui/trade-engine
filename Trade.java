public class Trade {
    private String symbol;
    private int quantity;
    private double price;

    public Trade(String symbol, int quantity, double price) {       // constructor to intialise object state
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    @Override       // indicates a method in a subclass is intended to override a method from its superclass
    public String toString() {
        return "\nTRADE: " + quantity + "\t" + symbol + "\t @ $" + price;
    }
}