package lab11;

public class Parallelogram implements Shape {
    private double a;
    private double h;

    public Parallelogram(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return a * h;
    }

    @Override
    public void display() {
        System.out.printf("Параллелограммын талбай (s=a*h) = %.2f\n", calculateArea());
    }
}