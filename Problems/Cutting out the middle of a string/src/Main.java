import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        if (word.length() <= 2) {
            System.out.println("");
        } else if (word.length() % 2 == 0) {
            int num = word.length() / 2;
            String w1 = word.substring(num + 1);
            String w2 = word.substring(0, num - 1);
            System.out.printf("%s%s", w2, w1);
        } else {
            int num = word.length() / 2;
            String w1 = word.substring(num + 1);
            String w2 = word.substring(0, num);
            System.out.printf("%s%s", w2, w1);
        }
    }
}