package Polimorfismo;

public class Cachorro extends Animal {

	public Cachorro (String nome, String sexo, String raca) {
		super(nome, sexo, raca);

	}
	@Override
	public void Emitir_Som () {
		System.out.println("O Cachorro está latindo");
	}
}




