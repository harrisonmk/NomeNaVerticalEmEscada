package projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavra = scan.next();
        String letra = "";

        for (int i = 0; i <= palavra.length() - 1; i++) {

            letra += palavra.charAt(i);

            System.out.println(letra);
        }

    }

}
