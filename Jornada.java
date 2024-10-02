package Polimorfismo;

public class Jornada extends Funcionario {
	public Jornada (String nome, String telefone, String endereco, int id, int matricula) {
		super(nome, telefone, endereco,id, matricula);

	}
	@Override
	public double Calcular_Salario (double SalarioHora, double HoraTrabalhada) {
		return SalarioHora * HoraTrabalhada;
		
	}

}
