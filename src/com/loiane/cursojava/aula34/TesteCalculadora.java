
package com.loiane.cursojava.aula34;

import com.loiane.cursojava.aula33.MinhaCalculadora;

import java.util.Scanner;

public class TesteCalculadora {

    static int resultSoma;

    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();

        resultSoma = MInhaCalculadora.soma(1, 2);

        char opcao;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        double numDec1;
        double numDec2;
        int resultadoSoma2Valores;

        //calc.soma(1, 2);

        MInhaCalculadora.soma(1, 2);

        resultadoSoma2Valores = soma2Valores(1, 2);

        int[] vetor = {1, 4, 5, 8};
        System.out.println(calc.soma(1, 2));
        System.out.println(calc.soma(3.0, 4.0));
        System.out.println(calc.soma(1, 2, 3));
        System.out.println(calc.soma(vetor));

        /*
        2. Escreva uma classe Calculadora que tenha os seguintes métodos:
         somar, subtrair, multiplicar, dividir (dois números), elevar à potência n.
         Desenvolva um programa para testar essa classe.

        */

        System.out.println("-- Calculadora ---");
        System.out.println("-Escolha uma opção: \n 1 - Somar 2 números inteiros\n 2 - Somar 2 números decimais\n 3 - Somar 3 números inteiros");
        System.out.println("4 - Subtrair 2 números inteiros\n 5 - Multiplicar 2 números inteiros\n 6 - Dividir 2 números inteiros\n 7 - Expoente\n Qualquer caracteres para sair.");
        Scanner scan = new Scanner(System.in);
        opcao = scan.next().charAt(0);

        if (opcao == '1') {
            System.out.println("  Digite o primeiro número: ");
            numDec1 = scan.nextDouble();
            System.out.println("  Digite o segundo número: ");
            numDec2 = scan.nextDouble();

            if (opcao == '2') {
                System.out.println("  Digite o primeiro número: ");
                numDec1 = scan.nextDouble();
                System.out.println("  Digite o segundo número: ");
                numDec2 = scan.nextDouble();
            }
            if (opcao == '3') {
                System.out.println("  Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.println("  Digite o segundo número: ");
                num2 = scan.nextInt();
                System.out.println("  Digite o terceiro número: ");
                num3 = scan.nextInt();
            }
            if ((opcao == '4') || (opcao == '5') || (opcao == '6')) {
                System.out.println("  Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.println("  Digite o segundo número: ");
                num2 = scan.nextInt();
            }
            if (opcao == '7') {
                System.out.println("  Digite o número inteiro para base: ");
                num1 = scan.nextInt();
                System.out.println("  Digite o número inteiro para o expoente: ");
                num2 = scan.nextInt();
            }

            System.out.println("  Digite o primeiro número: ");
            numDec1 = scan.nextInt();
            System.out.println("  Digite o segundo número: ");
            numDec2 = scan.nextInt();

            switch (opcao) {
                case '1':
                    System.out.println("Resultado: " + calc.soma(numDec1, numDec2));
                    break;
                case '2':
                    System.out.println("Resultado: " + calc.soma(num1, num2));
                    break;
                case '3':
                    System.out.println("Resultado: " + calc.soma(num1, num2, num3));
                    break;
                case '4':
                    System.out.println("Resultado: " + calc.subtrair(num1, num2));
                    break;
                case '5':
                    System.out.println("Resultado: " + calc.multiplicar(num1, num2));
                    break;
                case '6':
                    System.out.println("Resultado: " + calc.dividir(num1, num2));
                    break;
                case '7':
                    System.out.println("Resultado: " + calc.elevarPotencia(num1, num2));
                    break;
                default:
                    System.out.println("Saindo ...");
            }


            /*  -------------------------------------------------------------------------- */

            /*
            3. Escreva um método para calcular factorial de um número na classe
            Calculadora do exercício anterior.
             */

            Fatorial fatorial = new Fatorial();
            fatorial.calcFatorial();

            System.out.println("-----------------------------");

        /*  -------------------------------------------------------------------------- */



            // aula 65/98 exerc 2 resolvido
        }


    }

    static int soma2Valores(int num1, int num2) {
        return MInhaCalculadora.soma(num1, num2);
    }
}
