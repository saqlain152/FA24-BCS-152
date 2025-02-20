public class Demo1 {
    public static void main(String args[]) {
        // Creating product objects
        Product obj1 = new Product("Oppo", 20, 50, "Mobile");
        Product obj2 = new Product("Samsung", 30, 100, "Mobile");
        Product obj3 = new Product("Dell", 10, 5000, "Laptop");
        Product obj4 = new Product("HP", 5, 10000, "Laptop");
        Product obj5 = new Product("Honda 125", 25, 12000, "Bike");

        // Displaying product details
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
        obj5.display();
    }
}




