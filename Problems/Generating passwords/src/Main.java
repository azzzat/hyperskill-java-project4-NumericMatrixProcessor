import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int uperCase = scan.nextInt();
        int lowerCase = scan.nextInt();
        int digits = scan.nextInt();
        int symbols = scan.nextInt();
        char lastSymbol = ' ';
        int lastMathsymbol = 0;

        for (int i = 0; i < uperCase; i++) {
            char ch1 = (char) (65 + (int)(Math.random() * 20));
            while (i > 0 && ch1 == lastSymbol) {
                ch1 = (char) (65 + (int)(Math.random() * 20));
            }
            symbols--;
            System.out.print(ch1);
            lastSymbol = ch1;

        }

        for (int j = 0; j < lowerCase; j++) {
            char ch2 = (char) (97 + (int)(Math.random() * 20));
            while (ch2 == lastSymbol) {
                ch2 = (char) (97 + (int)(Math.random() * 20));
            }
            symbols--;
            System.out.print(ch2);
            lastSymbol = ch2;
        }

        for (int k = 0; k < digits; k++) {
            int num3 = (int)(Math.random() * 10);
            while (num3 == lastMathsymbol) {
                num3 = (int)(Math.random() * 10);
            }
            symbols--;
            System.out.print(num3);
            lastMathsymbol = num3;
        }

        for (int m = 0; m < symbols; m++) {
            char ch4 = (char) (65 + (int)(Math.random() * 20));
            while (m > 0 && ch4 == lastSymbol) {
                ch4 = (char) (65 + (int)(Math.random() * 20));
            }

            System.out.print(ch4);
            lastSymbol = ch4;
        }

    }
}