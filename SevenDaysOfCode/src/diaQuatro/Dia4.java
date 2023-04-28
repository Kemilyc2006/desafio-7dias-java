package diaQuatro;

//2. Escreva um programa Java para somar valores de uma matriz.(exercicio dia 4)
import java.util.Scanner;

public class Dia4 {
    public static void main(String[] args) {
        Scanner somaMatriz = new Scanner(System.in);

        System.out.println("Insira o número de linhas da matriz:");
        int lin = somaMatriz.nextInt();

        System.out.println("Insira o número de colunas da matriz:");
        int co = somaMatriz.nextInt();

        int[][] matriz = new int[lin][co];

        System.out.println("Insira os valores da matriz:");

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < co; j++) {
                matriz[i][j] = somaMatriz.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < co; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos valores da matriz é: " + soma);

        somaMatriz.close();
    }
}