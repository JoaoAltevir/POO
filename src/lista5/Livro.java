package lista5;

public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicado;
	private String editora;
	private int numPaginas;
	private boolean emprestado;
	private int diaEmprestado;
	private int diaDevolvido;
	
	public Livro(String titulo, String autor, int anoPublicado, String editora, int numPaginas) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicado = anoPublicado;
		this.editora = editora;
		this.numPaginas = numPaginas;
		this.emprestado = false; 
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicado() {
		return anoPublicado;
	}

	public String getEditora() {
		return editora;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public boolean getEmprestado() {
		return emprestado;
	}

	public int getDiaEmprestado() {
		return diaEmprestado;
	}

	public int getDiaDevolvido() {
		return diaDevolvido;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setAnoPublicado(int anoPublicado) {
		this.anoPublicado = anoPublicado;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public void setDiaEmprestado(int diaEmprestado) {
		this.diaEmprestado = diaEmprestado;
	}

	public void setDiaDevolvido(int diaDevolvido) {
		this.diaDevolvido = diaDevolvido;
	}
	
	
	
	
	
	
}
