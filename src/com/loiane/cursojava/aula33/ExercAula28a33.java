package com.loiane.cursojava.aula33;

public class ExercAula28a33 {
    public static void main(String[] args) {
        /*
        Exercícios de Java	– Aulas	28 a 33 – OO  – Construtores, encapsulamento e	sobrecarga
Link do curso: http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
Reescreva	os	seguintes	exercícios,	criando	 os	atributos	do	tipo	privado,
métodos	getters	e  settrs  e construtores. Os métodos que se
   */

        // 1. Escreva uma classe para representar  uma lâmpada. Desenvolva métodos para ligar, desligar
        // a lampada.

//        Lampada lampada = new Lampada();
//
//        lampada.ligarLampada(true);

        // ---------------------------------------------------------------------------------

        // 2. Cria	uma classe para representar uma conta corrente que possui um número,
        // um saldo, um status que informa se ela é especial ou não, um limite. Desenvolva
        // métodos para realizar saque (verificando se o cliente pode realizar saques),depositar
        // dinheiro, consultar saldo e veificar se o cliente está usando cheque especial ou não.
// Desenhvolva um programa para testar essa classe.

//        ContaCorrente contaCorrente = new ContaCorrente();
//
//        System.out.println("Verificar uso do Cheque especial: " + contaCorrente.verificarUsoChequeEspecial());
//        contaCorrente.depositar(500);
//        contaCorrente.consultarSaldo();
//        contaCorrente.realizarSaque(100);
//        contaCorrente.consultarSaldo();
//        contaCorrente.realizarSaque(500);
//
//        contaCorrente.consultarSaldo();
//
//        contaCorrente.setLimiteEspecial(1000);
//        System.out.println("Verificar uso do Cheque especial: " + contaCorrente.verificarUsoChequeEspecial());
//
//        contaCorrente.setEspecial(true);
//        System.out.println("Verificar uso do Cheque especial: " + contaCorrente.verificarUsoChequeEspecial());
//        contaCorrente.realizarSaque(1000);
//        System.out.println("Verificar uso do Cheque especial: " + contaCorrente.verificarUsoChequeEspecial());
//        contaCorrente.consultarSaldo();


        // --------------------------------------------------------------------------

//        3. Escreva uma classe para representar um Aluno. Adicione atributos
//        relacionados às caracteristicas de um Aluno, como nome, matricula, curso
//        que está matriculado, nome de 3 disciplinas que está cursando e as notas
//        dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está
//        aprovado (nota maior ou igual a 7) em uma determinada disciplina.
//        Escreva um programa para testar essa classe, que pede as informações do
//            aluno ao usuário e ao final informa o nome das disciplinas, mostra as
//        notas e mostra se o aluno foi aprovado ou não.

        Aluno aluno = new Aluno();
        aluno.setNome("Joel");
        aluno.setMatricula("100");
        aluno.setCursoMatriculado("Ciencia da Computação");

        String[] disciplinas = {"Calculo", "Algoritmos", "Estrutura"};
        aluno.setNomeDisciplinas(disciplinas);

        double[][] notas = {
                {7.0, 8.0, 10.0, 6.0},
                {5.0, 9.0, 8.0, 4.0},
                {7.0, 10.0, 9.0, 8.0}
        };

        aluno.setNotasDisciplinas(notas);

        aluno.mostarInfo();

        for (int i = 0; i < disciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + disciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + disciplinas[i] + " - reprovado");
            }
        }


        // --------------------------------------------------------------------------

//        4. Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva uma classe
//        para representar o Jogo da Velha. Desenvolva uma classe para testar o
//        Jogo.

        // --------------------------------------------------------------------------

        // Fazendo exercicio 4  da aula 60/98
    }
}
