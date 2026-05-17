package lab11;

public class Trapezoid implements Shape {
    private double a;
    private double b;
    private double h;

    public Trapezoid(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return ((a + b) * h) / 2;
    }

    @Override
    public void display() {
        System.out.printf("Трапецийн талбай (s=(a+b)*h/2) = %.2f\n", calculateArea());
    }
}