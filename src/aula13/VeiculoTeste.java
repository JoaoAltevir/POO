package aula13;

public class VeiculoTeste {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Gol", "Volks", 2012, 5, "Gasolina", 4);
		carro1.abastecer();
		carro1.calibrarPneus();
		
		Aviao aviao1 = new Aviao("Airbus A380-800", "EADS Airbus", 2004, 853 , "Combustivel de avião", 43100);
		aviao1.abastecer();
		aviao1.voar();
		
	}
}
