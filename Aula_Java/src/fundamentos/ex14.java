package fundamentos;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Números pares:");
        displayEvenNumbers(numero);

        System.out.println("Números ímpares:");
        displayOddNumbers(numero);
    }

    public static void displayEvenNumbers(int numero) {
        int i = 1;
        while (i <= numero) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void displayOddNumbers(int numero) {
        int i = 1;
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
