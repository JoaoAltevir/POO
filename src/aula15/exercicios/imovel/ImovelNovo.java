package aula15.exercicios.imovel;

public class ImovelNovo extends Imovel{
	private double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor Adicional: R$" + this.valorAdicional);
		System.out.println("Valor total: R$" + this.calcularValorTotal());
	}
	
	public double calcularValorTotal() {
		return this.valorBase + this.valorAdicional;
	}
	
	
}
