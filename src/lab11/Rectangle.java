package lab11;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public void display() {
        System.out.printf("Тэгш өнцөгтийн талбай (s=a*b) = %.2f\n", calculateArea());
    }
}