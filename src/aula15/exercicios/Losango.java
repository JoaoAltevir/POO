package aula15.exercicios;

public class Losango extends Quadrilatero{
	private double diagonalMenor;
	private double diagonalMaior;
	private double area;
	
	public Losango(double diagonalMenor, double diagonalMaior) {
		super();
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	public void calcularArea() {
		this.area = (this.diagonalMaior * this.diagonalMenor) / 2;
		System.out.println("A área desse losango é: " + this.area);
	}
	
	
}
