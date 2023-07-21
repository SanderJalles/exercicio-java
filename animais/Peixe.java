package animais;

public class Peixe extends Animal implements pet {
	String nome;
	public void peixe(String _nome) {
		
	}
	public void peixe() {
		
	}

	@Override
	public void SetNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public void GetNome() {
		System.out.println(nome);
		
	}

	@Override
	public void brincar() {
		System.out.println("Esta brincando");
		
	}
	public void comer() {
		System.out.println("Esta comendo");
	}
	public void andar() {
		System.out.println("Esta andando");
	}
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
}	





