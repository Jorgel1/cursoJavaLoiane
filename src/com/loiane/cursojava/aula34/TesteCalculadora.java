
package com.loiane.cursojava.aula34;

import com.loiane.cursojava.aula33.MinhaCalculadora;

import java.util.Scanner;


public class TesteCalculadora {

   static int resultSoma;

    public static void main(String[] args) {
//        MinhaCalculadora calc = new MinhaCalculadora();

       resultSoma = MInhaCalculadora.soma(1, 2);
//
//        char opcao;
//        int num1 = 0;
//        int num2 = 0;
//        int num3 = 0;
//        double numDec1;
//        double numDec2;
//        int resultadoSoma2Valores;
//
//        //calc.soma(1, 2);
//
//        MInhaCalculadora.soma(1, 2);
//
//        resultadoSoma2Valores = soma2Valores(1, 2);
//
//        int[] vetor = {1, 4, 5, 8};
//        System.out.println(calc.soma(1, 2));
//        System.out.println(calc.soma(3.0, 4.0));
//        System.out.println(calc.soma(1, 2, 3));
//        System.out.println(calc.soma(vetor));

        /*
        2. Escreva uma classe Calculadora que tenha os seguintes métodos:
         somar, subtrair, multiplicar, dividir (dois números), elevar à potência n.
         Desenvolva um programa para testar essa classe.

        */

//        System.out.println("-- Calculadora ---");
//        System.out.println("-Escolha uma opção: \n 1 - Somar 2 números inteiros\n 2 - Somar 2 números decimais\n 3 - Somar 3 números inteiros");
//        System.out.println("4 - Subtrair 2 números inteiros\n 5 - Multiplicar 2 números inteiros\n 6 - Dividir 2 números inteiros\n 7 - Expoente\n Qualquer caracteres para sair.");
//        Scanner scan = new Scanner(System.in);
//        opcao = scan.next().charAt(0);
//
//        if (opcao == '1') {
//            System.out.println("  Digite o primeiro número: ");
//            numDec1 = scan.nextDouble();
//            System.out.println("  Digite o segundo número: ");
//            numDec2 = scan.nextDouble();
//
//            if (opcao == '2') {
//                System.out.println("  Digite o primeiro número: ");
//                numDec1 = scan.nextDouble();
//                System.out.println("  Digite o segundo número: ");
//                numDec2 = scan.nextDouble();
//            }
//            if (opcao == '3') {
//                System.out.println("  Digite o primeiro número: ");
//                num1 = scan.nextInt();
//                System.out.println("  Digite o segundo número: ");
//                num2 = scan.nextInt();
//                System.out.println("  Digite o terceiro número: ");
//                num3 = scan.nextInt();
//            }
//            if ((opcao == '4') || (opcao == '5') || (opcao == '6')) {
//                System.out.println("  Digite o primeiro número: ");
//                num1 = scan.nextInt();
//                System.out.println("  Digite o segundo número: ");
//                num2 = scan.nextInt();
//            }
//            if (opcao == '7') {
//                System.out.println("  Digite o número inteiro para base: ");
//                num1 = scan.nextInt();
//                System.out.println("  Digite o número inteiro para o expoente: ");
//                num2 = scan.nextInt();
//            }

//            System.out.println("  Digite o primeiro número: ");
//            numDec1 = scan.nextInt();
//            System.out.println("  Digite o segundo número: ");
//            numDec2 = scan.nextInt();
//
//            switch (opcao) {
//                case '1':
//                    System.out.println("Resultado: " + calc.soma(numDec1, numDec2));
//                    break;
//                case '2':
//                    System.out.println("Resultado: " + calc.soma(num1, num2));
//                    break;
//                case '3':
//                    System.out.println("Resultado: " + calc.soma(num1, num2, num3));
//                    break;
//                case '4':
//                    System.out.println("Resultado: " + calc.subtrair(num1, num2));
//                    break;
//                case '5':
//                    System.out.println("Resultado: " + calc.multiplicar(num1, num2));
//                    break;
//                case '6':
//                    System.out.println("Resultado: " + calc.dividir(num1, num2));
//                    break;
//                case '7':
//                    System.out.println("Resultado: " + calc.elevarPotencia(num1, num2));
//                    break;
//                default:
//                    System.out.println("Saindo ...");
//            }


        /*  -------------------------------------------------------------------------- */

            /*
            3. Escreva um método para calcular factorial de um número na classe
            Calculadora do exercício anterior.
             */

//            Fatorial fatorial = new Fatorial();
//            fatorial.calcFatorial();
//
//            System.out.println("-----------------------------");

        /*  -------------------------------------------------------------------------- */


                    /*

         4. Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos
        para conversão das unidades de área segundo a lista abaixo.

        • 1 metro quadrado = 10.76 pés quadrados
        • 1 pé quadrado = 929 centímetros quadrados
        • 1 milha quadrada = 640 acres
        • 1 acre = 43.560 pés quadrados

         */

//        double pes = ConversaoDeUnidadesDeArea.metro2ParaPes2();
//        System.out.println("Resultado: " + pes + " Pés ao quadrado. ");
//
//        double centimetros = ConversaoDeUnidadesDeArea.pes2ParaCent2();
//        System.out.println("Resultado: " + centimetros + " Centímetros ao quadrado. ");
//
//        double acres = ConversaoDeUnidadesDeArea.milha2ParaAcres2();
//        System.out.println("Resultado: " + acres + " Acres ao quadrado. ");
//
//        pes = ConversaoDeUnidadesDeArea.acre2ParaPes2();
//        System.out.println("Resultado: " + pes + " Pés ao quadrado. ");

        System.out.println("-----------------------------");

        /*  -------------------------------------------------------------------------- */

        //        Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos
        //        para conversão das unidades de volume segundo a lista abaixo.
        //• 1 litro = 1000 centímetros cúbicos
        //• 1 metro cúbico = 1000 litros
        //• 1 metro cúbico = 35.32 pés cúbicos
        //• 1 galão americano = 231 polegadas cúbicas
        //• 1 galão americano = 3.785 litros

        //converte litros para centímetros cúbicos
        double cent3 = ConversaoDeUnidadesDeVolume.ltParaCent3();
        System.out.println("Resultado: " + cent3 + " centímetros cúbicos. ");

        //converte metro cúbico para litros
        double lt = ConversaoDeUnidadesDeVolume.m3ParaLt();
        System.out.println("Resultado: " + lt + " litros. ");

        //converte metro cúbico  para pes cúbicos
        double pes3 = ConversaoDeUnidadesDeVolume.m3ParaPes3();
        System.out.println("Resultado: " + pes3 + " pés cúbicos. ");

        //converte galão americano  para polegadas cúbicos
        double pol3 = ConversaoDeUnidadesDeVolume.galaoAmerParapol3();
        System.out.println("Resultado: " + pol3 + " polegadas cúbicas. ");

        //converte galão americano  para litros
        double litro = ConversaoDeUnidadesDeVolume.galaoAmerParaLl();
        System.out.println("Resultado: " + litro + " litros. ");

        System.out.println("-----------------------------");

        /*  -------------------------------------------------------------------------- */


        // aula 65/98 exerc 5 resolvido



    }

        static int soma2Valores(int num1, int num2) {
            return MInhaCalculadora.soma(num1, num2);
        }
}
