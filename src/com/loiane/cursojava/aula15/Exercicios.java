package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
/*
       //1 O maior número
        System.out.println("Forneça dois números: ");
        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();

        if(numero1 > numero2){
        System.out.println("O número 1 é maior que o número 2");
        } else{
            System.out.println("O número 2 é maior que o número 1");
        }


        //2 Positivo ou negativo
        System.out.println("Forneça um valor: ");
        double valor1 = scan.nextDouble();

        if (valor1 > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }

        //3 Sexo pela letra

        System.out.println("Forneça a letra do sexo.");

        String letra = scan.next();

        switch (letra) {
            case "F": System.out.println("Feminino"); break;
            case "M": System.out.println("Masculino"); break;        
            default: System.out.println("Sexo inválido.");
        }
            */

            //4 verifica se é vogal ou consoante

            System.out.println("Forneça uma vogal ou consoante:");

            String vogalOuConsoante = scan.next();

            switch (vogalOuConsoante) {
                case "a" : 
                case "e" : 
                case "i" : 
                case "o" : 
                case "u" : System.out.println("É uma vogal."); break;       
                default:System.out.println("Uma consoante.");                    
            }

    }
    
}
