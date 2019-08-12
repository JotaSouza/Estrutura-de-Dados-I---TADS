package ExAULA3;

import java.util.Scanner;

public class MainPessoa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		AçõesPessoa operacoes = new AçõesPessoa();
		
		int opcao = 0;
		
		do {
			System.out.println(":::... Cadastro de Pessoas ...:::");
			System.out.println("Escolha uma das opções a seguir:");
			System.out.println("[1] - Inserir");
			System.out.println("[2] - Consultar");
			System.out.println("[3] - Remover");
			System.out.println("[4] - Sair");
			System.out.print("Opção-> ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				Pessoa usuario = new Pessoa();
				entrada.nextLine();
                System.out.print("Nome: ");
                usuario.setNome(entrada.nextLine());
                System.out.print("Endereço: ");
                usuario.setEndereco(entrada.nextLine());
                System.out.print("Telefone: ");
                usuario.setTelefone(entrada.nextLine());
                operacoes.inserePessoa(usuario);
                System.out.println(usuario);
                break;
			case 2:
				operacoes.consultaPessoa();
				break;
			case 3:
				String nome;
				System.out.print("Informe o nome da pessoa que deseja remover: ");
				nome = entrada.nextLine();
				operacoes.deletarPessoa(nome);
				break;
			case 4:
				System.out.println("Finalizando . . .  .");
				break;
				default:
					System.out.println("Opção inválida");
			}
			
		}while(opcao != 4);

	}

}
