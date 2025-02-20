package lista7.exerc1;

public class Quadrado extends FiguraGeometrica {
	private int lado;


	public Quadrado(int lado) {
		super();
		this.lado = lado;
	}
	
	public void CalcularArea() {
		this.area = this.lado * this.lado;
		
	}
	
	
	
	
	
}
