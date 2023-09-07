public class Main {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("E001", "Laptop", 1500.00, 2, "Dell", 2, true);
        Clothing clothing = new Clothing("C001", "T-Shirt", 50.00, 3, "custom", "blue", "silk");

        System.out.println("Total price for electronics: " + electronics.calcTotalPrice());
        System.out.println("Total price for clothing: " + clothing.calcTotalPrice());
    }
}
