package diaDois;

//2. Escreva um programa Java para somar valores de uma matriz(exercicio dia 2)

import java.util.Scanner;

public class Dia2 {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);
       
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = soma.nextInt();
       
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = soma.nextInt();
       
        int[][] matriz = new int[linhas][colunas];
        int soma1 = 0;
       
        System.out.println("Digite os valores para a  matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = soma1.valueOf(leitura.nextInt());
                soma1 += matriz[i][j];
            }
        }
       
        System.out.println("A soma dos valores da matriz é: " + soma1);
    }
}
