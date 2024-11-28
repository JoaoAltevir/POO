package lista5;

import java.util.List;
import java.util.ArrayList;

public class Aluno {
	
	private int ra;
	private String nome;
	private List<Double> notas;
	
	public Aluno(int ra, String nome) {

		this.ra = ra;
		this.nome = nome;
		this.notas = new ArrayList<Double>();
			
	}

	public int getRa() {
		return ra;
	}

	public String getNome() {
		return nome;
	}

	public List<Double> getNotas() {
		return notas;
	}
	
	
	
	
	
}
