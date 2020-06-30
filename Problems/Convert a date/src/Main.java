import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] date1 = scan.next().split("-");

        System.out.printf("%s/%s/%s", date1[1], date1[2], date1[0]);
    }
}