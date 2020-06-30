import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] row = scan.nextLine().toLowerCase().split("");


        for (int i = 2; i < row.length; i++) {
            boolean case1 = row[i].equals("a") || row[i].equals("e") || row[i].equals("i") ||
                    row[i].equals("o") || row[i].equals("u") || row[i].equals("y") &&
                    row[i - 1].equals("a") || row[i - 1].equals("e") || row[i - 1].equals("i") ||
                    row[i - 1].equals("o") || row[i - 1].equals("u") || row[i - 1].equals("y") ||
                    row[i - 2].equals("a") || row[i - 2].equals("e") || row[i - 2].equals("i") ||
                    row[i - 2].equals("o") || row[i - 2].equals("u") || row[i - 2].equals("y");
            boolean case2 = !row[i].equals("a") && !row[i].equals("e") && !row[i].equals("i") &&
                    !row[i].equals("o") && !row[i].equals("u") && !row[i].equals("y") &&
                    !row[i - 1].equals("a") && !row[i - 1].equals("e") && !row[i - 1].equals("i") &&
                    !row[i - 1].equals("o") && !row[i - 1].equals("u") && !row[i - 1].equals("y") &&
                    !row[i - 2].equals("a") && !row[i - 2].equals("e") && !row[i - 2].equals("i") &&
                    !row[i - 2].equals("o") && !row[i - 2].equals("u") && !row[i - 2].equals("y");

            if (case1 || case2) {
                System.out.printf("%d ", i);
                break;
            } else {
                System.out.print(0);
                break;
            }

        }


    }
}