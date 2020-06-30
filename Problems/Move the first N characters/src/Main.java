import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        int number = scan.nextInt();

        if (number == 0 || number > word.length()) {
            System.out.println(word);
        } else {
            String word1 = word.substring(number);
            String word2 = word.substring(0, number);

            System.out.printf("%s%s", word1, word2);
        }

    }
}