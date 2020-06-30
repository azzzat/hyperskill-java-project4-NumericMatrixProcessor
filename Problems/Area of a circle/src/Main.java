import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double answer = Math.PI * number * number;
        System.out.println(answer);
    }
}