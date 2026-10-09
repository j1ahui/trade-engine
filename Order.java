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

    public String getSide() {
        return side;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return side + "\t" + symbol + "\t" + quantity + "\t@ $" + price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
