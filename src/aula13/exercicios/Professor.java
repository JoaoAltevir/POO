package aula13.exercicios;

public class Professor extends Pessoa{
	
	private double salarioBase;
	private double salarioTitulacao;
	private double salarioTotal;
	
	public Professor(String nome, int idade, double salarioBase, double salarioTitulacao) {
		
		super(nome, idade);
		
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
		this.salarioTotal = 0;
	}
	
	public void calcularSalario() {
		
		this.salarioTotal = this.salarioBase + this.salarioTitulacao;
		System.out.println("Calculado com sucesso!");
		
	}
	
	public void imprimirDados() {
		
		System.out.println("============================================");
		super.imprimirDados();
		System.out.println("Salário base: " + this.salarioBase);
		System.out.println("Salário titulação: " + this.salarioTitulacao);
		System.out.println("Salário total: " + this.salarioTotal);
		
	}
	
	
	
}
