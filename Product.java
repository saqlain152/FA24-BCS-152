public class Product {
    private static int productcounter = 1; // Static counter for unique product IDs
    private String id;
    private String name;
    private int quantity;
    private int price;
    private String category;

    // Constructor with proper capitalization
    public Product(String pname, int pquantity, int pprice, String pcategory) {
        this.name = pname;
        this.quantity = pquantity;
        this.price = pprice;
        this.category = pcategory;
        this.id = "E" + String.format("%04d", productcounter); // Generates ID like E0001, E0002
        productcounter++; // Increment counter for next product
    }

    // Display method with proper formatting
    public void display() {
        System.out.printf("Product ID: %s\n", id);
        System.out.printf("Product Name: %s\n", name);
        System.out.printf("Product Quantity: %d\n", quantity);
        System.out.printf("Product Price: %d\n", price);
       
    }}