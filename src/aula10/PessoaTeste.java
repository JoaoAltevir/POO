package aula10;

public class PessoaTeste {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Casa", 185, "Uvaranas", "Ponta Grossa", "PR");
		Pessoa pessoa1 = new Pessoa("João", "12/07/2006", "Masculino", "j.altevir@gmail.com", "Solteiro",
			endereco1);
		
		pessoa1.imprimirDados();	
	}
}
