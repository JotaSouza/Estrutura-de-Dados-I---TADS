package ListaII;

import java.util.ArrayList;

public class Agenda {
 
	public Agenda() {
		
	}
	ArrayList<String> agenda = new ArrayList<String>();
	
	public void  insereDados(String nome, String endereco, String telefone){
		
		agenda.add(nome + "; " + endereco + "; " + telefone);
	}
	
	public void consultaDados() {
		int n = agenda.size();
		for(int i = 0; i < n; i++) {
			System.out.printf("Posição %d- %s\n", i, agenda.get(i));
		}
	}
	
	public void excluiDados(int posicao) {
		try {
			agenda.remove(posicao);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("\nErro: posição inválida!");
			e.getMessage();
		}
	}
	
}
