package com.loiane.cursojava.aula33;

public class MinhaCalculadora {
    public int soma(int num1, int num2){
        return num1 + num2;
    }

    public double soma(double num1, double num2){
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int soma(int[] vetorInteiros){
        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }

        return total;
    }

     public int subtrair(int num1, int num2){
        return num1 - num2;
    }

     public int dividir(int num1, int num2){
        return num1 / num2;
    }

     public int elevarPotencia(int base, int expoente){
        return (int) Math.pow(base, expoente);
    }


    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
}
