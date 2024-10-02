package Polimorfismo;

public class ProfissionaisSaude {
	
	private String nome;
	private String especialidade;
	private int valor_consulta;
	
	public ProfissionaisSaude(String nome, String especialidade, int valor_consulta) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.valor_consulta = valor_consulta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getValor_consulta() {
		return valor_consulta;
	}

	public void setValor_consulta(int valor_consulta) {
		this.valor_consulta = valor_consulta;
	}
	
	public void Agendar_consulta() {
		System.out.println("Consulta agendada! Agradecemos pela preferência!");
	}
}
