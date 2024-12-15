package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1 pedir uma nota de zero a 10 e finalizar quando o valor for inválido
/*
        double nota;
        System.out.println("Forneça uma nota entre zero e dez: ");
        do {            
            nota = scan.nextDouble();
            if(nota < 0 || nota > 10){
                System.out.println("Nota inválida");
            }
        } while(nota < 0 || nota > 10);

         //2 nome de usuário e senha:
        System.out.println("Informe o nome do usuário:");
        String nomeUsuario = scan.next();
        String senhaUsuario;        
        do {
            System.out.println("Informe a senha do usuário:");
            senhaUsuario = scan.next();
            if (nomeUsuario.equals(senhaUsuario)) {
                System.out.println("Erro");
            }
        }while (nomeUsuario.equals(senhaUsuario));
        System.out.println("Usuário conectado ...");

            //3 validar 5 informações:

        System.out.println("Valide as seguintes informacoes: ");
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        boolean sair = false;
        do {
            System.out.println("Nome: maior que 3 caracteres");
            nome = scan.next();
        }while (nome.length() <= 3);

        do {
            System.out.println("Idade: entre 0 e 150");
            idade = scan.nextInt();
        }while (idade < 0 || idade > 150);

        do {
            System.out.println("Salario: maior que zero" );
            salario = scan.nextDouble();
        }while (salario <= 0);


        do {
            System.out.println("Sexo: 'f' ou 'm.'");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                sair = true;
            }
        }while (!sair);

        sair = false;
        do {
            System.out.println("Estado Civil: 's', 'c', 'v', 'd'");
            estadoCivil = scan.next();
            if (estadoCivil.contains("s") || estadoCivil.contains("c") || estadoCivil.contains("v") || estadoCivil.contains("d")){
                sair = true;
            }

        }while (!sair);

        System.out.println("Informações salvas: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);


        //4 quantos anos para igualar a populaçao

        int populacaoA = 80000;
        int populacaoB = 200000;
        int anos = 0;

        while (populacaoA <= populacaoB){
            populacaoA += populacaoA/100 * 3;
            populacaoB += populacaoA/100 * 1.5;
            anos++;
        }

        System.out.println("Quantidade de anos necessários: " + anos);
        System.out.println("População A " + populacaoA);
        System.out.println("População B " + populacaoB);


        //5 quantos anos para igualar a populaçao, o usuario que escolhe os dados:


        int populacaoA;
        int populacaoB;
        double percentA;
        double percentB;
               int anos = 0;
           do {
               System.out.println("Informe a população A: ");
               populacaoA = scan.nextInt();
           }while (populacaoA < 0);

        do {
            System.out.println("Informe a população B: ");
            populacaoB = scan.nextInt();
            }while (populacaoB < 0);

        do {
            System.out.println("Informe o percentual A: ");
            percentA = scan.nextDouble();
        }while (percentA < 0);

        do {
            System.out.println("Informe o percentual B: ");
            percentB = scan.nextDouble();
        }while (percentB < 0);


       while (populacaoA <= populacaoB){
           populacaoA += populacaoA/100 * percentA;
          populacaoB += populacaoA/100 * percentB;
           anos++;
        }

        System.out.println("Quantidade de anos necessários: " + anos);
        System.out.println("População A " + populacaoA);
        System.out.println("População B " + populacaoB);




        //6 - 1 a 20 um em baixo do outro e 1 a 20 um do lado do outro.

        System.out.println("Numero 1 a 20 um em baixo do outro.");
        for (int i = 1; i < 21; i++){
            System.out.println(i);
        }

        System.out.println("Numero 1 a 20 um ao lado do outro.");
        for (int i = 1; i < 21; i++){
            System.out.print(i + " ");
        }


    //7 ler 5 números e informar o maior deles.
        int num;
        int numMax = -99;

        System.out.println("Informe 5 números: ");
        for (int i = 0; i < 5; i++) {
            num = scan.nextInt();
            if (numMax < num){
                numMax = num;
            }
        }
        System.out.println("O maior é " + numMax);


    //8 leia 5 números e informar a soma e a média deles.

        int num;
        double numSoma = 0;
        double numMedia;

        System.out.println("Informe 5 números: ");

        for (int i = 0; i < 5; i++){
            num = scan.nextInt();
            numSoma += num;
        }
        numMedia = numSoma / 5;
        System.out.println("A soma dos números: " + numSoma);
        System.out.println("A média dos números: " + numMedia);


        //9 imprimir números ímpares entre 1 e 50

        System.out.println("O números ímpares: ");
        for (int i = 0; i < 50; i++){
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }


        //10 forneça 2 números inteiros para mostrar o intervalo entre eles.

        System.out.println("Forneça 2 números inteiros: ");

        int numA = scan.nextInt();
        int numB = scan.nextInt();

        System.out.println("O intervalo entre os números " + numA + " e " + numB);
        for (int i = numA; i <= numB; i++) {
            System.out.print(i + " ");
        }


        //11 forneça 2 números inteiros para mostrar o intervalo e a soma entre eles

        System.out.println("Forneça 2 números inteiros: ");

        int numSoma = 0;
        int numA = scan.nextInt();
        int numB = scan.nextInt();

        System.out.println("O intervalo entre os números " + numA + " e " + numB);
        for (int i = numA; i <= numB; i++) {
            System.out.print(i + " ");
            numSoma += i;
        }

        System.out.println("\nA soma entre os números " + numA + " e " + numB + ": " + numSoma);



        //12 Informe um número de 1 a 10 para mostrar a tabuada

        System.out.println("Informe um número de 1 a 10 para mostrar a tabuada: ");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        //13 calculo de potência

        int base;
        int expoente;
        int resultado;

        System.out.println("Informe a base da potência: ");
        base = scan.nextInt();

        System.out.println("Informe o expoente da potência: ");
        expoente = scan.nextInt();
        resultado = base;
        if (expoente == 0){
            resultado = 1;
        } else if (expoente == 1) {
            resultado = base;
        } else {
            for (int i = 2; i <= expoente; i++) {
                resultado *= base;
            }
        }
        System.out.println("A potência de " + base + " elevado ao " + expoente + " é: " + resultado);



        //14 Informe 10 números e mostres os pares e os ímpares

        int num;
        int numPar = 0;
        int numImpar = 0;

        System.out.println("Informe 10 números:");
        for (int i = 0; i < 10; i++) {
            num = scan.nextInt();
            if (num % 2 ==  0) {
                numPar++;
            } else {
                numImpar++;
            }
        }
        System.out.println("Quantidade de números pares: " + numPar);
        System.out.println("Quantidade de números ímpares: " + numImpar);



        //15 fibonacci até um certo termo

        System.out.println("Informe um certo número de termo para cálculo do fibonacci: ");
        int numTermo = scan.nextInt();
        System.out.println("Seguência Fibonacci de acordo com o termo de número " + numTermo + ":");
        int resultado = 0;
        int anterior = 0;
        int atual = 1;

            for (int i = 1; i <= numTermo; i++) {
                if (i == 1){
                    System.out.print(resultado + " ");
                }
                if (i == 2){
                    resultado = 1;
                    System.out.print(resultado + " ");
                }
                if (i > 2) {
                    resultado = anterior + atual;
                    System.out.print(resultado + " ");
                    anterior = atual;
                    atual = resultado;
                }
            }



        //16 fibonacci até um certo termo

        System.out.println("Informe um certo número de termo para cálculo do fibonacci: ");
        int numTermo = Integer.MAX_VALUE;
        System.out.println("Seguência Fibonacci de acordo com o termo de número " + numTermo + ":");
        int resultado = 0;
        int anterior = 0;
        int atual = 1;
        int valorSolicitado = 500;

        for (int i = 1; i <= numTermo; i++) {
            if (i == 1){
                System.out.print(resultado + " ");
            }
            if (i == 2){
                resultado = 1;
                System.out.print(resultado + " ");
            }
            if (i > 2) {
                resultado = anterior + atual;
                System.out.print(resultado + " ");
                anterior = atual;
                atual = resultado;
               if (resultado >= valorSolicitado){
                   numTermo = i;
               }
            }
        }



        //17 calcular o fatorial de um determinado número
        System.out.println("Informe o número do fatorial: ");
        int num = scan.nextInt();
        int fat = num;

        for (int i = num; i > 0; i--) {
            if (i >= 2) {
                System.out.println(fat + " x " + (i - 1) + " ");
                fat *= i - 1;
            }
        }
        System.out.println("Fatorial de " + num + " é: " + fat);



        //18 Determinar se é um número primo:

        System.out.println("Informe um número para verificar se é primo:");
        int num = scan.nextInt();
        boolean verifica = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    verifica = false;
                }
            }
           if (verifica){
               System.out.println(num + " É primo");
           } else {
               System.out.println(num + " Não é primo");
           }
        } else {
            System.out.println("Informe um número maior que 1!");
        }



        //19 media aritmética
        int num = 4;
        double soma = 0;
        double mediaAritmetica;

        System.out.println("Informe " + num + " para calcular a média aritmética:");

        for (int i = 0; i < num; i++) {
            soma += scan.nextInt();
        }
            mediaAritmetica = soma / num;
            System.out.println("Média aritmética de " + num + " números é: " + mediaAritmetica);


 */
        //20





    }
    
}
