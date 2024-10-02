package Polimorfismo;

public class Fisioterapeuta extends ProfissionaisSaude {
		
		private String crefito;

		public Fisioterapeuta (String nome, String especialidade, int valor_consulta,  String crefito) {
			super(nome, especialidade, valor_consulta);
			this.crefito = crefito;

		}
		public String getCrefito() {
			return crefito;
		}
		public void setCrefito(String crefito) {
			this.crefito = crefito;
		}
		@Override
		public void Agendar_consulta () {
			System.out.println("Consulta agendada Com o Fisioterapeuta! Agradecemos pela preferência!");
		}
	
}
