package aula13;

public class Aviao extends Veiculo {
	
	private int altitudeMax;
	
	
	
	
	public Aviao(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel,
			int altitudeMax) {
		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		
		this.altitudeMax = altitudeMax;
	}




	public void voar() {
		System.out.println(this.modelo + " está voando!");
	}
}
