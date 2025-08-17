package com.loiane.cursojava.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();

        int[] vetor = {1, 4, 5, 8};
        System.out.println(calc.soma(1, 2));
        System.out.println(calc.soma(3.0, 4.0));
        System.out.println(calc.soma(1, 2, 3));
        System.out.println(calc.soma(vetor));
    }
}
