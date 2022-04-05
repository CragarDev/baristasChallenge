import java.util.ArrayList;

public class Order {

    // order attributes / member variables
    private String name;
    private boolean ready = false;
    private ArrayList<Item> items; // must initiate an ArrayList...???
    // private ArrayList<Item> item = new ArrayList<Item>(); // must initiate an
    // ArrayList...???

    // Empty Constructor ---
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
        ready = false;
    }

    // Name Constructor ---
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
        ready = false;

    }

    // getters and setters

    // Name get and set
    // getter
    public String getCustomerName() {
        return name;
    }

    // setter
    public void setCustomerName(String customerName) {
        this.name = customerName;
    }

    // Ready get and set
    // getter
    public boolean getOrderIsReady() {
        return ready;
    }

    // setter
    public void setOrderIsReady(boolean isReady) {
        this.ready = isReady;
    }

    // Items get and set

    // getter
    public void getItems() {
        for (Item item : items) {
            String itemName = item.getName();
            double itemPrice = item.getPrice();
            System.out.printf("item: %s -- $%.2f%n", itemName, itemPrice);
        }
    }

    // setter for items will be and add item
    public void addItem(Item item) {
        items.add(item);
        double price = item.getPrice();
    }

    // Create a method called getStatusMessage that returns a String message.
    // If the order is ready, return "Your order is ready.",
    // if not, return "Thank you for waiting. Your order will be ready soon."

    public String getStatusMessage() {
        // System.out.println("---TEST---");
        // System.out.println(name);
        // System.out.println(ready);

        if (ready == true) {
            String isReady = String.format("%s, Your order is ready!", name);
            return isReady;

        } else {
            String notReady = String.format("Thank you for waiting %s.\nYour order will be ready soon!", name);
            return notReady;
        }

    }

    public void displayOrders() {
        System.out.println("");
        System.out.printf("---- Order for %s -------\n", name);
        this.getItems();
    }

    // get the total price of the items in the list
    public String getTotalPrice() {
        double totalPrice = 0;
        this.displayOrders();
        for (Item item : items) {
            double itemPrice = item.getPrice();
            // System.out.println(itemPrice);
            // System.out.println(totalPrice);
            totalPrice += itemPrice;
        }
        System.out.println("-----------");
        String priceTotal = String.format("Total price is: $%.2f%n", totalPrice);
        return priceTotal;
    }

    // Plain ole greeting - starter for testing
    public void Starter() {
        System.out.println("");
        System.out.println("Hello, How are you? - I am an Order");
        System.out.println("");
    }
}