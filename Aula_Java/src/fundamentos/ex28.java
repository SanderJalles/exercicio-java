package fundamentos;

public class ex28 {

	public static void main(String[] args) {
	String str = "Hello World";
	String resultado = str.replace("H", "R");
	System.out.println(resultado);
	
	String resultado2 = str.substring(6);
	System.out.println(resultado2);
	
	String resultado3 = str.trim();
	
	String strr = "Hello";
	char c = strr.charAt(1);
	System.out.println(strr);
	
	String s1 ="Fellos";
	String s2 ="Fellas";
	boolean b1 = s1.equals("Fellas");
	boolean b2 = s1.equals(s2);
	boolean b3 = s1.equalsIgnoreCase(s2);
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	
	
	

	}

}
