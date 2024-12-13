package aula15.exercicios;

import java.util.Scanner;

public class QuadrilateroTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quadrilatero generico = null;
		
		System.out.println("1 - Quadrado");
		System.out.println("2 - Losango");
		System.out.println("3 - Retangulo");
		System.out.print("Informe a opção: ");
		int opcao = input.nextInt();
		
		switch(opcao) {
			case 1:
				generico = new Quadrado(4.0);
				break;
			case 2: 
				generico = new Losango(5.0, 10.0);
				break;
			case 3:
				generico = new Retangulo(10.0, 5.0);
				break;
		}
		generico.calcularArea();
		
	}
	


}	
