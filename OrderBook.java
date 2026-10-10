import java.util.Iterator;

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
        Iterator<Order> buyIterator = buyOrders.iterator();

        while (buyIterator.hasNext()) {
            Order buyOrder = buyIterator.next();

            Iterator<Order> sellIterator = sellOrders.iterator();

            while (sellIterator.hasNext()) {
                Order sellOrder = sellIterator.next();

                if (buyOrder.getSymbol().equals(sellOrder.getSymbol()) && buyOrder.getPrice() >= sellOrder.getPrice()) {

                    int tradeQuantity = Math.min(buyOrder.getQuantity(), sellOrder.getQuantity());

                    Trade trade = new Trade(buyOrder.getSymbol(), tradeQuantity, sellOrder.getPrice());

                    System.out.println(trade);

                    buyOrder.setQuantity(buyOrder.getQuantity() - tradeQuantity);
                    sellOrder.setQuantity(sellOrder.getQuantity() - tradeQuantity);

                    System.out.println("\nMATCH FOUND: ");
                    System.out.println(buyOrder);
                    System.out.println(sellOrder);

                    if (sellOrder.getQuantity() == 0) {
                        sellIterator.remove();
                    }

                    if (buyOrder.getQuantity() == 0) {
                        buyIterator.remove();
                        break;
                    }


                }
            }
        }
    }
}

