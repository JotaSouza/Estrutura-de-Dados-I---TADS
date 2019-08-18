package ListaII;

import java.util.Scanner;

public class MainAgenda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("::.. Agenda 2019 ..::");
		
		int opcao = 0, posicao;
		String nome, endereco, telefone;
		Agenda dados = new Agenda();
		while(opcao != 4) {
			System.out.println("\nEscolha uma das opções:"
					+ "\n[1] - Inserir dados"
					+ "\n[2] - Consultar dados"
					+ "\n[3] - Excluir dados"
					+ "\n[4] - Sair");
			System.out.print("Opção-> ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Informe o nome da pessoa: ");
				nome = entrada.nextLine();
				System.out.println("Informe o endereço: ");
				endereco = entrada.nextLine();
				System.out.println("Informe o nº de telefone: ");
				telefone = entrada.nextLine();
				
				dados.insereDados(nome, endereco, telefone);
				break;
			case 2:
				System.out.println("::.. Dados Agendados ..::");
				dados.consultaDados();
				break;
			case 3:
				System.out.print("Informe o nome de quem deseja excluir: ");
				posicao = entrada.nextInt();
				dados.excluiDados(posicao);
				break;
			case 4:
				System.out.println("Finalizando. . . . ");
				break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
		}
		
		entrada.close();

	}

}
