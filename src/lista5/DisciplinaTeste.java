package lista5;

public class DisciplinaTeste {
	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina("Matemática");
		
		disciplina1.matricularAluno(1234, "João");
		disciplina1.lancarNota(1234, 5.5);
		disciplina1.lancarNota(1234, 6.5);
		disciplina1.listarAlunos();
		
	}
}
