package fundamentos;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
	    System.out.println("Digite o primeiro numero");
	    int n1 = numero.nextInt();
	    System.out.println("Digite o segundo numero");
	    int n2 = numero.nextInt();
	    System.out.println("Digite o terceiro numero");
	    int n3 = numero.nextInt();
	    
	    System.out.println(n1 > n2 && n1> n3 ?"o primeiro numero é o maior":n2 > n1 && n2 > n3 ? "o segundo numero é o maior":	"o terceiro numero é o maior");

	}

}
