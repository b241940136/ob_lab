package lab2;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double R;
        double pi = 3.14;
        double busluur;

        System.out.print("Geriiin radiusiig oruulna uu (metr): ");
        R = sc.nextDouble();

        busluur = 3 * pi * R;

        System.out.println("Gert heregtei busluur: " + busluur + " metr");

        sc.close();
    }
}

