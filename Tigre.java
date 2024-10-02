package Polimorfismo;

public class Tigre extends Animal { // herda

	public Tigre (String nome, String sexo, String raca) { // construtor
		super(nome, sexo, raca);

	}
	@Override // subscreve 
	public void Emitir_Som () {
		System.out.println("O Tigre está roncando");
	}
}


