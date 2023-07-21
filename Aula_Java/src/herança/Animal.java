package herança;

public class Animal {
public String nome;
public Double peso;
public String cor;
public String pelo;

	public Animal(String _nome, Double _peso, String _pelo, String _cor) {
		this.nome = _nome;
		this.peso = _peso;
		this.pelo = _pelo;
		this.cor = _cor;
		
	}
	public void comer() {
		System.out.println(this.nome + "esta comendo");
	}
	public void som() {
		System.out.println(this.nome + "esta GRITANDO");
	}
}
