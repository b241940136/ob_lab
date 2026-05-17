package lab12;
public class Calculator {
    // Хаалттай хандалттай гишүүн функцүүд
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("0-д хуваах боломжгүй!");
        return a / b;
    }
}