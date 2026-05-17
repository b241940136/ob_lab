package lab11;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public void display() {
        System.out.printf("Квадратын талбай (s=a*a) = %.2f\n", calculateArea());
    }
}