package lab8;

public class Memory {
    private int size; // GB
    private String type;
    private double speed; // MHz
    private String brand;

    public Memory(int size, String type, double speed, String brand) {
        this.size = size;
        this.type = type;
        this.speed = speed;
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("Memory: " + size + "GB " + type + ", " + speed + "MHz, Brand: " + brand);
    }
}