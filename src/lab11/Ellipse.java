package lab11;

public class Ellipse implements Shape {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return Math.PI * a * b;
    }

    @Override
    public void display() {
        System.out.printf("Эллипсийн талбай (s=pi*a*b) = %.2f\n", calculateArea());
    }
}