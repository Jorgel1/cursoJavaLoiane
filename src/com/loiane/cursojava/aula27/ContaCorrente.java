package com.loiane.cursojava.aula27;

public class ContaCorrente {
    String numero;
    double saldo;
    boolean especial;
    double limite;

    void sacar (double valor){
        if (especial &&  saldo > valor){
            saldo = saldo - valor;
            System.out.println("\nValor sacado = " + valor);
        } else {
            System.out.println("\nOperação negada! Saldo insuficiente ou Operação não permitida");
        }
    }

    void despositar (double valor){
        saldo = saldo + valor;
        System.out.println("\nValor depositado = " + valor);
    }

    double obterSaldo (){
        return saldo;
    }

    void exibirUsoChequeEspecial () {
        if (especial) {
            System.out.println("\nCheque Especial ativo");
        } else {
            System.out.println("\nCheque Especial inativo");
        }
    }

    //parei aula51 no exercicio 02

}
