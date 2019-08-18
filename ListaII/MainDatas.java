package ListaII;

import java.util.Scanner;

public class MainDatas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		FunçãoDatas veriDatas = new FunçãoDatas();
		
		int dia, mes, ano = 0;
		String data = "";
		System.out.println("::.. Funções para verificar datas ..::");
		System.out.print("\nInforme o dia: ");
		dia = entrada.nextInt();
		System.out.print("Informe o mês. (1 - 12): ");
		mes = entrada.nextInt();
		System.out.print("Informe o ano com 4 dígitos: ");
		ano = entrada.nextInt();
		
		System.out.println("\nVerificando ...\n");
		veriDatas.diaValido(dia, mes);
		veriDatas.mesValido(mes);
		veriDatas.anoBissexto(ano);
		
		System.out.print("\nPor favor, informe a data novamente nestes formato (DD/MM/AAAA): ");
		data = entrada.next();
		veriDatas.dataValida(data);
		
		System.out.println("\nEscrevendo a data informada por extenso:\n");
		veriDatas.escreveData(dia, mes, ano);
		
		entrada.close();
		
	

	}

}
