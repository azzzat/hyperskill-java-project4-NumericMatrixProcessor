package processor;
import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    boolean isExit = false;
    double[][] matrix1;
    double[][] matrix2;
    int rows1;
    int rows2;
    int columns1;
    int columns2;
    double[][] matrixSum;
    double[][] matrixMultiplied;
    double[][] matrixTranspotted;


    double number;


    public static void main(String[] args) {
        Main m = new Main();

        while (!m.isExit) {
            m.makeChoise();
        }

    }

    public void makeChoise() {
        System.out.println("1. Add matrices");
        System.out.println("2. Multiply matrix to a constant");
        System.out.println("3. Multiply matrices");
        System.out.println("4. Transpose matrix");
        System.out.println("5. Calculate a determinant");
        System.out.println("6. Inverse matrix");
        System.out.println("0. Exit");
        System.out.print("Your choice: ");
        int choise = scan.nextInt();
        switch (choise) {
            case 1:
                addMatrices();
                break;
            case 2:
                multiplyMatrixAndConstant();
                break;
            case 3:
                multiplyMatrixes();
                break;
            case 4:
                transposeMatrixChoise();
                break;
            case 5:
                calculateDeterminant();
                break;
            case 6:
                inverseMatrix();
                break;
            case 0:
                exit();
        }
    }

    public void transposeMatrixChoise() {
        System.out.println();
        System.out.println("1. Main diagonal");
        System.out.println("2. Side diagonal");
        System.out.println("3. Vertical line");
        System.out.println("4. Horizontal line");
        System.out.println("Your choice: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                transposeMainDiagonal();
                showMatrix(matrixTranspotted, columns1, rows1, "The result is: ");
                break;
            case 2:
                transposeSideDiagonal();
                showMatrix(matrixTranspotted, columns1, rows1, "The result is: ");
                break;
            case 3:
                transposeVerticalLine();
                showMatrix(matrixTranspotted, rows1, columns1, "The result is: ");
                break;
            case 4:
                transposeHorizontalLine();
                showMatrix(matrixTranspotted, rows1, columns1, "The result is: ");
                break;
        }
    }



    public void addMatrices() {
        getMatrix1();
        getMatrix2();
        if (columns1 == columns2 && rows1 == rows2) {
            sumMatrix();
            showMatrix(matrixSum, rows1, columns1, "The result is:");
        } else {
            showError();
        }
    }

    public void multiplyMatrixAndConstant() {
        getMatrix1();
        getNumber();
        multiplyMatrixAndNumber(matrix1, rows1, columns1, number);
        showMatrix(matrix1, rows1, columns1, "The result is:");
    }

    public void multiplyMatrixes() {
        getMatrix1();
        getMatrix2();
        if (columns1 == rows2) {
            multiplyTwoMatrixes();
            showMatrix(matrixMultiplied, rows1, columns2, "The result is:");
        } else {
            showError();
        }
    }

