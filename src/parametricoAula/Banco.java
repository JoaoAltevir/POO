package parametricoAula;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	
	private int cnpj;
	private String nome;
	private List<ContaBancaria> listaContas;
	
	public Banco(int cnpj, String nome) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.listaContas = new ArrayList<ContaBancaria>();
	}
	
	public void adicionarNovaConta(int numConta, String titular) {
		
		ContaBancaria cb = new ContaBancaria(numConta, titular); //criando conta nova
		this.listaContas.add(cb); //adicionando no vetor
		System.out.println("Criado conta com sucesso!");
		
	}
	
	public void removerConta(int numConta) {
		
		for(int i = 0; i < listaContas.size(); i++) {
			
			ContaBancaria cb = this.listaContas.get(i);
			
			if(cb.getNumero() == numConta) {
				this.listaContas.remove(cb);
				System.out.println("removido com sucesso!");
				return;
			}			
		}
		System.out.println("Conta não encontrada!");
	}
	
	public void listarContas() {
		for(ContaBancaria conta : listaContas) {
			conta.imprimirSaldo();
		}
	}
}
