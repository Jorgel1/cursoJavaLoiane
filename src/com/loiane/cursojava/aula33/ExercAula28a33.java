package com.loiane.cursojava.aula33;

import com.loiane.cursojava.aula27.JodoDaVelha;
import com.loiane.cursojava.aula33.JogoDaVelhaProfessora;

import java.util.Scanner;

public class ExercAula28a33 {
    public static void main(String[] args) {
        /*
         * Exercícios de Java – Aulas 28 a 33 – OO – Construtores, encapsulamento e
         * sobrecarga
         * Link do curso:
         * http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
         * Reescreva os seguintes exercícios, criando os atributos do tipo privado,
         * métodos getters e settrs e construtores. Os métodos que se
         */

        // 1. Escreva uma classe para representar uma lâmpada. Desenvolva métodos para
        // ligar, desligar
        // a lampada.

        // Lampada lampada = new Lampada("Led", 127, 5, true);

        // lampada.descricao();
        // lampada.ligarLampada();
        // lampada.mostrarEstado();
        // lampada.desligarLampada();
        // lampada.mostrarEstado();
        // lampada.descricao();

        // ---------------------------------------------------------------------------------

        // 2. Cria uma classe para representar uma conta corrente que possui um número,
        // um saldo, um status que informa se ela é especial ou não, um limite.
        // Desenvolva
        // métodos para realizar saque (verificando se o cliente pode realizar
        // saques),depositar
        // dinheiro, consultar saldo e veificar se o cliente está usando cheque especial
        // ou não.
        // Desenhvolva um programa para testar essa classe.

        // ContaCorrente contaCorrente = new ContaCorrente();
        //
        // System.out.println("Verificar uso do Cheque especial: " +
        // contaCorrente.verificarUsoChequeEspecial());
        // contaCorrente.depositar(500);
        // contaCorrente.consultarSaldo();
        // contaCorrente.realizarSaque(100);
        // contaCorrente.consultarSaldo();
        // contaCorrente.realizarSaque(500);
        //
        // contaCorrente.consultarSaldo();
        //
        // contaCorrente.setLimiteEspecial(1000);
        // System.out.println("Verificar uso do Cheque especial: " +
        // contaCorrente.verificarUsoChequeEspecial());
        //
        // contaCorrente.setEspecial(true);
        // System.out.println("Verificar uso do Cheque especial: " +
        // contaCorrente.verificarUsoChequeEspecial());
        // contaCorrente.realizarSaque(1000);
        // System.out.println("Verificar uso do Cheque especial: " +
        // contaCorrente.verificarUsoChequeEspecial());
        // contaCorrente.consultarSaldo();

        // --------------------------------------------------------------------------

        // 3. Escreva uma classe para representar um Aluno. Adicione atributos
        // relacionados às caracteristicas de um Aluno, como nome, matricula, curso
        // que está matriculado, nome de 3 disciplinas que está cursando e as notas
        // dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está
        // aprovado (nota maior ou igual a 7) em uma determinada disciplina.
        // Escreva um programa para testar essa classe, que pede as informações do
        // aluno ao usuário e ao final informa o nome das disciplinas, mostra as
        // notas e mostra se o aluno foi aprovado ou não.

        // Aluno aluno = new Aluno();
        // aluno.setNome("Joel");
        // aluno.setMatricula("100");
        // aluno.setCursoMatriculado("Ciencia da Computação");
        //
        // String[] disciplinas = {"Calculo", "Algoritmos", "Estrutura"};
        // aluno.setNomeDisciplinas(disciplinas);
        //
        // double[][] notas = {
        // {7.0, 8.0, 10.0, 6.0},
        // {5.0, 9.0, 8.0, 4.0},
        // {7.0, 10.0, 9.0, 8.0}
        // };
        //
        // aluno.setNotasDisciplinas(notas);
        //
        // aluno.mostarInfo();
        //
        // for (int i = 0; i < disciplinas.length; i++) {
        // if (aluno.verificarAprovado(i)) {
        // System.out.println("Disciplina " + disciplinas[i] + " - foi aprovado");
        // } else {
        // System.out.println("Disciplina " + disciplinas[i] + " - reprovado");
        // }
        // }

        // Versão da professora:

        //     Scanner scan = new Scanner(System.in);

        //     AlunoProfessora aluno = new AlunoProfessora();

        //     System.out.println("Entre com o nome do aluno");
        //     aluno.setNome(scan.next());

        //     System.out.println("Entre com o nome do curso");
        //     aluno.setNomeCurso(scan.next());

        //     System.out.println("Entre com a matricula");
        //     aluno.setMatricula(scan.next());

        //     // aluno.nomeDisciplinas = new String[3];
        //     for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
        //         System.out.println("Entre com o nome da disciplina " + i);
        //         aluno.setNomeDisciplinaPos(i, scan.next());
        //     }

        //     for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
        //         System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
        //         for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
        //             System.out.println("Entre com a nota " + (j + 1));
        //             aluno.setNomePosIJ(i, j, scan.nextDouble());
        //         }
        //     }

        //     aluno.mostrarInfo();

        //     for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
        //         if (aluno.verificarAprovado(i)) {
        //             System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
        //         } else {
        //             System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - reprovado");
        //         }
        //     }
        // }

        // --------------------------------------------------------------------------

        // 4. Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva uma classe
        // para representar o Jogo da Velha. Desenvolva uma classe para testar o
        // Jogo.

        // --------------------------------------------------------------------------

        // Scanner scan = new Scanner(System.in);

        // JogoVelha jogoDaVelha = new JogoVelha();

        // System.out.println("Jogador 1 = X");
        // System.out.println("Jogador 2 = O");

        // boolean ganhou = false;
        // char sinal;
        // int linha = 0, coluna = 0;

        // while (!ganhou) {

        // if (jogoDaVelha.vezJogador1()) {

        // System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
        // sinal = 'X';
        // } else {

        // System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
        // sinal = 'O';
        // }

        // linha = valor("Linha", scan);
        // coluna = valor("Coluna", scan);

        // if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
        // System.out.println("Posição já usada, tente novamente");
        // }

        // jogoDaVelha.imprimirTabuleiro();

        // if (jogoDaVelha.verificarGanhador('X')) {
        // ganhou = true;
        // System.out.println("Parabéns, jogador 1 ganhou!");
        // } else if (jogoDaVelha.verificarGanhador('O')) {
        // ganhou = true;
        // System.out.println("Parabéns, jogador 2 ganhou!");
        // } else if (jogoDaVelha.jogada > 9) {
        // ganhou = true;
        // System.out.println("Ninguém ganhou essa partida.");
        // }
        // }

        // Versão professora        

        Scanner scan = new Scanner(System.in);

        JogoDaVelhaProfessora jogoDaVelha = new JogoDaVelhaProfessora();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while(!ganhou) {

            if (jogoDaVelha.vezJogador1()) {

                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            } else {

                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';
            }

            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
                System.out.println("Posição já usada, tente novamente");
            }

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if (jogoDaVelha.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if (jogoDaVelha.getJogada() > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }
        }

    }

    static int valor(String tipoValor, Scanner scan) {
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida) {
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
        valor--;
        return valor;
    }

    // Corrigido exercicio 4 da aula 64/98
}
