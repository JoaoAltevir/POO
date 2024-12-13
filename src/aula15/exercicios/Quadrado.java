package aula15.exercicios;

public class Quadrado extends Quadrilatero{
	private double lado;
	private double area;
		
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public void calcularArea() {
		this.area = this.lado * this.lado;
		System.out.println("A área desse quadrado é: " + this.area);
	}
}
