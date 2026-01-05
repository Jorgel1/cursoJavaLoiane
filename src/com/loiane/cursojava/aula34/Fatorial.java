package com.loiane.cursojava.aula34;

import java.util.Scanner;

public class Fatorial {

    Scanner scan = new Scanner(System.in);

    //17 calcular o fatorial de um determinado número
//        System.out.println("Informe o número do fatorial: ");
//    int num = scan.nextInt();
//    int fat = num;
//
//        for (int i = num; i > 0; i--) {
//        if (i >= 2) {
//            System.out.println(fat + " x " + (i - 1) + " ");
//            fat *= i - 1;
//        }
//    }
//        System.out.println("Fatorial de " + num + " é: " + fat);

    //17 versão da professora

    //
//
    public void calcFatorial() {
        System.out.println("Digite um número:");
        int num = scan.nextInt();
        System.out.print(num + "! = ");

        int fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
            //System.out.println(i);

        }
        System.out.println(fatorial);
        System.out.println("Resultado: " + fatorial);
    }


}
