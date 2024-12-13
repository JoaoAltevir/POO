package aula14;

import java.util.List;
import java.util.ArrayList;


public class CalculadoraTeste {
	public static void main(String[] args) {
		
		List listaNumeros = new ArrayList<Integer>();
		
		int a = 5;
		int b = 5;
		double c = 5.0;
		double d = 4.5;
		int e = 5;
		int f = 10;
		
		Calculadora calculadora1 = new Calculadora();
		
		listaNumeros.add(a);
		listaNumeros.add(b);
		listaNumeros.add(e);
		listaNumeros.add(f);
		
		
		
		
		
		
		int soma1 = calculadora1.somar(a, b);
		double soma2 = calculadora1.somar(c, d);
		int soma = calculadora1.somar(listaNumeros);
		
		System.out.println(soma1);
		System.out.println(soma2);
		System.out.println(soma);
		
	}
}
