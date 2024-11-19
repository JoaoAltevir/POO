package parametricoAula;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		Banco banco1 = new Banco(89717, "UTF BANK");
		banco1.adicionarNovaConta(1, "José");
		banco1.adicionarNovaConta(112, "Mariana");
		banco1.adicionarNovaConta(135, "Enzo");
		banco1.listarContas();
		
	}
}
