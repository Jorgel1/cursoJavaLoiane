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

            
            //5 leitura de duas notas e calcular a média
            System.out.println("Digite a primeira nota: ");
            double nota1 = scan.nextDouble();
            System.out.println("Digite a primeira nota: ");
            double nota2 = scan.nextDouble();
            double media = (nota1 + nota2) /2;

            if (media == 10) {    
                System.out.println("Aprovado com Distinção");
               }
           else if (media >= 7) {    
            System.out.println("Aprovado");
           } else{
            System.out.println("Reprovado");
           }

          
            //6 o maior entre os três
           System.out.println("Digite o primeiro número: ");
           double numero1 = scan.nextDouble();
           System.out.println("Digite o segundo número: ");
           double numero2 = scan.nextDouble();
           System.out.println("Digite o terceiro número: ");
           double numero3 = scan.nextDouble();

           if (numero1 > numero2 && numero1 > numero3) {
                System.out.println("O número 1[" + numero1 + "] é o maior");           
            } else if (numero2 > numero3) {
                System.out.println("O número 2[" + numero2 +"] é o maior");            
            } else {
                System.out.println("O número 3 [" + numero3 + "] é o maior");
            }   

             
            //7 o maior e o menor dos três
             System.out.println("Digite o primeiro número: ");
             double numero1 = scan.nextDouble();
             System.out.println("Digite o segundo número: ");
             double numero2 = scan.nextDouble();
             System.out.println("Digite o terceiro número: ");
             double numero3 = scan.nextDouble();
  
             if (numero1 > numero2 && numero1 > numero3) {
                  System.out.println("O número 1[" + numero1 + "] é o maior"); 

              } else if (numero2 > numero3) {
                  System.out.println("O número 2[" + numero2 +"] é o maior");            
              } else {
                  System.out.println("O número 3 [" + numero3 + "] é o maior");
              }   

              if (numero1 < numero2 && numero1 < numero3) {
                System.out.println("O número 1[" + numero1 + "] é o menor"); 

            } else if (numero2 < numero3) {
                System.out.println("O número 2[" + numero2 +"] é o menor");            
            } else {
                System.out.println("O número 3 [" + numero3 + "] é o menor");
            }   

            

            //8 mostrar o mais barato
            System.out.println("Digite preço do produto 1: ");
            double preço1 = scan.nextDouble();
            System.out.println("Digite preço do produto 2: ");
            double preço2 = scan.nextDouble();
            System.out.println("Digite preço do produto 3 ");
            double preço3 = scan.nextDouble();
 
             if (preço1 < preço2 && preço1 < preço3) {
               System.out.println("O produto 1[" + preço1 + "] é o mais barato"); 

           } else if (preço2 < preço3) {
               System.out.println("O produto 2[" + preço2 +"] é o mais barato");            
           } else {
               System.out.println("O produto 3 [" + preço3 + "] é o mais barato");
           }
               

            //9 mostrar os três números de ordem decrescente
            System.out.println("Informe o primeiro número:");
            int primeiroNumero = scan.nextInt();
            System.out.println("Informe o segundo número:");
            int segundoNumero = scan.nextInt();
            System.out.println("Informe o terceiro número:");
            int terceiroNumero = scan.nextInt();

            int valorMaior, valorMedio, valorMenor;

            if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
                valorMaior = primeiroNumero;
                if (segundoNumero > terceiroNumero) {
                    valorMedio = segundoNumero;
                    valorMenor = terceiroNumero;
                } else {
                    valorMedio = terceiroNumero;
                    valorMenor = segundoNumero;
                }
                System.out.println("Ordem decrescente: " + valorMaior + " " + valorMedio + " " + valorMenor);
            }
            if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
                valorMaior =  segundoNumero;
                if (primeiroNumero > terceiroNumero) {
                    valorMedio = primeiroNumero;
                    valorMenor = terceiroNumero;
                } else {
                    valorMedio = terceiroNumero;
                    valorMenor = primeiroNumero;
                }
                System.out.println("Ordem decrescente: " + valorMaior + " " + valorMedio + " " + valorMenor);
            }
            if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
                valorMaior = terceiroNumero;
                if (primeiroNumero > segundoNumero) {
                    valorMedio = primeiroNumero;
                    valorMenor = segundoNumero;
                } else {
                    valorMedio = segundoNumero;
                    valorMenor = primeiroNumero;
                }
                System.out.println("Ordem decrescente: " + valorMaior + " " + valorMedio + " " + valorMenor);    
            }
                

                //10 conforme a letra do turno será uma mensagem de complimento.
                System.out.println("Digite 'M' - matutino, 'V' - vespetino ou 'N' - noturno ");

                String turno = scan.next();

                switch (turno) {
                    case "M": System.out.println("Bom dia"); break;
                    case "V": System.out.println("Boa tarde"); break;
                    case "N": System.out.println("Boa noite"); break;                
                    default: System.out.println("Valor inválido!");                       
                }
                    
            
            //11 informe o salário para aplicar o acrescimo
            System.out.println("Informe o salário: ");
            double salario = scan.nextDouble();
            double salarioAtual;

            if (salario >= 1500.00) {
                salarioAtual = salario + (salario/100) * 5;
                System.out.println("Reajuste: 5% ");
            } else if (salario >= 700) {
                salarioAtual = salario + (salario/100) * 10;
                System.out.println("Reajuste: 10% ");
            } else if (salario >= 280) {
                salarioAtual = salario + (salario/100) * 15;
                System.out.println("Reajuste: 15% ");
            } else {
                salarioAtual = salario + (salario/100) * 20;
                System.out.println("Reajuste: 20% ");
            }
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Salário depois do reajuste: " + salarioAtual);

            

            //12 Informe o valor da hora e quantas horas trabalhadas no mês para realizar o cálculo da folha de pagamento
            System.out.println("Informe o valor da hora: ");
            double valorHora = scan.nextDouble();
            System.out.println("Informe quantas horas trabalhadas no mês: ");
            double qtdHoras = scan.nextDouble();
            double salarioBruto = qtdHoras * valorHora;
            double valorIR = 0;
            int IR = 0;
            double fgts = (salarioBruto/100) * 11;
            double inss = (salarioBruto/100) * 10;
            double taxaSindical = (salarioBruto/100) * 3;

            if (salarioBruto > 2500) {
                valorIR = salarioBruto/100 * 20;
                IR = 20;
            } else if (salarioBruto > 1500) {
                valorIR = salarioBruto/100 * 10;
                IR = 10;
            } else if (salarioBruto > 900) {
                valorIR = salarioBruto/100 * 5;
                IR = 5;
            }

            double desconto = valorIR + inss;
            double salarioLiquido = salarioBruto - desconto;
            System.out.println("");
            System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + ")       : R$ " + salarioBruto + "\n" +
                               "(-) IR (" + IR + "%)                        : R$ " + valorIR + "\n" +
                               "(-) INSS (10%)                     : R$ " + inss + "\n" +
                               "FGTS (11%)                         : R$ " + fgts + "\n" +
                               "Total de descontos                 : R$ " + desconto + "\n" +
                               "Salário Líquido                    : R$ " + salarioLiquido);
            
    System.out.println("");



        //13 ao digitar um número aparece o dia da semana correspondente.
        System.out.println("Digite um número de 1 ao 7: ");

        int numeroSemana = scan.nextInt();
        switch (numeroSemana) {
            case 1:System.out.println("Domingo"); break;
            case 2:System.out.println("Segunda"); break;
            case 3:System.out.println("Terça"); break;
            case 4:System.out.println("Quarta"); break;
            case 5:System.out.println("Quinta"); break;
            case 6:System.out.println("Sexta"); break;
            case 7:System.out.println("Sábado"); break;        
            default:System.out.println("Valor inválido!");
                
        }

    //14 duas notas para classificar de acordo
    System.out.println("Entre com duas notas: ");
    double nota1 = scan.nextDouble();
    double nota2 = scan.nextDouble();
    double media = (nota1 + nota2)/2;

    System.out.println("Média de aproveitamento     Conceito");
    if (media >= 9 && media <= 10) {
        System.out.println("Entre 9.0 e 10.0                 A");
        System.out.println("Média: " + media + " Aprovado"); 
    } else if (media >= 7.5 && media < 9) {
        System.out.println("Entre 7.5 e 9.0                 B");
        System.out.println("Média: " + media + " Aprovado"); 
    } else if (media >= 6 && media < 7.5) {
        System.out.println("Entre 6.0 e 7.5                  C");
        System.out.println("Média: " + media + " Aprovado"); 
    } else if (media >= 4 && media < 6) {
        System.out.println("Entre 4.0 e 6.0                  D");
        System.out.println("Média: " + media + " Reprovado"); 
    } else if (media >= 0 && media < 4) {
        System.out.println("Entre 4.0 e zero                 E");
        System.out.println("Média: " + media + " Reprovado"); 
    }
*/

//15

    }
    
}
