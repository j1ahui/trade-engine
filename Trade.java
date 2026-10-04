public class Trade {
    String symbol;
    int quantity;
    double price;

    public Trade(String symbol, int quantity, double price) {       // constructor to intialise object state
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }
}