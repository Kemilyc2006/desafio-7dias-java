package diaTres;
//5. Escreva um programa Java para testar se uma matriz contém um valor específico. (exercicio dia 3)

import java.util.Scanner;

public class Dia3 {

    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);

       
        System.out.println("Digite um valor específico para ser achado na matriz:");
        int valorEspecifico = a.nextInt();

        System.out.println("Digite o número de linhas da matriz:");
        int linhas = a.nextInt();
        System.out.println("Digite o número de colunas da matriz:");
        int colunas = a.nextInt();
       
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                 
                   System.out.printf("Insira um valor:\n", i, j);
                   matriz[i][j] =a.nextInt();
            }
        }
        int valorLinha =-1;
        int valorColuna = -1;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                 
                if (matriz[i][j] == valorEspecifico) {
                    valorLinha = i;
                    valorColuna = j;
                     break;
                }
            }
             
            if (valorLinha != -1 && valorColuna != -1) {
                break;
            }
        }

       
        if (valorLinha != -1 && valorColuna != -1) {
           
            System.out.printf("A matriz contém o valor %d na posição [%d][%d].\n", valorEspecifico, valorLinha, valorColuna);
        }
        else {
           
            System.out.printf("A matriz não contém o valor %d.\n", valorEspecifico);
        }
        a.close();
    }
}
