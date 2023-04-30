package diaSete;

//18. Escreva um programa Java para encontrar o segundo menor elemento em uma matriz.(exercicio dia 7)
import java.util.Scanner;

public class Dia7 {
    public static void main(String[] args) {
        
        Scanner a  = new Scanner(System.in);
        System.out.print("Digite o nº de linhas da matriz: ");
        Integer lin = a.nextInt();
        System.out.print("Digite o nº de colunas da matriz: ");
        Integer col = a.nextInt();
        int[][] matriz = new int[lin][col];
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Digite o elemento [%d][%d] : ", i, j);
                matriz[i][j] = a.nextInt();
            }
        }

        Integer menor = Integer.MAX_VALUE;
        Integer segundoMenor = Integer.MAX_VALUE;
        
                
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (matriz[i][j] < menor) {
                    segundoMenor = menor;
                    menor = matriz[i][j];
                } else if (matriz[i][j] < segundoMenor && matriz[i][j] != menor) {
                    segundoMenor = matriz[i][j];
                }
            }
        }

        System.out.printf("O segundo menor elemento da matriz é %d.\n", segundoMenor);
        a.close();
    }
}