package aula15;

import java.util.Scanner;

public class MamiferoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Mamifero mamifero = null;
		
		System.out.println("1 - Gato");
		System.out.println("2 - Cachorro");
		System.out.println("3 - Cavalo");
		System.out.print("Escolha sua opção: ");
		int opcao = input.nextInt();
		
		switch(opcao) {
			case 1:
				mamifero = new Gato("Garfield", "Laranja");
				break;
			case 2: 
				mamifero = new Cachorro("Bolt", "Supercão");
				break;
			case 3:
				mamifero = new Cavalo("pé de pano", "sla");
				break;
		}
		mamifero.emitirSom();	
		
	}
}
