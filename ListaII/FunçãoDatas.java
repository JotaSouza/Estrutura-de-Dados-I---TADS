package ListaII;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FunçãoDatas {

	public void diaValido(int dia, int mes) {
		
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if(dia > 30 && dia <= 0) {
				System.out.println("Dia informado é inválido");
			}else {
				System.out.println("Dia informado é válido");
			}
		} else {
			if(dia < 31 && dia > 0) {
				System.out.println("Dia informado é válido");
				
			} else {
				System.out.println("Dia informado é inválido");
			}
		}
	}
	
	public void mesValido(int mes) {
		if(mes > 0 && mes <=12) {
			System.out.println("O mês informado é válido");
		} else {
			System.out.println("O mês informado é inválido");
		}
	}
	
	public void anoBissexto(int ano) {
		if(ano % 400 == 0) {
			System.out.println("O ano informado é bissexto");
		} else if(ano % 4 == 0 && ano % 100 != 0){
			System.out.println("O ano informado é bissexto");
		} else {
			System.out.println("O ano informado não é bissexto");
		}
	}
	
	public boolean dataValida(String data) {
        try {
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             sdf.setLenient(false);
             sdf.parse(data);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
	/*public void dataValida(String data) {
		int dia = Integer.parseInt(data.substring(0, 2));
		int mes = Integer.parseInt(data.substring(3, 5));
		int ano = Integer.parseInt(data.substring(6, 10));
		
		if(dia > 0 && dia <= 31) {
			if(mes > 0 && mes <= 12) {
				if(ano > 0) {
					System.out.println("Data informada é válida");
				}
			}
		} else {
			System.out.println("data informada é inválida");
		}

		
	}*/
	
	public void escreveData(int dia, int mes, int ano) {
		String escreveMes = "";
		if(mes > 0 && mes <= 12) {
			if(mes == 1) {
				escreveMes = "janeiro";
			} else if (mes == 2) {
				escreveMes = "fevereiro";
			} else if (mes == 3) {
				escreveMes = "março";
			} else if (mes == 4) {
				escreveMes = "abril";
			} else if (mes == 5) {
				escreveMes = "maio";
			} else if (mes == 6) {
				escreveMes = "junho";
			} else if (mes == 7) {
				escreveMes = "julho";
			} else if (mes == 8) {
				escreveMes = "agosto";
			} else if (mes == 9) {
				escreveMes = "setembro";
			} else if (mes == 10) {
				escreveMes = "outubro";
			} else if (mes == 11) {
				escreveMes = "novembro";
			} else {
				escreveMes = "dezembro";
			}
			
			System.out.println(dia+" de "+escreveMes+" de "+ano);
		} else {
			System.out.println("Mês informado é inválido");
		}
	}

	
}
