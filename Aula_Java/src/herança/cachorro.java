package herança;

public class cachorro extends Animal{
	public cachorro(String _nome, Double _peso, String _pelo, String _cor) {
		super(_nome, _peso, _pelo, _cor);
	}
	public void som() {
		System.out.println("latindo");
	}
}
