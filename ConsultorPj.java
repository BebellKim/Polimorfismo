package Polimorfismo;

public class ConsultorPj extends Funcionario {
	public ConsultorPj (String nome, String telefone, String endereco, int id, int matricula) {
		super(nome, telefone, endereco,id, matricula);

	}
	@Override
	public double Calcular_Salario (double Valortotal, double imposto) {
		return Valortotal - imposto;
		
	}
}