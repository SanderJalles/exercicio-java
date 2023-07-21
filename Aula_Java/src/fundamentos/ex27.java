package fundamentos;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		int notasArraySize = 5;
		int[] notasArray = new int[notasArraySize];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Preencha as notas:");
		preencherArray(notasArray, scanner);
	}

	public static void preencherArray(int[] notasArray, Scanner scanner) {
		for (int i = 0; i < notasArray.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			notasArray[i] = scanner.nextInt();
		}
	}
	 public static double calcularMedia(int[] notasArray) {
	        int soma = 0;
	        for (int nota : notasArray) {
	            soma += nota;
	        }
	        return (double) soma / notasArray.length;
	    }
  
}
