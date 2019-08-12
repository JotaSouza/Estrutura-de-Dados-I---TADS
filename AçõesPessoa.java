package ExAULA3;

import java.util.ArrayList;

public class AçõesPessoa extends Pessoa {

	ArrayList<Pessoa> listaPessoa = new ArrayList<>();
	
	public void inserePessoa(Object usuario) {
		listaPessoa.add((Pessoa) usuario);
	}
	
	public String consultaPessoa() {
		for(Pessoa c : listaPessoa) {
			System.out.println(listaPessoa.get(0));
		}
		return "1";
	}
	
	public void deletarPessoa(String nome) {
		for(Pessoa c : this.listaPessoa) {
			if(c.getNome().equalsIgnoreCase(nome)){
				listaPessoa.remove(c);
			}
		}
		
	}

	
}
