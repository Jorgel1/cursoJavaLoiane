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

         //3 nome de usuário e senha:
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



        //4 validar 5 informações:

        System.out.println("Valide as seguintes informacoes: ");
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
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

        }while ((!sexo.equalsIgnoreCase("f")) || (!sexo.equalsIgnoreCase("m")));

        
        do {
            System.out.println("Estado Civil: 's', 'c', 'v', 'd'");
            estadoCivil = scan.next();
        }while ((!estadoCivil.contains("s")) || estadoCivil.contains("c") || estadoCivil.contains("v") || estadoCivil.contains("d"));



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


 */

    }
    
}
