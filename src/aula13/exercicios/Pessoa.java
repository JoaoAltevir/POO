package aula13.exercicios;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	protected Endereco endereco;
	
	public Pessoa(String nome, int idade, Endereco endereco) {
		
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade:" + this.idade);
	}
	
	
}
