package lab11;

public class Sector implements Shape {
    private double r;
    private double angle;

    public Sector(double r, double angle) {
        this.r = r;
        this.angle = angle;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * r * r * angle) / 360;
    }

    @Override
    public void display() {
        System.out.printf("Секторын талбай (s=pi*r*r*angle/360) = %.2f\n", calculateArea());
    }
}