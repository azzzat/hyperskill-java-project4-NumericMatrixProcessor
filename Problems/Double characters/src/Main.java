import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] word = scan.next().split("");
        String answer = "";

        for (int i = 0; i < word.length; i++) {
            answer += word[i] + word[i];
        }

        System.out.println(answer);
    }
}