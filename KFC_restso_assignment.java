package demo;

import java.util.*;

// Interface
interface Restaurant {
    void printName();
    void addItem(Item item);
    Item[] getMenu();
    Order placeOrder(int[] itemIds);
    double generateBill(int orderId);
}

// Item Bean
class Item {
    private int id;
    private String name;
    private double price;

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

// Order Bean
class Order {
    private int orderId;
    private Item[] items;

    public Order(int orderId, Item[] items) {
        this.orderId = orderId;
        this.items = items;
    }

    public int getOrderId() { return orderId; }
    public Item[] getItems() { return items; }
}

// KFC Implementation
class KFC implements Restaurant {
    private List<Item> menu = new ArrayList<>();
    private Map<Integer, Order> orders = new HashMap<>();
    private int orderCounter = 1;

    public void printName() {
        System.out.println("Welcome to KFC");
    }

    public void addItem(Item item) {
        menu.add(item);
    }

    public Item[] getMenu() {
        return menu.toArray(new Item[0]);
    }

    public Order placeOrder(int[] itemIds) {
        List<Item> selectedItems = new ArrayList<>();
        for (int id : itemIds) {
            for (Item item : menu) {
                if (item.getId() == id) {
                    selectedItems.add(item);
                }
            }
        }
        Order order = new Order(orderCounter, selectedItems.toArray(new Item[0]));
        orders.put(orderCounter, order);
        orderCounter++;
        return order;
    }

    
    public double generateBill(int orderId) {
        Order order = orders.get(orderId);
        if (order == null) return 0;
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total * 1.06; // 6% tax
    }
}

// Main Method
public class overall {
    public static void main(String[] args) {
        KFC kfc = new KFC();
        kfc.printName();

        // Add items to menu
        kfc.addItem(new Item(101, "Biryani", 250));
        kfc.addItem(new Item(102, "Halva", 120));
        kfc.addItem(new Item(103, "Cooldrink", 50));
        kfc.addItem(new Item(104, "Chai", 25));

        // Display menu
        System.out.println("\nMenu:");
        for (Item item : kfc.getMenu()) {
            System.out.println(item.getId() + " - " + item.getName() + ": ₹" + item.getPrice());
        }

        // Place an order
        Order order = kfc.placeOrder(new int[]{101, 102});
        System.out.println("\nOrder ID: " + order.getOrderId());

        // Generate bill
        double bill = kfc.generateBill(order.getOrderId());
        System.out.println("Total Bill (with 6% tax): ₹" + bill);
    }
}
