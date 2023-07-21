package fundamentos;
import java.util.Scanner;

public class ex26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos arrays: ");
        int tamanho = scanner.nextInt();

        int[] arrayA = new int[tamanho];
        int[] arrayB = new int[tamanho];
        int[] arrayC = new int[tamanho];
        int[] arrayD = new int[tamanho];

        System.out.println("Preencha os valores do Array A:");
        preencherArray(arrayA, scanner);

        System.out.println("Preencha os valores do Array B:");
        preencherArray(arrayB, scanner);

        System.out.println("Preencha os valores do Array C:");
        preencherArray(arrayC, scanner);

        System.out.println("Preencha os valores do Array D:");
        preencherArray(arrayD, scanner);

        System.out.println("Array A:");
        imprimirArray(arrayA);

        System.out.println("Array B:");
        imprimirArray(arrayB);

        System.out.println("Array C:");
        imprimirArray(arrayC);

        System.out.println("Array D:");
        imprimirArray(arrayD);
    }

    public static void preencherArray(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
    }
}
