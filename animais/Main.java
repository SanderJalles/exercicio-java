package animais;

public class Main {
    public static void main(String[] args) {
   	    aranha aranha1 = new aranha();
   	    Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();
        Peixe peixe1 = new Peixe();

        // Setting names for the pets
        aranha1.setNome("Aranha");
        cachorro1.SetNome("Cachorro");
        gato1.SetNome("Gato");
        peixe1.SetNome("Peixe");

        // Printing the names of the pets
        System.out.println("Nome da aranha: " + aranha1.getNome());
        System.out.println("Bandit: " + cachorro1.getNome());
        System.out.println("Nome do gato: " + gato1.getNome());
        System.out.println("Nome do peixe: " + peixe1.getNome());

        
        peixe1.comer();
    }
}
