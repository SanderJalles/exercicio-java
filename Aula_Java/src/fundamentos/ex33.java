package fundamentos;

import java.util.Scanner;

public class ex33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        int cc = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (Character.isLetter(c)) {
                cc++;
            }
        }
        
        

        System.out.println("A palavra possui " + cc + " letras.");
    }
}

