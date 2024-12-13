package aula14;

import java.util.List;
import java.util.ArrayList;

public class Calculadora {
	
	public int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public  int somar(List<Integer> listaNumeros){
		int soma = 0;
		for(int numero: listaNumeros) {
			soma += numero;
		}
		return soma;
	}	
}
