package com.loiane.cursojava.aula33;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double valorEspecialUsado;
    private double saldo;

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }


    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public boolean isEspecial() {
        return especial;
    }

    public boolean realizarSaque(double quantiaASacar) {
        //tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            System.out.println("Sacando " + quantiaASacar);
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                // verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    System.out.println("Sacando " + quantiaASacar);
                    return true;
                } else {
                    System.out.println("Não foi possível sacar " + quantiaASacar + " (È Especial mas não tem limite disponível).");
                    return false;
                }
            } else {
                System.out.println("Não foi possível sacar " + quantiaASacar + " (Não é especial e não tem saldo suficiente).");
                return false;
            }
        }
    }

    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    public void consultarSaldo() {
        System.out.println("-----------------------------------------");
        System.out.println("Saldo atual da conta = " + saldo);
        System.out.println("Saldo atual do limite Especial = " + getLimiteEspecial());
        System.out.println("Especial: " + isEspecial());
        System.out.println("-----------------------------------------");
    }

    public boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }

}