// get something from System.in

    public void getNumber() {
        number = scan.nextDouble();
    }

    public void getMatrix1Size() {
        System.out.print("Enter matrix size: ");
        rows1 = scan.nextInt();
        columns1 = scan.nextInt();
    }

    public void getMatrix2Size() {
        System.out.print("Enter size of second matrix: ");
        rows2 = scan.nextInt();
        columns2 = scan.nextInt();
    }

    public void getMatrix1() {
        getMatrix1Size();
        System.out.println("Enter first matrix: ");
        matrix1 = new double[rows1][columns1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scan.nextDouble();
            }
        }
    }

    public void getMatrix2() {
        getMatrix2Size();
        System.out.println("Enter second matrix: ");
        matrix2 = new double[rows2][columns2];

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scan.nextDouble();
            }
        }
    }


    //operations

    public void inverseMatrix() {
        getMatrix1();
        double deter1 = findDeterminant(matrix1, rows1);
        double[][] coMatrix = new double[rows1][rows1];

        if (deter1 == 0.0) {
            showError();
        } else {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < rows1; j++) {

                    double[][] m3 = new double[rows1 - 1][rows1 - 1];
                    for (int n = 0; n < rows1 - 1; n++) {
                        for (int m = 0; m < rows1 - 1; m++) {
                            if (n < i && m < j) {
                                m3[n][m] = matrix1[n][m];
                            } else if (n >= i && m < j) {
                                m3[n][m] = matrix1[n + 1][m];
                            } else if (n < i && m >= j) {
                                m3[n][m] = matrix1[n][m + 1];
                            } else if (n >= i && m >= j) {
                                m3[n][m] = matrix1[n + 1][m + 1];
                            }
                        }
                    }
                    double t = -1.0;
                    if ((i + j) % 2 == 0) {
                        t = 1.0;
                    }

                    coMatrix[j][i] = t * findDeterminant(m3, (rows1 - 1)) / deter1;
                }
            }

        }

        showMatrix(coMatrix, rows1, columns1, "The result is:");

    }

    public void sumMatrix() {
        matrixSum = new double[rows1][columns1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    public void multiplyMatrixAndNumber(double[][] someMatrix, int row, int column, double number) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                someMatrix[i][j] *= number;
            }
        }
    }

    public void multiplyTwoMatrixes() {
        matrixMultiplied = new double[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {

                for (int m = 0; m < columns1; m++) {
                    matrixMultiplied[i][j] += (matrix1[i][m] * matrix2[m][j]);
                }

            }
        }
    }


    public void transposeMainDiagonal() {
        getMatrix1();
        matrixTranspotted = new double[columns1][rows1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixTranspotted[j][i] = matrix1[i][j];
            }
        }
    }

    public void transposeSideDiagonal() {
        getMatrix1();
        matrixTranspotted = new double[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {

                matrixTranspotted[j][i] = matrix1[rows1 - 1 - i][columns1 - 1 - j];
            }
        }

    }

    public void transposeVerticalLine() {
        getMatrix1();
        matrixTranspotted = new double[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixTranspotted[i][j] = matrix1[i][columns1 - 1 - j];
            }
        }
    }

    public void transposeHorizontalLine() {
        getMatrix1();
        matrixTranspotted = new double[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixTranspotted[i][j] = matrix1[rows1 - 1 - i][j];
            }
        }
    }


    public void calculateDeterminant() {
        getMatrix1();
        double determinant = findDeterminant(matrix1, rows1);

        System.out.println("The result is:");
        if (determinant == (int) determinant) {
            System.out.println((int) determinant);
        } else {
            System.out.println(determinant);
        }
        System.out.println();
    }

    public double findDeterminant(double[][] matrix, int dimension) {
        double determinant = 0.0;

        if (dimension == 2) {
            determinant = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
            return determinant;
        } else if (dimension == 3) {
            determinant = matrix[0][0] * matrix[1][1] * matrix[2][2] +
                    matrix[0][1] * matrix[1][2] * matrix[2][0] +
                    matrix[0][2] * matrix[1][0] * matrix[2][1] -
                    matrix[0][0] * matrix[1][2] * matrix[2][1] -
                    matrix[0][1] * matrix[1][0] * matrix[2][2] -
                    matrix[0][2] * matrix[1][1] * matrix[2][0];
            return determinant;
        } else if (dimension > 3) {

            for (int i = 0; i < dimension; i++) {
                double[][] mat1 = new double[dimension - 1][dimension - 1];
                for (int n = 0; n < dimension - 1; n++) {
                    for (int m = 0; m < dimension - 1; m++) {
                        if (m < i) {
                            mat1[n][m] = matrix[n][m];
                        } else if (m >= i) {
                            mat1[n][m] = matrix[n][m + 1];
                        }
                    }
                }
                int num = -1;
                if ((dimension - 1 + 1 + i + 1) % 2 == 0) {
                    num = 1;
                }
                determinant += matrix[dimension - 1][i] * findDeterminant(mat1, dimension - 1) * num;
            }

        }
        return determinant;
    }



    public void exit() {
        isExit = true;
    }

    public void showMatrix(double[][] matrix, int rows, int columns, String message) {
        System.out.println(message);
        boolean isDouble = false;
        loop1: for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] != (int) matrix[i][j]) {
                    isDouble = true;
                    break loop1;
                }
            }
        }

        if (isDouble) {
            for (int i = 0; i < rows; i++){
                for (int j = 0; j < columns; j++) {
                    System.out.printf("%f ", matrix[i][j]);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < rows; i++){
                for (int j = 0; j < columns; j++) {
                    System.out.printf("%d ", (int) matrix[i][j]);
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void showError() {
        System.out.println("ERROR");
    }
}


