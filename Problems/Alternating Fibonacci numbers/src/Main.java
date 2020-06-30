import java.util.Scanner;

public class Main {

    public static long fib(long n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long c;
        long d;

        c = fib(n - 1) * -1;
        d = fib(n - 2);

        return c + d;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}