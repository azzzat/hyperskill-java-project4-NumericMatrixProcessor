import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        double des = Math.sqrt(num2 * num2 - (4.0 * num1 * num3));

        double ans1 = (-1.0 * num2 - des) / (2.0 * num1);
        double ans2 = (-1.0 * num2 + des) / (2.0 * num1);

        if (ans1 <= ans2) {
            System.out.printf("%f %f", ans1, ans2);
        } else {
            System.out.printf("%f %f", ans2, ans1);
        }
    }
}