package diaUm;

import java.util.Scanner;

public class Dia1 {
	
	  public static void main(String[] args) {
		  
		  // 23. Escreva um programa Java para testar a igualdade de duas matrizes. (exercicio 1).
	       
	        Scanner sc = new Scanner(System.in);
	       
	        System.out.print("Digite o número de linhas da matriz: ");
	        int linhas = sc.nextInt();
	       
	        System.out.print("Digite o número de colunas da matriz: ");
	        int colunas = sc.nextInt();
	       
	        int[][] matriz1 = new int[linhas][colunas];
	        int[][] matriz2 = new int[linhas][colunas];
	       
	        System.out.println("Digite os elementos da primeira matriz:");
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.print("Matriz1[" + i + "][" + j + "]: ");
	                matriz1[i][j] = sc.nextInt();
	            }
	        }
	       
	        System.out.println("Digite os elementos da segunda matriz:");
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.print("Matriz2[" + i + "][" + j + "]: ");
	                matriz2[i][j] = sc.nextInt();
	            }
	        }
	       
	        sc.close();
	       
	        if (matrizIguais(matriz1, matriz2)) {
	            System.out.println("As matrizes são iguais.");
	        } else {
	            System.out.println("As matrizes são diferentes.");
	        }
	    }
	   
	    public static boolean matrizIguais(int[][] matriz1, int[][] matriz2) {
	       
	        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {  
	            return false;
	        }
	       
	        for (int i = 0; i < matriz1.length; i++) {  
	            for (int j = 0; j < matriz1[0].length; j++) {  
	                if (matriz1[i][j] != matriz2[i][j]) {  
	                    return false;
	                }
	            }
	        }
	       
	        return true;
	    }
	}

