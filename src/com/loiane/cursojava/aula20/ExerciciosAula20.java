package com.loiane.cursojava.aula20;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
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


          // versão da professora

        int[][] numerosAleatorios = new int[4][4];
        int maior = 0;
        int linha = 0;
        int col = 0;

        Random numeroRadom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRadom.nextInt(100);
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + col);


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


         // versão da professora

        int[][] numerosAleatorios = new int[10][10];
        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;

        int maiorC7 = 0;
        int menorC7 = 101;
        int coluna7 = 7;

        Random numeroRadom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRadom.nextInt(100);
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
            if (numerosAleatorios[linha5][i] > maiorL5) {
                maiorL5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menorL5) {
                menorL5 = numerosAleatorios[linha5][i];
            }
        }
        System.out.println();
        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);

        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i][coluna7] > maiorC7) {
                maiorC7 = numerosAleatorios[i][coluna7];
            }
            if (numerosAleatorios[i][coluna7] < menorC7) {
                menorC7 = numerosAleatorios[i][coluna7];
            }
        }
        System.out.println();
        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7= " + menorC7);



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

        // versao da professora

                String[][] compromissos = new String[31][24];

        boolean sair = false;
        boolean diaValido;
        boolean horaValido;

        int dia = 0;
        int hora = 0;
        byte opcao;

        while (!sair) {

            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = scan.nextByte();

            if (opcao == 1) {
              
                diaValido = false;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                
                horaValido = false;
                while (!horaValido) {
                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }

                dia --;
                System.out.println("Digite o compromisso");
                compromissos[dia][hora] = scan.next();

            } else if (opcao == 2) {

                diaValido = false;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                
                horaValido = false;
                while (!horaValido) {
                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
               
                dia --;
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[dia][hora]);
        
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente");
            }

        }


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
        for (int i = 0; i < agendaAno.length; i++) {

            // criar nesse mês 28 dias
            if (i == 1) {
                agendaAno[i] = new String[28][16];
            }
            // criar nesses meses 30 dias.
            else if ((i == 3) || (i == 5) || (i == 8) || (i == 10)) {
                agendaAno[i] = new String[30][16];
            } else {
                agendaAno[i] = new String[31][16];
            }
        }

        // menu
        do {
            System.out.println("Digite: agendar, consultar ou sair");
            opcao = scan.next();
            switch (opcao) {
                case "agendar": System.out.println("Informe o mes.");
                    mes = scan.nextInt();
                    mes = mes -1;

                    // validar os meses que contém menos de 31 dias.
                    do {
                    System.out.println("Informe o dia.");
                    dia = scan.nextInt();
                    dia = dia -1;
                        //validar o mês que contém 28 dias.
                        if (mes == 1 && dia > 27) {
                            System.out.println("Informe um dia de 0 a 28 para o mês " + mes +1);
                        } else {
                            diaVerdadeiro = true;
                        }
                        //validar os meses que contém 30 dias.
                        if ((mes == 3 && dia > 29) || (mes == 5 && dia > 29) ||
                                (mes == 8 && dia > 29) || (mes == 10 && dia > 29)) {
                            System.out.println("Informe um dia de 0 a 30 para o mês " + mes +1);
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
                    for (int i = 0; i < agendaAno.length; i++) {
                        System.out.println("Agenda do mês: " + (i + 1));

                        for (int j = 0; j < agendaAno[i].length; j++) {
                            System.out.print("dia " + (j+1));

                            for (int k = 0; k < agendaAno[i][j].length; k++) {
                                if (agendaAno[i][j][k] != null) {
                                    System.out.print(" - hora " + k + ": " + agendaAno[i][j][k] + " ");
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


                         // versao da professora

                 String[][][] compromissos = new String[12][31][24];

                 boolean sair = false;
                 boolean diaValido;
                 boolean mesValido;
                 boolean horaValido;
         
                 int dia = 0;
                 int mes = 0;
                 int hora = 0;
                 byte opcao;
         
                 while (!sair) {
         
                     System.out.println("Digite 1 para adicionar compromisso.");
                     System.out.println("Digite 2 para verificar compromisso.");
                     System.out.println("Digite 0 para sair.");
         
                     opcao = scan.nextByte();
         
                     if (opcao == 1) {
                       
                        mesValido = false;
                         while (!mesValido) {
                             System.out.println("Entre com o mês");
                             mes = scan.nextInt();
                             if (mes > 0 && mes <= 12) {
                                mesValido = true;
                             } else {
                                 System.out.println("Mês inválido, digite novamente");
                             }
                         }

                         diaValido = false;
                         while (!diaValido) {
                             System.out.println("Entre com o dia do mês");
                             dia = scan.nextInt();
                             if (dia > 0 && dia <= 31) {
                                 diaValido = true;
                             } else {
                                 System.out.println("Dia inválido, digite novamente");
                             }
                         }
                         
                         horaValido = false;
                         while (!horaValido) {
                             System.out.println("Entre com a hora do compromisso");
                             hora = scan.nextInt();
                             if (hora > 0 && hora <= 8) {
                                 horaValido = true;
                             } else {
                                 System.out.println("Hora inválida, digite novamente");
                             }
                         }
         
                         mes --;
                         dia --;
                         System.out.println("Digite o compromisso");
                         compromissos[mes][dia][hora] = scan.next();
         
                     } else if (opcao == 2) {
         
                        mesValido = false;
                         while (!mesValido) {
                             System.out.println("Entre com o mês");
                             mes = scan.nextInt();
                             if (mes > 0 && mes <= 12) {
                                mesValido = true;
                             } else {
                                 System.out.println("Mês inválido, digite novamente");
                             }
                         }

                         diaValido = false;
                         while (!diaValido) {
                             System.out.println("Entre com o dia do mês");
                             dia = scan.nextInt();
                             if (dia > 0 && dia <= 31) {
                                 diaValido = true;
                             } else {
                                 System.out.println("Dia inválido, digite novamente");
                             }
                         }
                         
                         horaValido = false;
                         while (!horaValido) {
                             System.out.println("Entre com a hora do compromisso");
                             hora = scan.nextInt();
                             if (hora > 0 && hora <= 24) {
                                 horaValido = true;
                             } else {
                                 System.out.println("Hora inválida, digite novamente");
                             }
                         }
                        
                         mes--;
                         dia --;
                         System.out.println("O compromisso agendado é:");
                         System.out.println(compromissos[mes][dia][hora]);
                 
                     } else if (opcao == 0) {
                         sair = true;
                     } else {
                         System.out.println("Opção inválida, digite novamente");
                     }
         
                 }



        // 6- Faça um programa para jogar o jogo da velha. O programa deve permitr que dois jogadores façam uma partida do jogo da velha,
        // usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja colocar a sua
        // peça ('O' ou 'X'). O programa deve impedir jogadas inválidas e determinar automaticamente quando o jogo terminou e quem foi o
        // vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.


        String[][] matrizJogoDaVelha = new String[3][3];
        String strututra = "";
        boolean jogadorO = false;
        boolean jogadorX = false;
        String jogadorAtivo = "---- Jogador 1 ----";
        int cont = 0;
        int jogadas = 0;
        String celulaEscolhida;
        boolean jogadaValida = false;
        boolean terminou = false;
        boolean jogador1 = true;
        boolean inicio = true;

        int celulaInt;


        // inicialização

        do {
            for (int i = 0; i < matrizJogoDaVelha.length; i++) {
                for (int j = 0; j < matrizJogoDaVelha[i].length; j++) {

    //                matrizJogoDaVelha[i][j] = (int)Math.round(Math.random() * 1);
                    // Define uma única vez a marcação de 0 a 9 no tabuleiro.
                    if (inicio){
                        matrizJogoDaVelha[i][j] = "" + cont;
                        cont++;
                    }

                    // Esse tabuleiro será atualizado a cada jogada.
                            strututra = "\n    Tabuleiro: \n" +
                                    "-------------------\n" +
                            "    " + matrizJogoDaVelha[0][0] + "    " + matrizJogoDaVelha[0][1] + "    " + matrizJogoDaVelha[0][2] + "    \n" +
                            "-------------------\n" +
                            "    " + matrizJogoDaVelha[1][0] + "    " + matrizJogoDaVelha[1][1] + "    " + matrizJogoDaVelha[1][2] + "    \n" +
                            "-------------------\n" +
                            "    " + matrizJogoDaVelha[2][0] + "    " + matrizJogoDaVelha[2][1] + "    " + matrizJogoDaVelha[2][2] + "    \n" +
                            "-------------------\n";
                }
            }
            // Setando essa variável para falso para não enumerar o tabuleiro de 0 a 9.
            inicio = false;




           // menu
            System.out.println(strututra);
            System.out.println(jogadorAtivo);

            System.out.println("Escolha uma célula disponível entre 0 a 8:");
            celulaEscolhida = scan.next();
            celulaInt = Integer.parseInt(celulaEscolhida);
            if (celulaInt < 0 || celulaInt > 8){
                System.out.println("Não existe essa célula!");
            }else {
                for (int i = 0; i < matrizJogoDaVelha.length; i++) {
                    for (int j = 0; j < matrizJogoDaVelha[i].length; j++) {

                        //verifica se esta célula está disponível
                        if (matrizJogoDaVelha[i][j].equalsIgnoreCase(celulaEscolhida) ) {
                            if (jogador1){
                                matrizJogoDaVelha[i][j] = "O";
                                // Define o próximo jogador
                                jogadorAtivo = "---- Jogador 2 ----";
                                jogador1 = false;
                                jogadaValida = true;
                                jogadas++;
                                } else {
                                    matrizJogoDaVelha[i][j] = "X";
                                    // Define o próximo jogador
                                    jogadorAtivo = "---- Jogador 1 ----";
                                    jogador1 = true;
                                    jogadaValida = true;
                                    jogadas++;
                                }
                       }


                    }
                }
            }
            if (!jogadaValida) {
                System.out.println("Esta célula não está disponível!");
            }
            jogadaValida = false;
            
            if (jogadas >= 3) {
                if ((matrizJogoDaVelha[0][0].equalsIgnoreCase("O") && matrizJogoDaVelha[0][1].equalsIgnoreCase("O") && matrizJogoDaVelha[0][2].equalsIgnoreCase("O")) ||
                (matrizJogoDaVelha[1][0].equalsIgnoreCase("O") && matrizJogoDaVelha[1][1].equalsIgnoreCase("O") && matrizJogoDaVelha[1][2].equalsIgnoreCase("O")) ||
                (matrizJogoDaVelha[2][0].equalsIgnoreCase("O") && matrizJogoDaVelha[2][1].equalsIgnoreCase("O") && matrizJogoDaVelha[2][2].equalsIgnoreCase("O")) ||
                (matrizJogoDaVelha[0][0].equalsIgnoreCase("O") && matrizJogoDaVelha[1][0].equalsIgnoreCase("O") && matrizJogoDaVelha[2][0].equalsIgnoreCase("O")) ||
                (matrizJogoDaVelha[0][1].equalsIgnoreCase("O") && matrizJogoDaVelha[1][1].equalsIgnoreCase("O") && matrizJogoDaVelha[2][1].equalsIgnoreCase("O")) ||
                (matrizJogoDaVelha[0][2].equalsIgnoreCase("O") && matrizJogoDaVelha[1][2].equalsIgnoreCase("O") && matrizJogoDaVelha[2][2].equalsIgnoreCase("O")) ||
                (matrizJogoDaVelha[0][0].equalsIgnoreCase("O") && matrizJogoDaVelha[1][1].equalsIgnoreCase("O") && matrizJogoDaVelha[2][2].equalsIgnoreCase("O")) ||
                (matrizJogoDaVelha[0][2].equalsIgnoreCase("O") && matrizJogoDaVelha[1][1].equalsIgnoreCase("O") && matrizJogoDaVelha[2][0].equalsIgnoreCase("O"))) {
                    jogadorO = true;
                    terminou = true;
                } else if ((matrizJogoDaVelha[0][0].equalsIgnoreCase("X") && matrizJogoDaVelha[0][1].equalsIgnoreCase("X") && matrizJogoDaVelha[0][2].equalsIgnoreCase("X")) ||
                    (matrizJogoDaVelha[1][0].equalsIgnoreCase("X") && matrizJogoDaVelha[1][1].equalsIgnoreCase("X") && matrizJogoDaVelha[1][2].equalsIgnoreCase("X")) ||
                    (matrizJogoDaVelha[2][0].equalsIgnoreCase("X") && matrizJogoDaVelha[2][1].equalsIgnoreCase("X") && matrizJogoDaVelha[2][2].equalsIgnoreCase("X")) ||
                    (matrizJogoDaVelha[0][0].equalsIgnoreCase("X") && matrizJogoDaVelha[1][0].equalsIgnoreCase("X") && matrizJogoDaVelha[2][0].equalsIgnoreCase("X")) ||
                    (matrizJogoDaVelha[0][1].equalsIgnoreCase("X") && matrizJogoDaVelha[1][1].equalsIgnoreCase("X") && matrizJogoDaVelha[2][1].equalsIgnoreCase("X")) ||
                    (matrizJogoDaVelha[0][2].equalsIgnoreCase("X") && matrizJogoDaVelha[1][2].equalsIgnoreCase("X") && matrizJogoDaVelha[2][2].equalsIgnoreCase("X")) ||
                    (matrizJogoDaVelha[0][0].equalsIgnoreCase("X") && matrizJogoDaVelha[1][1].equalsIgnoreCase("X") && matrizJogoDaVelha[2][2].equalsIgnoreCase("X")) ||
                    (matrizJogoDaVelha[0][2].equalsIgnoreCase("X") && matrizJogoDaVelha[1][1].equalsIgnoreCase("X") && matrizJogoDaVelha[2][0].equalsIgnoreCase("X"))) {
                        jogadorX = true;
                        terminou = true;
                    } else if (jogadas == 9) {
                        System.out.println("Os jogadores empataram!");
                        terminou = true;
                    }
            }
            


        }while (!terminou);

        if (jogadorO) {
            System.out.println("Parabéns ao Jogador 1");
        }else if (jogadorX) {
            System.out.println("Parabéns ao Jogador 2");
        } else {
            System.out.println("Que pena! O jogo terminou empatado");
        }

        // visualização do tabuleiro após a última jogada.
        for (int i = 0; i < matrizJogoDaVelha.length; i++) {
            for (int j = 0; j < matrizJogoDaVelha[i].length; j++) {

                        strututra = "\n    Tabuleiro: \n" +
                                "-------------------\n" +
                        "    " + matrizJogoDaVelha[0][0] + "    " + matrizJogoDaVelha[0][1] + "    " + matrizJogoDaVelha[0][2] + "    \n" +
                        "-------------------\n" +
                        "    " + matrizJogoDaVelha[1][0] + "    " + matrizJogoDaVelha[1][1] + "    " + matrizJogoDaVelha[1][2] + "    \n" +
                        "-------------------\n" +
                        "    " + matrizJogoDaVelha[2][0] + "    " + matrizJogoDaVelha[2][1] + "    " + matrizJogoDaVelha[2][2] + "    \n" +
                        "-------------------\n";
            }
        }

        System.out.println(strututra);


        //versão da professora

         char[][] jogoVelha = new char[3][3];
 
         System.out.println("Jogador 1 = X");
         System.out.println("Jogador 1 = O");
 
         boolean ganhou = false;
         int jogada = 1;
         char sinal;
         int linha = 0, coluna = 0;
 
         while (!ganhou) {
 
             if(jogada % 2 == 1) { //jogador 1
                 System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                 sinal = 'X';
             } else {
                 System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                 sinal = 'O';
             }
 
             boolean linhaValida = false;
             while (!linhaValida) {
                 System.out.println("Entre com a linha (1, 2 ou 3)");
                 linha = scan.nextInt();
                 if(linha >= 1 && linha <= 3) {
                     linhaValida = true;
                 } else {
                     System.out.println("Entrada inválida, tente novamente");
                 }
             }
 
             boolean colunaValida = false;
             while (!colunaValida) {
                 System.out.println("Entre com a coluna (1, 2 ou 3)");
                 coluna = scan.nextInt();
                 if(coluna >= 1 && coluna <= 3) {
                     colunaValida = true;
                 } else {
                     System.out.println("Entrada inválida, tente novamente");
                 }
             }
 
             linha--;
             coluna--;
             if(jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                 System.out.println("Posição já usada, tente novamente");
             } else { //jogada válida
                 jogoVelha[linha][coluna] = sinal;
                 jogada++;
             }
 
             // imprimir o tabuleiro
             for (int i = 0; i < jogoVelha.length; i++) {
                 for (int j = 0; j < jogoVelha[i].length; j++) {
                     System.out.print(jogoVelha[linha][coluna] + " | ");
                 }
                 System.out.println();
             }
             //verifica se tem ganhador
             if((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || //linha 1
             (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || //linha 2
             (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || //linha 3
             (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || //coluna 1
             (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || //coluna 2
             (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || //coluna 3
             (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') //diagonal
              ) {
                 ganhou = true;
                 System.out.println("Parabéns, jogador 1 ganhou!");
             } else if((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || //linha 1
             (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || //linha 2
             (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || //linha 3
             (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || //coluna 1
             (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || //coluna 2
             (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || //coluna 3
             (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') //diagonal
              ) {
                 ganhou = true;
                 System.out.println("Parabéns, jogador 2 ganhou!");
             } else if (jogada > 9){
                 ganhou = true;
                 System.out.println("Ninguém ganhou essa partida");
             }
         }


        // Aula20 exercicio 06 corrigido



         */

         






    }
}
