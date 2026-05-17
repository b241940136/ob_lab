package lab8;

public class DisplayCard {
    private int memory; // GB
    private String chipset;
    private String brand;
    private double clockSpeed; // MHz

    public DisplayCard(int memory, String chipset, String brand, double clockSpeed) {
        this.memory = memory;
        this.chipset = chipset;
        this.brand = brand;
        this.clockSpeed = clockSpeed;
    }

    public void printInfo() {
        System.out.println("DisplayCard: " + brand + ", " + chipset + ", " + memory + "GB, Clock: " + clockSpeed + "MHz");
    }
}