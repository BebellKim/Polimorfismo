package Polimorfismo;

public class Gato extends Animal {

	public Gato (String nome, String sexo, String raca) {
		super(nome, sexo, raca);

	}
	@Override
	public void Emitir_Som () {
		System.out.println("O Gato está miando");
	}
}



