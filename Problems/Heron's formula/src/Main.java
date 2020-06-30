import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = scan.nextInt();

        double p = (a1 + a2 + a3)/2.0;
        double ans1 = p * (p - a1) * (p - a2) * (p - a3);
        double answer = Math.sqrt(ans1);

        System.out.println(answer);
    }
}