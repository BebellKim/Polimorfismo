package Polimorfismo;

public class Principal_Saude {

	public static void main(String[] args) {

		Medico medico = new Medico ("Rodrigo", "Pediatra",200, "Privado");
		System.out.println("           Medico             ");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Especialidade: " + medico.getEspecialidade());
		System.out.println("Valor da consulta: " + medico.getValor_consulta());
		System.out.println("CRM: " + medico.getCrm());
		medico.Agendar_consulta();
		
		Dentista dentista = new Dentista ("cezar", "Odontologia",100,"Válido");
		System.out.println("           Dentista             ");
		System.out.println("Nome: " + dentista.getNome());
		System.out.println("Especialidade: " + dentista.getEspecialidade());
		System.out.println("Valor da consulta: " + dentista.getValor_consulta());
		System.out.println("CRO: " + dentista.getCro());
		dentista.Agendar_consulta();
		
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta ("Ana", "fisioterapia",400, "Privado");
		System.out.println("           Fisioterapeuta             ");
		System.out.println("Nome: " + fisioterapeuta.getNome());
		System.out.println("Especialidade: " + fisioterapeuta.getEspecialidade());
		System.out.println("Valor da consulta: " + fisioterapeuta.getValor_consulta());
		System.out.println("Crefito: " + fisioterapeuta.getCrefito());
		fisioterapeuta.Agendar_consulta();

	}

}
