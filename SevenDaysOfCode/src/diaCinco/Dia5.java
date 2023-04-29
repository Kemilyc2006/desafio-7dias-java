package diaCinco;

//29. Escreva um programa Java para calcular o valor médio de uma matriz de inteiros,
//exceto os maiores e menores valores.(exercicio dia 5)
import java.util.Scanner;
import java.text.DecimalFormat;

public class Dia5 {
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
        int soma = 0,  quant = 0;
        
        
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = media.nextInt();
                
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
                
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                soma += matriz[i][j];
                quant++;
            }
        }

        double mediaResult = (double) (soma - menor - maior) / (quant - 2);

        System.out.println("O  valor menor é: " + menor);
        System.out.println("O  valor maior é: " + maior);
        
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("A média dos valores da matriz, excluindo o maior e o menor valor, é: " + df.format(mediaResult));

        media.close();
    }
}