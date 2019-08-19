package ListaIII;
import java.util.Scanner;

public class VetorDecrescente {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
        final int TAM;
        int aux;
        
        System.out.println("::.. Ordena Vetor Decrescente ..::\n");
        System.out.print("Informe o tamanho do vetor: ");
        TAM = entrada.nextInt();
        int[] num = new int [TAM];
        
        for(int x = 0; x < num.length; x++){
            System.out.print("Informe o "+(x+1)+"º número: ");
            num[x] = entrada.nextInt();
            
            for(int y = 0; y < x; y++){
                if(num[x] > num[y]){
                    aux = num[x];
                    num[x] = num[y];
                    num[y] = aux;
                }
                    
            }
        }
        
        System.out.println("\nVetor ordenado de forma decrescente:");
        for(int z = 0; z < num.length; z++){
            System.out.print(num[z]+" | ");
        }
        
        entrada.close();
    }
    
}
