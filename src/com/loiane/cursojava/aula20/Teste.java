package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "";
        int valor;
        System.out.println("Digite um valor:");
        str = scan.next();
        valor = Integer.parseInt(str);
        if (valor == 0) {
            System.out.println("O valor é " + valor);
        } else {
            System.out.println("Outro");
        }
    }
}