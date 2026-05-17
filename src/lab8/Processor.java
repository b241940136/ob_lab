package lab8;

public class Processor {
    private String brand;
    private int cores;
    private double speed; // GHz
    private int cache; // MB

    public Processor(String brand, int cores, double speed, int cache) {
        this.brand = brand;
        this.cores = cores;
        this.speed = speed;
        this.cache = cache;
    }

    public void printInfo() {
        System.out.println("Processor: " + brand + ", " + cores + " cores, " + speed + "GHz, Cache: " + cache + "MB");
    }
}