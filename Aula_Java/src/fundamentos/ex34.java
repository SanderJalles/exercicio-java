package fundamentos;

public class ex34 {

	public static void main(String[] args) {
	String texto01 = "Será que são iguais";
	String texto02 = "Será que são iguais";
	boolean b2 = texto01.equals(texto02);
	boolean b3 = texto02.equalsIgnoreCase(texto02);
	System.out.println(b2);
	System.out.println(b3);
	}

}
