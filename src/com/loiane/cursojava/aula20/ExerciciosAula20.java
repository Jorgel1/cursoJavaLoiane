package com.loiane.cursojava.aula20;

import java.util.Scanner;

import static java.lang.Math.random;

public class ExerciciosAula20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1 Gere e imprima uma matriz M 4x4 com valores eleatórios entre 0 e 9.
        // Após isso determine o maior número da matriz e sua posição (linha, coluna).

        int[][] matrizM = new int[4][4];
        int maiorNum = matrizM[0][0];
        int linha = 0;
        int coluna = 0;

        System.out.println("Matriz M: ");
        System.out.println("Linha      Coluna      Valor");
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = (int)Math.round(Math.random() * 9);
                System.out.println("  " + i + "          " + j + "          " + matrizM[i][j]);
            }
        }
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][j] > maiorNum){
                    maiorNum = matrizM[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Maior número da matriz: " + maiorNum +
                " linha: " + linha + " coluna: " + coluna);

        System.out.println("Maior número da matriz: " + matrizM[linha][coluna] +
                " linha: " + linha + " coluna: " + coluna);

    }
}
