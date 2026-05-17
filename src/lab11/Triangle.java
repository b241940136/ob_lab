package lab11;

public class Triangle implements Shape {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return (a * h) / 2;
    }

    @Override
    public void display() {
        System.out.printf("Гурвалжны талбай (s=a*h/2) = %.2f\n", calculateArea());
    }
}