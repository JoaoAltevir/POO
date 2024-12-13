package aula15.exercicios.imovel;

public class Imovel {
	protected String endereco;
	protected double valorBase;
	
	
	public Imovel(String endereco, double valorBase) {
		super();
		this.endereco = endereco;
		this.valorBase = valorBase;
	}
	
	public void imprimirDados() {
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Valor base: R$" + this.valorBase);
	}
	
	protected double calcularValorTotal() {
		return 0.00;
	}
}
