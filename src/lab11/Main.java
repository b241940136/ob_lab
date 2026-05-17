package lab11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: ");
        String name = sc.nextLine();

        Shape shape = null;

        if (name.equalsIgnoreCase("Square")) {
            System.out.print("Талыг оруул (a): ");
            double a = sc.nextDouble();
            shape = new Square(a);
        }

        else if (name.equalsIgnoreCase("Rectangle")) {
            System.out.print("Уртыг оруул (a): ");
            double a = sc.nextDouble();

            System.out.print("Өргөнийг оруул (b): ");
            double b = sc.nextDouble();

            shape = new Rectangle(a, b);
        }

        else if (name.equalsIgnoreCase("Triangle")) {
            System.out.print("Суурийг оруул (a): ");
            double a = sc.nextDouble();

            System.out.print("Өндрийг оруул (h): ");
            double h = sc.nextDouble();

            shape = new Triangle(a, h);
        }

        else if (name.equalsIgnoreCase("Trapezoid")) {
            System.out.print("Дээд суурийг оруул (a): ");
            double a = sc.nextDouble();

            System.out.print("Доод суурийг оруул (b): ");
            double b = sc.nextDouble();

            System.out.print("Өндрийг оруул (h): ");
            double h = sc.nextDouble();

            shape = new Trapezoid(a, b, h);
        }

        else if (name.equalsIgnoreCase("Circle")) {
            System.out.print("Радиусыг оруул (r): ");
            double r = sc.nextDouble();

            shape = new Circle(r);
        }

        else if (name.equalsIgnoreCase("Sector")) {
            System.out.print("Радиусыг оруул (r): ");
            double r = sc.nextDouble();

            System.out.print("Өнцгийг оруул (angle): ");
            double angle = sc.nextDouble();

            shape = new Sector(r, angle);
        }

        else if (name.equalsIgnoreCase("Ellipse")) {
            System.out.print("Их хагас тэнхлэгийг оруул (a): ");
            double a = sc.nextDouble();

            System.out.print("Бага хагас тэнхлэгийг оруул (b): ");
            double b = sc.nextDouble();

            shape = new Ellipse(a, b);
        }

        else if (name.equalsIgnoreCase("Parallelogram")) {
            System.out.print("Суурийг оруул (a): ");
            double a = sc.nextDouble();

            System.out.print("Өндрийг оруул (h): ");
            double h = sc.nextDouble();

            shape = new Parallelogram(a, h);
        }

        else {
            System.out.println("Ийм дүрс байхгүй байна.");
        }

        if (shape != null) {
            shape.display();
        }

        sc.close();
    }
}