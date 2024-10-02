package Polimorfismo;

public class Leao extends Animal {

	public Leao (String nome, String sexo, String raca) {
		super(nome, sexo, raca);

	}
	@Override
	public void Emitir_Som () {
		System.out.println("O Leao está rugindo");
	}
}


