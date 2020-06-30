import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1 = scan.nextInt();
        double n2 = scan.nextInt();
        double m1 = scan.nextInt();
        double m2 = scan.nextInt();

        double ans = Math.abs(Math.atan2(n2, n1) - Math.atan2(m2, m1));

        double answer = Math.toDegrees(ans);

        System.out.println(answer);
    }
}