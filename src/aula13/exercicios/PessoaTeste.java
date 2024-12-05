package aula13.exercicios;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Rua Aroldo Lucas Fornazari", 185, "Cara-cara", "Ponta Grossa", "PR");
		
		Aluno aluno1 = new Aluno("João", 18, endereco1);
		aluno1.realizarMatricula("ADS");
		
		aluno1.imprimirDados();
		
		Endereco endereco2 = new Endereco("Fiscal antonio mariano", 52, "Oficinas", "Ponta Grossa","PR");
		
		Professor professor1 = new Professor("Enzo", 35, 8565.5, 1000.00, endereco2);
		professor1.calcularSalario();
		professor1.imprimirDados();
		
	}
	

	
	
	
}
