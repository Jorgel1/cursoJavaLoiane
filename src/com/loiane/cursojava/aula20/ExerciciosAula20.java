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

        //5 Modifique programa anterior de maneira a guardar os compromissos de
        // todo o ano, arganizados por mês, dia e hora (só 8 horas por dia)


        String[][][] agendaAno = new String[12][][];
        String opcao = "";
        int dia;
        int hora;
        int mes;
        boolean compromisso = false;
        boolean diaVerdadeiro = false;
        boolean horaVerdadeira = false;

        // criar os dias de acordo com cada mês.
        for (int i = 1; i <= agendaAno.length; i++) {

            // criar nesse mês 28 dias
            if (i == 2) {
                agendaAno[i] = new String[28][];
            }
            // criar nesses meses 30 dias.
            else if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) {
                agendaAno[i] = new String[30][];
            } else {
                agendaAno[i] = new String[31][];
            }
        }

        // menu
        do {
            System.out.println("Digite: agendar, consultar ou sair");
            opcao = scan.next();
            switch (opcao) {
                case "agendar": System.out.println("Informe o mes.");
                    mes = scan.nextInt();

                    // validar os meses que contém menos de 31 dias.
                    do {
                    System.out.println("Informe o dia.");
                    dia = scan.nextInt();
                        //validar o mês que contém 28 dias.
                        if (mes == 2 && dia > 28) {
                            System.out.println("Informe um dia de 0 a 28 para o mês " + mes);
                        } else {
                            diaVerdadeiro = true;
                        }
                        //validar os meses que contém 30 dias.
                        if ((mes == 4 && dia > 30) || (mes == 6 && dia > 30) ||
                                (mes == 9 && dia > 30) || (mes == 11 && dia > 30)) {
                            System.out.println("Informe um dia de 0 a 30 para o mês " + mes);
                        } else {
                            diaVerdadeiro = true;
                        }

                    } while (!diaVerdadeiro);
                    diaVerdadeiro = false;

                    do {
                    System.out.println("Informe a hora entre 8h às 16h.");
                    hora = scan.nextInt();

                    if (hora >= 8 && hora <= 16) {
                        horaVerdadeira = true;
                    }

                    } while (!horaVerdadeira);
                    horaVerdadeira = false;


                    System.out.println("Informe o compromisso.");
                    agendaAno[mes][dia][hora] = scan.next();
                    compromisso = true;

                    break;
                case "consultar": if (!compromisso) {
                    System.out.println("Não há compromisso na agenda");
                } else {
                    for (int i = 1; i <= agendaAno.length; i++) {
                        System.out.println("Agenda do mês: " + agendaAno[i]);

                        for (int j = 1; j <= agendaAno[i].length; j++) {
                            System.out.print("dia " + (j));

                            for (int k = 0; k < agendaAno[i][j].length; k++) {
                                if (agendaAno[i][j][k] != null) {
                                    System.out.print(" - hora " + j + ": " + agendaAno[i][j][k] + " ");
                                }
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                }

                    break;
                case "sair": System.out.println("Saindo da agenda ...");

                    break;

                default: if (!opcao.equalsIgnoreCase("agendar") || !opcao.equalsIgnoreCase("consulatar") ||
                        !opcao.equalsIgnoreCase("sair")) {
                    System.out.println("Opção inválida");
                }

            }

        } while (!opcao.equalsIgnoreCase("sair"));

        // Aula20 exercicio 04 feito
   
    }
}
