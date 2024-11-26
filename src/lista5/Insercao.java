package lista5;

import java.util.List;
import java.util.ArrayList;

public class Insercao {
	
	Integer num;
	List <Integer> numeros;
	
	public void inserirNumeros(Integer numero){
		this.num = numero;
		this.numeros = new ArrayList<Integer>();
		while(this.numeros.size() < 500000) {
			numeros.add(this.num);
			this.num++;
		}
	}
	
	public void mostrarNumeros() {
		for(Integer numero : numeros) {
			System.out.println(numero);
		}
	}
}
