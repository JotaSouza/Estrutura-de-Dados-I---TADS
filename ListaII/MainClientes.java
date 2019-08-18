package ListaII;

import java.util.Scanner;

public class MainClientes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		FuncoesClientes funcao = new FuncoesClientes();
		
		int opcao = 0;
		System.out.println("::.. SysCli - Informações ..::");
		while(opcao != 6) {
			System.out.println("\nEscolha uma das opções:"
					+ "\n[1] - Inserir cliente"
					+ "\n[2] - Consultar cliente"
					+ "\n[3] - Excluir cliente"
					+ "\n[4] - Clientes com renda mensal acima da média"
					+ "\n[5] - Clientes com nascimento entre 1980 e 2000"
					+ "\n[6] - Sair");
			System.out.print("Opção-> ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				Clientes cliente = new Clientes();
				System.out.println("Informe os dados do cliente");
				entrada.nextLine();
				System.out.print("Nome completo: ");
				cliente.setNome(entrada.nextLine());
				System.out.print("Ano do nascimento: ");
				cliente.setAnoNas(entrada.nextInt());
				System.out.print("Salário mensal: R$ ");
				cliente.setSalario(entrada.nextFloat());
				funcao.insereCliente(cliente);
				break;
			case 2:
				funcao.consultaCliente();
				break;
			case 3:
			    break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("Finalizando o sistema. . . .");
				break;
				default:
					System.out.println("Opção inválida!");
					break;
			
			}
		}
		
		entrada.close();

	}

}
