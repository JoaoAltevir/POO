package lista5;

import java.util.List;
import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private double mediaDisciplina;
	private List<Aluno> listaAlunos;
	
	public Disciplina(String nome) {
		super();
		this.nome = nome;
		this.mediaDisciplina = 0.00;
		this.listaAlunos = new ArrayList<Aluno>();
	}
	
	public void matricularAluno(int ra, String nome) {
		
		Aluno aluno = new Aluno(ra, nome);
		this.listaAlunos.add(aluno);
		System.out.println("Aluno matriculado com sucesso!");
		
	}
	
	public void lancarNota(int ra, double nota) {
		
		for(Aluno aluno: listaAlunos) {
			if(ra == aluno.getRa()) {
				aluno.getNotas().add(nota);
				System.out.println("Nota lançada!");
				return;
			}
			System.out.println("Aluno não encontrado!");
			return;
		}
	}
	
	public void listarAlunos() {
		
		for(Aluno aluno: listaAlunos) {
			
			System.out.println("RA: " + aluno.getRa());
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Notas: " + aluno.getNotas());
			
		}
	}
	
	public void finalizarSemestre() {
		
		this.calcularMediaAlunos();
		this.calcularMediaDisciplina();
		
		
		
	}
	
	
	
}
