package aula13.exercicios;

public class Aluno extends Pessoa{
	
	private String curso;

	public Aluno(String nome, int idade) {
		super(nome, idade);
		this.curso = null;
	}
	
	public void realizarMatricula(String curso) {
		
		this.curso = curso;
		System.out.println("Aluno matriculado com sucesso!");
		
	}
	
	public void imprimirDados() {
		
		System.out.println("=============================");
		super.imprimirDados();
		System.out.println("Matriculado em: " + this.curso);
	
	}
	
	
	
	
}
