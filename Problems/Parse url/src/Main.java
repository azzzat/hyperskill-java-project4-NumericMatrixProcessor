import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        char[] arLine = line.toCharArray();

        int index1 = line.indexOf("?");

        boolean isPassword = false;
        String password = "";

        String[] params = line.substring(index1 + 1).split("&");
        for (String par : params) {
            String[] newPar = par.split("=");
            if (newPar[0].equals("cookie") && newPar.length == 1) {
                System.out.println("cookie : not found");
            }
            if (newPar.length == 2 && !newPar[1].equals("")) {
                System.out.println(newPar[0] + " : " + newPar[1]);
            }
            if (newPar[0].equals("pass") && !newPar[1].equals("")) {
                isPassword = true;
                password = newPar[1];
            }
        }


        if (isPassword) {
            System.out.printf("password : %s", password);
        }
        System.out.println();

    }
}