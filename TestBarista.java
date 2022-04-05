public class TestBarista {

    // Implement the Order and Item classes as described above
    // Create a testing file to complete the test cases for each method.
    // Create a testing file to complete the test cases for each method.

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("====== Starting TestBarista main ======");
        System.out.println("");

        // Testing item run
        Item item1 = new Item();
        Item item2 = new Item("Latte", 4.50);
        Item item3 = new Item("Cappuccino", 8.95);
        Item item4 = new Item("White mocha", 12.50);
        // item1.Starter();
        System.out.println("== xxx ==> ");
        System.out.println("== item1.getName ==> " + item1.getName());
        System.out.println("== item1.getPrice ==> " + item1.getPrice());
        System.out.println("========================");

        // Testing order run
        Order order1 = new Order();
        Order order2 = new Order();
        // order1.Starter();
        System.out.println("");

        // Create 2 orders for unspecified guests (without specifying a name);
        Order order3 = new Order();
        Order order4 = new Order();
        Order order5 = new Order("Brandi");
        Order order6 = new Order("Johnny");
        Order order7 = new Order("Janice");

        System.out.println("== order1.getCustomerName ==> " + order1.getCustomerName());
        order1.setCustomerName("Craig");
        System.out.println("== order1.getCustomerName ==> " + order1.getCustomerName());
        System.out.println("== order1.getOrderIsReady ==> " + order1.getOrderIsReady());
        System.out.println("== order1.getStatusMessage ==> " + order1.getStatusMessage());
        order1.setOrderIsReady(true);
        System.out.println("== order1.getOrderIsReady ==> " + order1.getOrderIsReady());
        System.out.println("== order1.getStatusMessage ==> " + order1.getStatusMessage());
        System.out.println("========================");

        // Implement the addItem method within the Order class
        order1.addItem(item1);
        order1.addItem(item2);
        order1.addItem(item3);
        order1.addItem(item4);

        // Add at least 2 items to each of the orders using the addItem method you
        // wrote,
        // for example, to add item1 to order3 you would need to call the addItem method
        // from the order3 instance like so: order3.addItem(item1);
        order2.addItem(item1);
        order2.addItem(item2);
        order2.addItem(item3);
        order3.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item2);
        order4.addItem(item3);
        order4.addItem(item4);
        order4.addItem(item1);
        order5.addItem(item2);
        order5.addItem(item3);
        order5.addItem(item4);
        order6.addItem(item1);
        order6.addItem(item2);
        order6.addItem(item3);

        // Implement the getStatusMessage method within the Order class
        // Test your getStatusMessage functionality by setting some orders to ready and
        // printing the messages for each order.
        // For example: order2.setReady(true);
        // System.out.println(order2.getStatusMessage());
        order2.setOrderIsReady(true);
        System.out.println(order2.getStatusMessage());
        order4.setOrderIsReady(true);
        System.out.println(order4.getStatusMessage());
        order6.setOrderIsReady(true);
        System.out.println(order6.getStatusMessage());

        // Implement the getOrderTotal method within the Order class
        // Test the total by printing the return value like
        // so: System.out.println(order1.getOrderTotal());
        System.out.println(order1.getTotalPrice());
        System.out.println(order2.getTotalPrice());
        System.out.println(order3.getTotalPrice());
        System.out.println(order4.getTotalPrice());
        System.out.println(order5.getTotalPrice());
        System.out.println(order6.getTotalPrice());

        System.out.println("== item1 ==> " + item1);
        order1.getItems();
        System.out.println("== order1.getStatusMessage ==> " + order1.getStatusMessage());
        order1.setOrderIsReady(false);
        System.out.println("== order1.getStatusMessage ==> " + order1.getStatusMessage());
        order1.setOrderIsReady(true);
        System.out.println("");
        System.out.println("== order1.getStatusMessage ==> " + order1.getStatusMessage());
        System.out.println(order1.getTotalPrice());

        // Implement the display method within the Order class
        // Finally, call the display method on all of your orders, like so:
        // order3.display();
        order1.displayOrders();
        order2.displayOrders();
        order3.displayOrders();
        order4.displayOrders();
        order5.displayOrders();
        order6.displayOrders();

        System.out.println("");
        System.out.println("====== End TestBarista main ======");
        System.out.println("");
    }
}