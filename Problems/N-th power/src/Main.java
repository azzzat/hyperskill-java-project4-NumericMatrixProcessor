import java.util.Scanner;

public class Main {

    public static double pow(double a, long n) {
        double b = a * a;
        if (n == 1) {
            return a;
        } else if (n == 0) {
            return 1.0;
        } else if (n % 2 == 0) {
            return pow(b, n/2);
        } else {
            return a * pow(a , n-1);
        }
    }


    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = Double.parseDouble(scanner.nextLine());
        final int n = Integer.parseInt(scanner.nextLine());
        System.out.println(pow(a, n));
    }
}