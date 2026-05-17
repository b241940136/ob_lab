package lab6;

public class Matrix {
	private int[][] operand1; //matrix1
    private int[][] operand2; //matrix2
    private String operator; //uildliin temdeg

    public Matrix(int[][] operand1, int[][] operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    private int[][] addition(int[][] operand1, int[][] operand2) {
        int rows = operand1.length;
        int cols = operand1[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = operand1[i][j] + operand2[i][j];
            }
        }
        return sum;
    	}

    private int[][] subtraction(int[][] operand1, int[][] operand2) {
        int rows = operand1.length;
        int cols = operand1[0].length;
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = operand1[i][j] - operand2[i][j];
            }
        }
        return diff;
    }

    private int[][] multiplication(int[][] operand1, int[][] operand2) {
        int rows1 = operand1.length;
        int cols1 = operand1[0].length;
        int cols2 = operand2[0].length;
        int[][] product = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += operand1[i][k] * operand2[k][j];
                }
            }
        }
        return product;
    }

    public void chooseoperation() {
        int[][] result;
        switch (operator) {
            case "+":
                result = addition(operand1, operand2);
                System.out.println("Addition Matrix is: Size(" + result.length + "x" + result[0].length + ")");
                break;
            case "-":
                result = subtraction(operand1, operand2);
                System.out.println("Subtraction Matrix is: Size(" + result.length + "x" + result[0].length + ")");
                break;
            case "*":
                result = multiplication(operand1, operand2);
                System.out.println("Multiplication Matrix is: Size(" + result.length + "x" + result[0].length + ")");
                break;
            default:
                System.out.println("Buruu uildliin temdeg oruulsan baina!");
                return;
        }
        printmatrix(result);
    }

    private void printmatrix(int[][] pmatrix) {
        for (int[] row : pmatrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}