package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        //1 Alo mundo
        System.out.println("Alo mundo");

        //2 peça o número e depois 'O número informado foi '
        System.out.println("Forneça um número: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi " + numero);

        //3 peça dois números e emprima a soma
        System.out.println("Forneça dois números separados por espaço entre eles: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("Resultado: " + resultado);

        //4 Forneça 4 notas para ter uma média:
        System.out.println("Forneça 4 notas separadas por espaço estre elas: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();

        double resultadoNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é: " + resultadoNotas);

        //5 converter metros para centímetros
        System.out.println("Forneça uma medida em metros para converter para centímetros: ");
        double metro = scan.nextDouble();
        double centimetros = metro * 100;
        System.out.println("Resultado: " + centimetros + " Centímetros");



        //6 Calcular a área de um círculo:

        System.out.println("Informe o raio de um cículo para calcular a área: ");
        int raio = scan.nextInt();
        double areaCiculo = 3.14 * (raio * raio);
        System.out.println("A área do círculo é: " + areaCiculo);



        //7 Forneça a medida de um lado para calcular a área.
        System.out.println("Forneça a medida(metros) de um lado para calcular a área: ");
        int lado = scan.nextInt();
        double dobroAreaQuadrado = 2 * (lado * lado);
        System.out.println("O dobro da área do quadrado é: " + dobroAreaQuadrado + " metros");


        //8 Calcular o sálario do mês
        System.out.println("Qual o valor da hora e quantas horas trabalhadas em um mês: ");
        double valorHora = scan.nextDouble();
        int qtdHoraMes = scan.nextInt();
        double calculoDasHoras = valorHora * qtdHoraMes;
        System.out.println("Com o valor de R$ " + valorHora +
                " por hora trabalhada e com a quantidade de " + qtdHoraMes +
                " hora(s) trabalhada(s) é R$: " + calculoDasHoras + " reais");


        //9 converte de Farenheit para Celsius
        System.out.println("Informe qual é a temperatura em Farenheit: ");
        double tempFarenheit = scan.nextDouble();
        double tempCelsius = (tempFarenheit - 32) / 1.8;
        System.out.println(tempFarenheit + " Farenheit é " + tempCelsius + " Graus Celsius");

        //10 converte de graus celsius em farenheit
        System.out.println("Informe qual é a temperatura em Graus Celsius: ");
        double tempCelsius = scan.nextDouble();
        double tempFarenheit = (tempCelsius * 1.8) + 32;
        System.out.println(tempCelsius + " Graus Celsius é " + tempFarenheit + " Farenheit");

        //11 Informe dois números inteiros e um real:
        //O produto do dobro do primeiro com metade do segundo
        //a soma do triplo do primeiro com o terceiro
        //O terceiro elevado ao cubo.
        System.out.println("Informe dois números inteiros e um real: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        double numero3 = scan.nextDouble();

        double resultadoA = (numero1 * 2) * (numero2 / 2);
        double resultadoB = (numero1 * 3) + numero3;
        double resultadoC = (numero3 * numero3 * numero3);
        System.out.println("O produto do dobro do primeiro[" + numero1 +
                "] com metade do segundo [" + numero2 + "] = " + resultadoA);
        System.out.println("A soma do triplo do primeiro [" + numero1 +
                "] com o terceiro [" + numero3 + "] = " + resultadoB);
        System.out.println("O terceiro[" + numero3 + "] elevado ao cubo = " + resultadoC);

        //12Calcular o peso ideal usando a formula (72.7 * altura) -58
        System.out.println("Informe a altura para calcular o peso ideal: ");
        double altura = scan.nextDouble();
        double resultadoPesoIdeal = (72.7 * altura) -58;
        System.out.println("Resultado do peso ideal é: " + resultadoPesoIdeal);

         */

        //13 Calcular a multa de 4,00 reais por kilo que exceder 50 kilos.
        System.out.println("Informe o peso total dos peixes: ");
        double pesoPeixe = scan.nextDouble();
        double excesso = 0;
        double multa = 0;
        if (pesoPeixe > 50) {
            excesso = pesoPeixe - 50;
            multa = excesso * 4;
        }
        System.out.println("Total do peso do peixe= " + pesoPeixe +
                " kilos, excesso= " + excesso + " kilo(s), multa a ser paga= " + multa + " reais");



    }
}
