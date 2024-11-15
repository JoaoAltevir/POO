package aulaAssociacoes1;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private String estadoCivil;
	private Endereco endereco;
	
	public Pessoa(String nome, String dataNascimento, String sexo, String email, String estadoCivil,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
	}
	
	public void imprimirDados() {
		System.out.println("==================================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " +  this.sexo);
		System.out.println("E-mail: " + this.email);
		System.out.println("Estado Civil: " + this.estadoCivil);
		System.out.println("ENDERECO:");
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número da casa: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("UF: " + this.endereco.getUf());		
		System.out.println("==================================");
	}
	
	
	
	
}
