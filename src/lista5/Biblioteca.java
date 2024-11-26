package lista5;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

	private String campusUtfpr;
	private List<Livro> listaLivros;
	
	public Biblioteca(String campusUtfpr) {
		this.campusUtfpr = campusUtfpr;
		this.listaLivros = new ArrayList<Livro>();
	}
	
	public void adicionarLivros(String titulo, String autor, int anoPublicado, String editora, int numPaginas) {
		
		Livro livro = new Livro(titulo, autor, anoPublicado, editora, numPaginas);
		this.listaLivros.add(livro);
		System.out.println("Livro adicionado com sucesso!");
		
	}
	
	public void emprestarLivros(String titulo) {
		boolean achou = false;
		for(int i = 0; i < listaLivros.size(); i++) {
			
			Livro livro = listaLivros.get(i);
			
			if(livro.getTitulo() == titulo) {
				if(livro.getEmprestado() == false) {
					livro.setDiaEmprestado(11);
					livro.setEmprestado(true);
					achou = true;
					System.out.println("Livro emprestado com sucesso!");
				}else {
					System.out.println("Livro já emprestado!");
				}
				
			}else if(achou == false) {
				System.out.println("Livro não encontrado!");
			}
		}
	}
	
	

}