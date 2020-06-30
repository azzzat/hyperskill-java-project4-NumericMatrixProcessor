import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean polindrome = true;

        String[] words = scan.next().split("");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(words[words.length - 1 - i])) {
                polindrome = false;
            }
        }

        if (polindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}