package Polimorfismo;

public class Lobo extends Animal {
	public Lobo (String nome, String sexo, String raca) {
		super(nome, sexo, raca);

	}
	@Override
	public void Emitir_Som () {
		System.out.println("O lobo está uivando");
	}
}

