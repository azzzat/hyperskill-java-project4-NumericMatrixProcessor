import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        String check = scan.next();

        boolean checked = false;

        int answer = 0;

        while (!checked) {
            line = line.substring(line.indexOf(check) + check.length());

            answer += 1;

            if (line.indexOf(check) == -1) {
                break;
            }
        }


        System.out.println(answer);

    }
}