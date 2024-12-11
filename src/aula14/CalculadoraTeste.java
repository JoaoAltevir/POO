package aula14;

import java.util.List;
import java.util.ArrayList;


public class CalculadoraTeste {
	public static void main(String[] args) {
		
		List listaNumeros = new ArrayList<Integer>();
		
		int a = 5;
		int b = 6;
		
		
		Calculadora calculadora1 = new Calculadora();
		
		
		calculadora1.somar(a, b);
		
		
	}
}
