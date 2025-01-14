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


         // 4 Faça um programa para armazenar em muma matriz os compromissos
         // de uma agenda pessoal. Cada dia do mês deve conter 24 horas, onde
         // para cada uma destas 24 horas podemos associar uma tarefa específica
         // (compromisso agendado). O programa deve ter menu onde o usuário indica 
         // o mês que deseja alterar e a hora, entrando em seguida com o compromisso,
         // ou então, o usuário pode também cosultar a agenda, fornecendo o dia e
         // a hora para obter o compromisso armazenado.    

        String[][] agendaJaneiro = new String[31][24];
        String opcao = "";
        int dia;
        int hora;
        boolean compromisso = false;

        do {
        System.out.println("Digite: agendar, consultar ou sair");
        opcao = scan.next();
        switch (opcao) {
            case "agendar": System.out.println("Informe o dia.");
                            dia = scan.nextInt();
                            dia = dia -1;

                            System.out.println("Informe a hora.");
                            hora = scan.nextInt();

                            System.out.println("Informe o compromisso.");
                            agendaJaneiro[dia][hora] = scan.next();

                            compromisso = true;

            break;
            case "consultar": if (!compromisso) {
            System.out.println("Não há compromisso na agenda");
            } else {
                System.out.println("Agenda de Janeiro:");
                for (int i = 0; i < agendaJaneiro.length; i++) {
                    System.out.print("dia " + (i+1));
                    for (int j = 0; j < agendaJaneiro[i].length; j++) {
                        if (agendaJaneiro[i][j] != null) {
                            System.out.print(" - hora " + j + ": " + agendaJaneiro[i][j] + " ");                            
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
            
            break;
            case "sair": System.out.println("Saindo da agenda ...");
            
            break;
        
            default: if (!opcao.equalsIgnoreCase("agendar") || !opcao.equalsIgnoreCase("consulatar") || !opcao.equalsIgnoreCase("sair")) {
                System.out.println("Opção inválida");
            }
               
        }

        } while (!opcao.equalsIgnoreCase("sair"));

        */

        // Aula20 exercicio 04 feito
   
    }
}
