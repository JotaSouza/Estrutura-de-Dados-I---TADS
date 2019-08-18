package ListaII;

import java.util.ArrayList;

public class FuncoesClientes extends Clientes {

	public ArrayList<Clientes> listaCliente = new ArrayList<>();
	
	public void insereCliente(Clientes cliente) {
		listaCliente.add(cliente);
	}
	
	public String consultaCliente() {
		for (Clientes clientes : listaCliente) {
			System.out.println(listaCliente.get(0));
		}
		
		return "ola";
	}
}
