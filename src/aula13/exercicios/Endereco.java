package aula13.exercicios;

public class Endereco {
	
	private String logadouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	
	
	public Endereco(String logadouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.logadouro = logadouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}
	
	public void imprimirEndereco() {
		System.out.println("Logadouro: " + this.getLogadouro());
		System.out.println("Número: " + this.getNumero());
		System.out.println("Bairro: " + this.getBairro());
		System.out.println("Cidade: " + this.getCidade());
		System.out.println("UF:" + this.getUnidadeFederativa());
	}


	public String getLogadouro() {
		return logadouro;
	}


	public int getNumero() {
		return numero;
	}


	public String getBairro() {
		return bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}
	
	
	
	
}
