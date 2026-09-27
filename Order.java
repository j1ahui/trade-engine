public class Order {
    String symbol;
    String side;
    int quantity;
    double price;

    public Order(String symbol, String side, int quantity, double price) {
        this.symbol = symbol;
        this.side = side;
        this.quantity = quantity;
        this.price = price;
    }
}
