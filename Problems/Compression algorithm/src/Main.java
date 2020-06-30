import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        int count = 0;

        if (line.length() == 1) {
            count++;
            System.out.printf("%s%d", line, count);
        } else{
            for (int i = 1; i < line.length(); i++) {
                if ((line.charAt(i) != line.charAt(i - 1))) {
                    count++;
                    System.out.print(line.charAt(i - 1));
                    System.out.print(count);
                    count = 0;
                } else {
                    count++;
                }
                if (i + 1 == line.length()) {
                    count++;
                    System.out.print(line.charAt(i));
                    System.out.print(count);
                }
            }
        }

        System.out.println();
    }
}