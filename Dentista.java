package Polimorfismo;

public class Dentista extends ProfissionaisSaude {
	
	private String cro;

	public Dentista (String nome, String especialidade, int valor_consulta,  String cro) {
		super(nome, especialidade, valor_consulta);
		this.cro = cro;

	}
	public String getCro() {
		return cro;
	}
	public void setCro(String cro) {
		this.cro = cro;
	}
	@Override
	public void Agendar_consulta () {
		System.out.println("Consulta agendada Com o Dentista! Agradecemos pela preferência!");
	}

}
