package biydaalt2;
public class Product {

    protected String name;
    protected String id;
    protected double price;

    public Product(String name, String id, double price) {
        this.name  = name;
        this.id    = id;
        this.price = price;
    }

    public void display() {
        System.out.println("=== Бараа ===");
        System.out.println("Нэр : " + name);
        System.out.println("Код : " + id);
        System.out.println("Үнэ : " + price + "₮");
    }

    public double applyDiscount(double percent) {
        return price - (price * percent / 100);
    }

    public String getInfo() {
        return "[" + id + "] " + name + " — " + price + "₮";
    }
}