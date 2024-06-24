package com.codegnan.threads.challenge;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

class Order implements Comparable<Order> {
    enum Type { BUY, SELL }
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private final Type type;
    private final String stock;
    private final double price;
    private final int quantity;

    public Order(Type type, String stock, double price, int quantity) {
        this.id = count.incrementAndGet();
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public Type getType() { return type; }
    public String getStock() { return stock; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    @Override
    public int compareTo(Order other) {
        if (this.price == other.price) {
            return this.id - other.id; // FIFO within the same price level
        }
        return this.type == Type.BUY ? Double.compare(other.price, this.price) : Double.compare(this.price, other.price);
    }
}

class OrderBook {
    private final BlockingQueue<Order> buyOrders = new PriorityBlockingQueue<>();
    private final BlockingQueue<Order> sellOrders = new PriorityBlockingQueue<>();

    public synchronized void addOrder(Order order) {
        if (order.getType() == Order.Type.BUY) {
            buyOrders.add(order);
        } else {
            sellOrders.add(order);
        }
        matchOrders();
    }

    private void matchOrders() {
        while (!buyOrders.isEmpty() && !sellOrders.isEmpty()) {
            Order buyOrder = buyOrders.peek();
            Order sellOrder = sellOrders.peek();
            if (buyOrder.getPrice() >= sellOrder.getPrice()) {
                int quantity = Math.min(buyOrder.getQuantity(), sellOrder.getQuantity());
                System.out.println("Trade executed: " + quantity + " shares at $" + sellOrder.getPrice());
                buyOrders.poll();
                sellOrders.poll();
                // Handle remaining quantity if any
                if (buyOrder.getQuantity() > quantity) {
                    buyOrders.add(new Order(Order.Type.BUY, buyOrder.getStock(), buyOrder.getPrice(), buyOrder.getQuantity() - quantity));
                }
                if (sellOrder.getQuantity() > quantity) {
                    sellOrders.add(new Order(Order.Type.SELL, sellOrder.getStock(), sellOrder.getPrice(), sellOrder.getQuantity() - quantity));
                }
            } else {
                break;
            }
        }
    }
}

class Trader implements Runnable {
    private final OrderBook orderBook;
    private final String stock;
    private final boolean isBuying;

    public Trader(OrderBook orderBook, String stock, boolean isBuying) {
        this.orderBook = orderBook;
        this.stock = stock;
        this.isBuying = isBuying;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            double price = 100 + Math.random() * 10;
            int quantity = (int) (1 + Math.random() * 100);
            Order order = new Order(isBuying ? Order.Type.BUY : Order.Type.SELL, stock, price, quantity);
            orderBook.addOrder(order);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class StockMarketSimulator {
    public static void main(String[] args) {
        OrderBook orderBook = new OrderBook();
        Thread trader1 = new Thread(new Trader(orderBook, "AAPL", true));
        Thread trader2 = new Thread(new Trader(orderBook, "AAPL", false));

        trader1.start();
        trader2.start();

        try {
            trader1.join();
            trader2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
