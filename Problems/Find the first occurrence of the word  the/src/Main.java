import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine().toUpperCase();

        System.out.println(line.indexOf("THE"));
    }
}