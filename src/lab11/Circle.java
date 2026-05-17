package lab11;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public void display() {
        System.out.printf("Тойргийн талбай (s=pi*r*r) = %.2f\n", calculateArea());
    }
}