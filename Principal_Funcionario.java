package Polimorfismo;

public class Principal_Funcionario {

	public static void main(String[] args) {

		//Funcionario
		Funcionario funcionario = new Funcionario ("Guilherme", "(15)96512029","Rua verde",8734, 126);
		System.out.println("          Funcionário              ");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println(funcionario.Calcular_Salario(10000.00 , 1000));


		//Horista
		Horista horista = new Horista ("Gustavo", "(15)998712029","Rua rosa",87345, 123);
		System.out.println("          Horista              ");
		System.out.println("Nome: " + horista.getNome());
		System.out.println(horista.Calcular_Salario(100 , 200));



		//Jornada
		Jornada jornada = new Jornada ("Giovana", "(15)99845629","Rua Amarela",87346, 124);
		System.out.println("          Jornada              ");
		System.out.println("Nome: " + jornada.getNome());
		System.out.println(jornada.Calcular_Salario(150 , 220));


		//ConsultorPj
		ConsultorPj consultorPj = new ConsultorPj ("lucas", "(11)99871679","Rua Azul",87347, 125);
		System.out.println("          ConsultorPj              ");
		System.out.println("Nome: " + consultorPj.getNome());
		System.out.println(consultorPj.Calcular_Salario(20000 , 2000));





	}

}
