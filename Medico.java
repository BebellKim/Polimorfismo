package Polimorfismo;

public class Medico extends ProfissionaisSaude {
	
	private String crm;

	public Medico (String nome, String especialidade, int valor_consulta, String crm) {
		super(nome, especialidade, valor_consulta);
		this.crm = crm;

	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	@Override
	public void Agendar_consulta () {
		System.out.println("Consulta agendada Com o médico! Agradecemos pela preferência!");
	}

}
