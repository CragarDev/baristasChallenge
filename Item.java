public class Item {

    // MEMBER VARIABLES
    private String name;
    private double price;

    // Empty Constructor ---
    public Item() {
        this("Coffee", 2.05);
    }

    // Full Constructor ---
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Name get and set
    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // Price get and set
    // getter
    public double getPrice() {
        return price;
    }

    // setter
    public void setPrice(double price) {
        this.price = price;
    }

    // Plain ole greeting - starter for testing
    public void Starter() {
        System.out.println("");
        System.out.println("Hello, How are you?--- I am an Item");
        System.out.println("");
    }
}