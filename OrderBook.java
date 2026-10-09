import java.util.ArrayList;
import java.util.List;

public class OrderBook {
    private List<Order> buyOrders;          // private = can only directly accessed from inside OrderBook class
    private List<Order> sellOrders;         // declaring varibale. holds Order objects

    public OrderBook() {                    // constructor
        buyOrders = new ArrayList<>();
        sellOrders = new ArrayList<>();
    }

    public void addOrder(Order order) {     // public = method can be accessed from outside class
        if (order.getSide().equals("BUY")) {
            buyOrders.add(order);
        } else {
            sellOrders.add(order);
        }
    }

    public void printOrders() {
        System.out.println("BUY ORDERS: ");
        for (Order order : buyOrders) {         // for order in buyOrders
            System.out.println(order);
        }

        System.out.println("\nSELL ORDERS: ");
        for (Order order : sellOrders) {
            System.out.println(order);
        }
    }

    public void matchOrders() {
        for (Order buyOrder : buyOrders) {
            for (Order sellOrder : sellOrders) {
                if (buyOrder.getPrice() >= sellOrder.getPrice()) {

                    int tradeQuantity = Math.min(buyOrder.getQuantity(), sellOrder.getQuantity());          // partial fill. e.g buyer wanted 10, 5 only available

                    Trade trade = new Trade(buyOrder.getSymbol(), tradeQuantity, sellOrder.getPrice());

                    System.out.println(trade);

                    buyOrder.setQuantity(buyOrder.getQuantity() - tradeQuantity);
                    sellOrder.setQuantity(sellOrder.getQuantity() - tradeQuantity);

                    System.out.println("\nMATCH FOUND: ");
                    System.out.println(buyOrder);
                    System.out.println(sellOrder);

                    return;
                }
            }
        }
    }

}