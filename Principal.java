package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		
		Lobo lobo = new Lobo ("Thor", "Masculino","Canis rufus");
		System.out.println("           Lobo             ");
		System.out.println("Nome: " + lobo.getNome());
		System.out.println("Sexo: " + lobo.getSexo());
		System.out.println("Raca: " + lobo.getRaca());
		lobo.Emitir_Som();
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		
		Leao leao = new Leao ("Rufus", "Masculino","Leão Selvagem");
		System.out.println("           Leão             ");
		System.out.println("Nome: " + leao.getNome());
		System.out.println("Sexo: " + leao.getSexo());
		System.out.println("Raca: " + leao.getRaca());
		leao.Emitir_Som();
		leao.dormir();
		leao.caminhar();
		leao.correr();
		
		Tigre tigre = new Tigre ("Rasnos", "Masculino","Tigre Selvagem");
		System.out.println("           Tigre             ");
		System.out.println("Nome: " + tigre.getNome());
		System.out.println("Sexo: " + tigre.getSexo());
		System.out.println("Raca: " + tigre.getRaca());
		tigre.Emitir_Som();
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		
		Cachorro cachorro = new Cachorro ("Max", "Masculino","Sthizu");
		System.out.println("           Cachorro             ");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Sexo: " + cachorro.getSexo());
		System.out.println("Raca: " + cachorro.getRaca());
		cachorro.Emitir_Som();
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		
		Gato gato = new Gato ("Marrie", "Feminino","Siamês");
		System.out.println("           Gato             ");
		System.out.println("Nome: " + gato.getNome());
		System.out.println("Sexo: " + gato.getSexo());
		System.out.println("Raca: " + gato.getRaca());
		gato.Emitir_Som();
		gato.dormir();
		gato.caminhar();
		gato.correr();
	}

}
