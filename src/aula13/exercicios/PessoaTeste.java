package aula13.exercicios;

public class PessoaTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 18);
		aluno1.realizarMatricula("ADS");
		
		aluno1.imprimirDados();
		
		Professor professor1 = new Professor("Jorge", 35, 8565.5, 1000.00);
		professor1.calcularSalario();
		professor1.imprimirDados();
		
	}
	

	
	
	
}
