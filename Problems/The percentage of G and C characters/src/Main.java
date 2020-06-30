import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().toUpperCase().split("");

        double gc = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[i].equals("G") || line[i].equals("C")) {
                gc++;
            }
        }

        double answer = gc / line.length * 100;

        System.out.println(answer);


    }
}