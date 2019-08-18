package ListaII;

public class Clientes {

	private String nome;
	private int anoNas;
	private float salario;

	public Clientes() {
		
	}
	
	public void dadosClientes(String nome, int anoNas, float salario) {
		this.nome = nome;
		this.anoNas = anoNas;
		this.salario = salario;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNas() {
		return anoNas;
	}

	public void setAnoNas(int anoNas) {
		this.anoNas = anoNas;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Cliente [Nome: " + nome + ", Nascimento: " + anoNas + ", Salário: " + salario + "]";
	}

	
}
