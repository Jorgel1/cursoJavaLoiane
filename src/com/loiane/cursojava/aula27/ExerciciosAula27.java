package com.loiane.cursojava.aula27;

import java.util.Scanner;

public class ExerciciosAula27 {
    public static void main(String[] args) {

        // Exercícios de Java – Aulas 25 a 27 – OO – Classes e Métodos
        // Link do curso:
        // http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
        // 1. Escreva uma classe para representar uma lâmpada. Desenvolva métodos
        // para ligar, desligar a lampada.

        Lampada lampada = new Lampada();
        lampada.tensaoVolts = 127;
        lampada.potenciaW = 10;
        // lampada.ligarLampada();
        lampada.desligarLampada();

        System.out.println("\nLampada:\n" +
                "tensao = " + lampada.tensaoVolts + "v\n" +
                "potência = " + lampada.potenciaW + "w\n" +
                "A lâmpada está ligada = " + lampada.ligada);

        // 2. Cria uma classe para representar uma conta corrente que possui um
        // número, um saldo, um status que informa se ela é especial ou não, um
        // limite. Desenvolva métodos para realizar saque (verificando se o cliente
        // pode realizar saques), despositar dinheiro, consultar saldo e verificar se o
        // cliente está usando cheque especial ou não. Desenvolva um programa
        // para testar essa classe.

        System.out.println();
        ContaCorrente conta1 = new ContaCorrente();
        conta1.numero = "17500-0";
        conta1.despositar(500);
        conta1.limite = 100;

        System.out.println("Número da conta: " + conta1.numero);
        conta1.especial = true;
        conta1.exibirUsoChequeEspecial();
        System.out.println("Limite da conta " + conta1.limite);
        System.out.println("Saldo: " + conta1.consultarSaldo());
        conta1.exibirUsoChequeEspecial();

        //versao professora
        System.out.println("Conta corrente versão da professora");
        ContaCorrenteProfessora contaCorrenteProfessora = new ContaCorrenteProfessora();
        contaCorrenteProfessora.numero = "123456";
        contaCorrenteProfessora.agencia = "1234";
        contaCorrenteProfessora.especial = true;
        contaCorrenteProfessora.limiteEspecial = 500;
        contaCorrenteProfessora.valorEspecialUsado = 0;
        contaCorrenteProfessora.saldo = -10;

        System.out.println("Saldo da conta " + contaCorrenteProfessora.numero + " = " + contaCorrenteProfessora.saldo);

        boolean saqueEfetuado = contaCorrenteProfessora.realizarSaque(10);

        if (saqueEfetuado) {            
            System.out.println("Saque efetuado com sucesso");
            contaCorrenteProfessora.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        saqueEfetuado = contaCorrenteProfessora.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais");
        if (saqueEfetuado) {            
            System.out.println("Saque efetuado com sucesso");
            contaCorrenteProfessora.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        System.out.println("Deposito de 500 reais");
        contaCorrenteProfessora.depositar(500);
        contaCorrenteProfessora.consultarSaldo();

        if (contaCorrenteProfessora.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque espcial");
        }

        contaCorrenteProfessora.realizarSaque(600);
        contaCorrenteProfessora.consultarSaldo();

        if (contaCorrenteProfessora.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque espcial");
        }

        // 3. Escreva uma class para representar um Aluno. Adicione atributos
        // relacionados às caracteristicas de um Aluno, como nome, matricula, curso
        // que está matriculado, nome de 3 disciplinas que está cursando e as notas
        // dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está
        // aprovado (nota maior ou igual a 7) em uma determinada disciplina.
        // Escreva um programa para testar essa classe, que pede as informações do
        // aluno ao usuário e ao final informa o nome das disciplinas, mostra as
        // notas e mostra se o aluno foi aprovado ou não.

        System.out.println();
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Marcos Costa";
        aluno1.matricula = "1001";
        aluno1.cursoMatriculado = "Ciência da Computação";
        aluno1.disciplinas = new String[3];
        aluno1.disciplinas[0] = "Fundamentos de Programação";
        aluno1.disciplinas[1] = "Sistemas de Computação";
        aluno1.disciplinas[2] = "Desenvolvimento de Software";
        aluno1.notas = new double[aluno1.disciplinas.length];
        aluno1.notas[0] = 7;
        aluno1.notas[1] = 8;
        aluno1.notas[2] = 9;
        System.out.println("Nome do aluno: " + aluno1.nome);
        System.out.println("Matrícula do aluno: " + aluno1.matricula);
        aluno1.verificarAprovacao();

        System.out.println();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Marcos Costa";
        aluno2.matricula = "1001";
        aluno2.cursoMatriculado = "Ciência da Computação";
        aluno2.disciplinas = new String[3];
        aluno2.disciplinas[0] = "Fundamentos de Programação";
        aluno2.disciplinas[1] = "Sistemas de Computação";
        aluno2.disciplinas[2] = "Desenvolvimento de Software";
        aluno2.notas = new double[aluno2.disciplinas.length];
        aluno2.notas[0] = 7;
        aluno2.notas[1] = 6;
        aluno2.notas[2] = 5;
        System.out.println("Nome do aluno: " + aluno2.nome);
        System.out.println("Matrícula do aluno: " + aluno2.matricula);
        aluno2.verificarAprovacao();

        //versao professora
        Scanner scan = new Scanner(System.in);
        AlunoProfessora aluno = new AlunoProfessora();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.cursoMatriculado = scan.next();

        System.out.println("Entre com a matricula");
        aluno.matricula = scan.next();

        //aluno.disciplinas = new String[3];
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++){
            System.out.println("Entre com o nome da disciplina " + (1 + i));
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for(int j = 0; j<aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }
        aluno.mostarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - reprovado");
            }
        }

        // 4. Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva uma classe
        // para representar o Jogo da Velha. Desenvolva uma classe para testar o
        // Jogo.

        System.out.println();
        JodoDaVelha jodoDaVelha = new JodoDaVelha();
        jodoDaVelha.jogar();

    }

    //exerc 03 corrigido 53/98
}
