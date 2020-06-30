import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        String longestWord = words[0];
        int wordLength = words[0].length();

        for (String word : words) {
            if (word.length() > wordLength) {
                longestWord = word;
                wordLength = word.length();
            }
        }
        System.out.println(longestWord);

    }
}