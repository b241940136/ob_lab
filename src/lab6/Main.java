package lab6;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a operatoin (+, -, *):\n");
        String op = sc.next();
        int rows1, cols1, rows2, cols2;
        System.out.print("Insert the Size of 1st Matrix:\n");
        rows1 = sc.nextInt();
        cols1 = sc.nextInt();
        int[][] operand1 = new int[rows1][cols1];

        System.out.println("Enter the elements of the 1st Matrix: Size (" + rows1 + "x" + cols1 + ")");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                operand1[i][j] = sc.nextInt();
            }
        }
        if (op.equals("+") || op.equals("-")) {
            System.out.print("Insert the Size of 2st Matrix:\n");
            rows2 = sc.nextInt();
            cols2 = sc.nextInt();
            if (rows1 != rows2 || cols1 != cols2) {
                System.out.println("Action is not possible.");
                sc.close();
                return;
            }
        } else if (op.equals("*")) {
            System.out.println("Matrix multiplication: ehnii matrixiin column-iin too 2dahi matrixiin row-tei tentsuu baih yostoi.");
            System.out.print("Insert the Size of 2st Matrix:\n");
            rows2 = sc.nextInt();
            cols2 = sc.nextInt();
            if (cols1 != rows2) {
                System.out.println("Matrixiin hemjee urjih uildeld tohirohgui baina!");
                sc.close();
                return;
            }
        } else {
            System.out.println("Buruu uildliin temdeg oruulsan baina!");
            sc.close();
            return;
        }
        int[][] operand2 = new int[rows2][cols2];
        System.out.println("Enter the elements of the 2st Matrix: Size (" + rows1 + "x" + cols1 + ")");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                operand2[i][j] = sc.nextInt();
            }
        }
        Matrix m = new Matrix(operand1, operand2, op);
        m.chooseoperation(); 
        sc.close();
    }
}