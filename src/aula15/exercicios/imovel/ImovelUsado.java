package aula15.exercicios.imovel;

public class ImovelUsado extends Imovel{
	private double valorDesconto;

	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor desconto: R$" + this.valorDesconto);
	}
	
	public double calcularValorTotal() {
		
	}
	
}
