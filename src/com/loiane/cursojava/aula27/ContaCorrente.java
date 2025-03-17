package com.loiane.cursojava.aula27;

public class ContaCorrente {
    String numero;
    double saldo;
    boolean especial;
    double limite;

    void sacar (double valor){
        if (especial &&  saldo >= valor){
            saldo = saldo - valor;
            System.out.println("Valor sacado = " + valor);
        } else {
            System.out.println("Operação negada! Saldo insuficiente ou Operação não permitida");
        }
    }

    void despositar (double valor){
        saldo = saldo + valor;
        System.out.println("Valor depositado = " + valor);
    }

    double consultarSaldo (){
        return saldo;
    }

    void exibirUsoChequeEspecial () {
        if (especial) {
            System.out.println("Cheque Especial ativo");
        } else {
            System.out.println("Cheque Especial inativo");
        }
    }

    //parei aula51 no exercicio 02

}
