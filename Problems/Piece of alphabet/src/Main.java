import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String words = scan.nextLine();

        boolean alphabet = true;

        for (int i = 1; i < words.length(); i++) {
            int n1 = (int) words.charAt(i);
            int n2 = (int) words.charAt(i - 1);
            if (n1 - 1 != n2) {
                alphabet = false;
            }
        }

        System.out.println(alphabet);
    }
}