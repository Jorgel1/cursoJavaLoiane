package com.loiane.cursojava.aula20;

import java.util.Scanner;

import static java.lang.Math.random;

public class ExerciciosAula20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
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


        //2 Gere e imprima uma matriz M 10x10 com valores eleatórios entre 0 e 9.
        // Após isso determine o maior e o menor número da linha 5 e o maior e o menor número da coluna 7
        // sua posição (linha, coluna).

        int[][] matrizM = new int[10][10];
        int maiorNumLinha5 = matrizM[5][0];
        int maiorNumColuna7 = matrizM[0][7];
        int linha = 5;
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
                if (matrizM[linha][j] > maiorNumLinha5){
                    maiorNumLinha5 = matrizM[linha][j];
                    coluna = j;
                }
            }
        }
        System.out.println("Maior número da  linha 5 da matriz: " + matrizM[linha][coluna] +
                " linha: " + linha + " coluna: " + coluna);

        linha = 0;
        coluna = 7;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][coluna] > maiorNumColuna7){
                    maiorNumColuna7 = matrizM[i][coluna];
                    linha = i;
                }
            }
        }
        System.out.println("Maior número da coluna 7 da matriz: " + matrizM[linha][coluna] +
                " linha: " + linha + " coluna: " + coluna);



        //3 Capture do teclado valores para preenchimento de uma matriz M 3x3.
        // Após a captura imprima a matriz criada e encontre a quantidade de números pares,
        // a quantidade de números ímpares.

    int[][] matrizM = new int[3][3];
    int qtdPares = 0;
    int qtdImpares = 0;

      System.out.println("Matriz M: ");
        System.out.println("Linha      Coluna      Valor");
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.println("Insira um valor na posicao: " + i + " " + j);
                matrizM[i][j] = scan.nextInt();
                if (matrizM[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }

        System.out.println("Matriz M: ");
        System.out.println("Linha      Coluna      Valor");
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.println("  " + i + "          " + j + "          " + matrizM[i][j]);
            }
        }

        System.out.println("Pares: " + qtdPares + " Ímpares: " + qtdImpares);

         */

        // Aula20 exercicio 03 feito
    }
}
