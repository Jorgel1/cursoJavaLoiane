package com.loiane.cursojava.aula15;

import java.io.FilterOutputStream;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);

        boolean verddeiro = true;
        boolean falso = false;

        System.out.println(verddeiro && falso);
        System.out.println(verddeiro || falso);
        System.out.println(verddeiro ^ falso);
        System.out.println(!verddeiro && falso);
        System.out.println(!verddeiro || falso);

    }

}
