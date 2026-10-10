public class Main {
    public static void main(String[] args) {
        testBuyHasRemaining();
        testSellHasRemaining();
        testNoTrade();
    }

    public static void testBuyHasRemaining() {
        System.out.println("\n Test 1: Buy has remaining");

        OrderBook orderBook = new OrderBook();

        Order buyOrder = new Order("AAPL", "BUY", 10, 150.00);
        Order sellOrder = new Order("AAPL", "SELL", 5, 150.00);

        orderBook.addOrder(buyOrder);
        orderBook.addOrder(sellOrder);

        orderBook.printOrders();
        orderBook.matchOrders();

    }

    public static void testSellHasRemaining() {
        System.out.println("\nTest 2: Sell has remaining");

        OrderBook orderBook = new OrderBook();

        Order buyOrder = new Order("AAPL", "BUY", 5, 150.00);
        Order sellOrder = new Order("AAPL", "SELL", 10, 150.00);

        orderBook.addOrder(buyOrder);
        orderBook.addOrder(sellOrder);

        orderBook.printOrders();
        orderBook.matchOrders();
    }

    public static void testNoTrade() {
        System.out.println("\nTest 3: No trade");

        OrderBook orderBook = new OrderBook();

        Order buyOrder = new Order("AAPL", "BUY", 10, 150.00);
        Order sellOrder = new Order("AAPL", "SELL", 10, 155.00);

        orderBook.addOrder(buyOrder);
        orderBook.addOrder(sellOrder);

        orderBook.printOrders();
        orderBook.matchOrders();
    }



}

