package fundamentos;

public class ex22 {

	public static void main(String[] args) {
    int limiteminimo = 1;
    int limitetotal = 20;
    
    int somaMultiplos3 = 0;
    int somaMultiplos5 = 0;
    
    
    for(int i = limiteminimo; i <= limitetotal; i++) {
    	if(i % 3 == 0) {
    		somaMultiplos3 += i;
    	}
    	if(i % 5 == 0) {
    		somaMultiplos5 += i;
    	}
    	
    }
    System.out.println("Soma dos multiplos de 3:" + somaMultiplos3);
    System.out.println("Soma dos multiplos de 5:" + somaMultiplos5);
    System.out.println(somaMultiplos3 + somaMultiplos5);
}

}
