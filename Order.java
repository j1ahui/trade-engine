public class Order {
    String symbol;
    String side;
    int quantity;
    double price;

    public Order(String symbol, String side, int quantity, double price) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");     // IllegalArgumentException = java exception class. therefore, this creates an exception object
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");       // throw = throws the exception
        }

        if (!side.equals("BUY") && !side.equals("SELL")) {
            throw new IllegalArgumentException("Side must be BUY or SELL");     // new IllegalArgumentException() calls its constructor to craete object
        }

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
