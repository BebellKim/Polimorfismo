package Polimorfismo;

public class Horista extends Funcionario {
	public Horista (String nome, String telefone, String endereco, int id, int matricula) {
		super(nome, telefone, endereco,id, matricula);

	}
	@Override
	public double Calcular_Salario (double ValorHora, double HoraTrabalhada) {
		return ValorHora * HoraTrabalhada;
		
	}

}
