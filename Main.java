public class Main {
    public static void main(String[] args) {

        OrderBook orderBook = new OrderBook();

        Order buyOrder = new Order("AAPL", "BUY", 10, 150.00);
        Order sellOrder = new Order("AAPL", "SELL", 5, 150.00);

        orderBook.addOrder(buyOrder);
        orderBook.addOrder(sellOrder);

        orderBook.printOrders();
        orderBook.matchOrders();
    }
}