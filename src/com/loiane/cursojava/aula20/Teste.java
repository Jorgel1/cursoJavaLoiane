package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String str = "";
//        int valor;
//        System.out.println("Digite um valor:");
//        str = scan.next();
//        valor = Integer.parseInt(str);
//        if (valor == 0) {
//            System.out.println("O valor é " + valor);
//        } else {
//            System.out.println("Outro");
//        }

        String[] str = new String[3];
        String strutura = "";

        for (int i = 0; i < str.length; i++) {
            str[i] = "" + i;
            strutura = "\n--" + str[0] + "--" + str[1] + "--" + str[2] + "--\n";
            System.out.println(strutura);
        }
        System.out.println();

        for (int i = 0; i < str.length; i++) {
            if (i % 2 == 0) {
                str[i] = "a";
            } else {
                str[i] = "b";
            }
            System.out.println(strutura);
        }


    }
}