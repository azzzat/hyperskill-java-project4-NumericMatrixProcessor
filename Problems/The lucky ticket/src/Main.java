import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.next().split("");

        int case1 = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[2]);
        int case2 = Integer.parseInt(numbers[3]) + Integer.parseInt(numbers[4]) + Integer.parseInt(numbers[5]);

        if (case1 == case2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}