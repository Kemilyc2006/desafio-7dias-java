package diaSeis;

//10. Escreva um programa Java para encontrar o valor máximo e mínimo de uma matriz.(exercicio dia 6)
import java.util.Scanner;


public class Dia6 {
    public static void main(String[] args) {
        Scanner media = new Scanner(System.in);
        
        System.out.println("Insira o número de linhas da matriz:");
        Integer lin = media.nextInt();
        System.out.println("Insira o número de colunas da matriz:");
        Integer col = media.nextInt();
        int[][] matriz = new int[lin][col];
        System.out.println("Insira os valores para a matriz: ");
        
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int quant = 0;
        
        
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = media.nextInt();
                
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
                
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
              
                quant++;
            }
        }
      
       
     
        System.out.println("O  valor mínimo é: " + menor);
        System.out.println("O  valor máximo é: " + maior);
        
        

        media.close();
    }
}