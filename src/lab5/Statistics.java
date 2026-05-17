package lab5;
import java.util.Scanner;

public class Statistics {

    // ===== Overloading static methods =====

    // 2 тооны дундаж
    public static double mean(double a, double b) {
        return (a + b) / 2;
    }

    // 3 тооны дундаж
    public static double mean(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // 4 тооны дундаж
    public static double mean(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }

    // 5 тооны дундаж
    public static double mean(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

    // ===== Standard Deviation (Overloading) =====

    public static double stdDev(double a, double b) {
        double mean = mean(a, b);

        return Math.sqrt(
                (Math.pow(a - mean, 2) +
                 Math.pow(b - mean, 2)) / 2
        );
    }

    public static double stdDev(double a, double b, double c) {
        double mean = mean(a, b, c);

        return Math.sqrt(
                (Math.pow(a - mean, 2) +
                 Math.pow(b - mean, 2) +
                 Math.pow(c - mean, 2)) / 3
        );
    }

    public static double stdDev(double a, double b, double c, double d) {
        double mean = mean(a, b, c, d);

        return Math.sqrt(
                (Math.pow(a - mean, 2) +
                 Math.pow(b - mean, 2) +
                 Math.pow(c - mean, 2) +
                 Math.pow(d - mean, 2)) / 4
        );
    }

    public static double stdDev(double a, double b, double c, double d, double e) {
        double mean = mean(a, b, c, d, e);

        return Math.sqrt(
                (Math.pow(a - mean, 2) +
                 Math.pow(b - mean, 2) +
                 Math.pow(c - mean, 2) +
                 Math.pow(d - mean, 2) +
                 Math.pow(e - mean, 2)) / 5
        );
    }

    // ===== Varargs Methods =====

    // Varargs ашигласан дундаж
    public static double meanVar(double... numbers) {

        double sum = 0;

        for (double n : numbers) {
            sum += n;
        }

        return sum / numbers.length;
    }

    // Varargs ашигласан стандарт хазайлт
    public static double stdDevVar(double... numbers) {

        double mean = meanVar(numbers);

        double sum = 0;

        for (double n : numbers) {
            sum += Math.pow(n - mean, 2);
        }

        return Math.sqrt(sum / numbers.length);
    }

    // ===== Main Method =====

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Хэдэн тоон дээр статистик үйлдэл хийх вэ? (2-5): ");
        int n = sc.nextInt();

        // 2-5 хооронд шалгах
        if (n < 2 || n > 5) {
            System.out.println("2-5 хүртэл тоо оруулна уу!");
            return;
        }

        double a[] = new double[n];

        // Тоонууд унших
        for (int i = 0; i < n; i++) {
            System.out.printf("%d-р тоог оруул: ", i + 1);
            a[i] = sc.nextDouble();
        }

        System.out.println("\n===== OVERLOADING METHOD =====");

        // Overloading method ашиглах
        switch (n) {

            case 2:
                System.out.println("Mean = " +
                        mean(a[0], a[1]));

                System.out.println("Standard Deviation = " +
                        stdDev(a[0], a[1]));
                break;

            case 3:
                System.out.println("Mean = " +
                        mean(a[0], a[1], a[2]));

                System.out.println("Standard Deviation = " +
                        stdDev(a[0], a[1], a[2]));
                break;

            case 4:
                System.out.println("Mean = " +
                        mean(a[0], a[1], a[2], a[3]));

                System.out.println("Standard Deviation = " +
                        stdDev(a[0], a[1], a[2], a[3]));
                break;

            case 5:
                System.out.println("Mean = " +
                        mean(a[0], a[1], a[2], a[3], a[4]));

                System.out.println("Standard Deviation = " +
                        stdDev(a[0], a[1], a[2], a[3], a[4]));
                break;
        }

        System.out.println("\n===== VARARGS METHOD =====");

        // Varargs method ашиглах
        System.out.println("Mean = " + meanVar(a));

        System.out.println("Standard Deviation = " +
                stdDevVar(a));

        sc.close();
    }
}