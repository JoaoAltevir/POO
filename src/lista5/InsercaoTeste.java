package lista5;

public class InsercaoTeste {
	public static void main(String[] args) {
		Insercao teste = new Insercao();
		
		long inicio = System.currentTimeMillis();
		
		teste.inserirNumeros(1);
		teste.mostrarNumeros();
	
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Tudo isso levou " + tempo + "ms");
		
	}
}
