package ListaIII;
import java.util.Scanner;
import java.util.Arrays;

public class StringCrescente {

     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final int TAM;

         System.out.println("::.. Ordena Vetor String Crescente ..::\n");
         System.out.print("Informe o tamanho do vetor: ");
         TAM = entrada.nextInt();
         String[] nomes = new String[TAM];
         
         for(int i = 0; i < nomes.length; i++){
             System.out.print("Informe a "+(i+1)+"º palavra: ");
             nomes[i] = entrada.next();
         }
         Arrays.sort(nomes);
         System.out.println("\nStrings ordenadas de forma crescente:");
         for (String nome : nomes) {
             System.out.print(nome + " | ");
         }
         
         entrada.close();
    }
    
}
