package aula15.exercicios;

public class Retangulo extends Quadrilatero{
	
	private double base;
	private double altura;
	private double area;
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea() {
		this.area = this.base * this.altura;
		System.out.println("A área desse retangulo é: " + this.area);
	}
	
	
}
