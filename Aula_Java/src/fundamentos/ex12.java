package fundamentos;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos há na sala? ");
        int quantidadeAlunos = scanner.nextInt();

        int contador = 1;
        double somaNotas = 0;

        while (contador <= quantidadeAlunos) {
            System.out.print("Digite a nota do aluno " + contador + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
        }

        double media = somaNotas / quantidadeAlunos;
        System.out.println("A média da turma é: " + media);

        scanner.close();
    }
}