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

        if (valor1 >= 0) {
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
            System.out.println("Digite a segunda nota: ");
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


        //15Triangulo Equilátero, Isósceles, Escaleno.
        System.out.println("Forneça a medida do primeiro lado");
        double lado1 = scan.nextDouble();
        System.out.println("Forneça a medida do segundo lado");
        double lado2 = scan.nextDouble();
        System.out.println("Forneça a medida do terceiro lado");
        double lado3 = scan.nextDouble();
        
        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("È um triângulo Equilátero.");
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("È um triângulo Isósceles.");
        } else {
            System.out.println("È um triângulo Escaleno.");
        }
            

        //16Equação
        System.out.println("Forneça o valor de A");
        double a = scan.nextDouble();
        if (a == 0) {
            System.out.println("A equação não é do segundo grau. O programa foi encerrado.");
        }    
        System.out.println("Forneça o valor de B");
        double b = scan.nextDouble();
        System.out.println("Forneça o valor de C");
        double c = scan.nextDouble();
        double x;
        double delta = (a * (x * x)) + (b * x) + c;
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais. O programa foi encerrado.");
        }
        //faltou dados para terminar o exercicio
        
          
        
        //17 Informe o ano para calcular se é bissexto.
          System.out.println("Informe o ano para calcular se é bissexto.");
          int ano = scan.nextInt();
          if ((ano % 4) == 0) {
            System.out.println("É bissexto.");
          } else {
            System.out.println("Não é um ano bissexto.");
          }
            

         //18 par ou ímpar
         System.out.println("Forneça um número para verficar se é par ou ímpar:");   
         int parOuImpar = scan.nextInt();

         if(parOuImpar % 2 == 0) {
            System.out.println("É par.");
         } else {
            System.out.println("É ímpar.");
         }

         
        //19Fazer uma operação e informar se é par ou ímpar e negativo ou não.
        System.out.println("Informe o primeiro valor.");
        double primeiroValor = scan.nextDouble();
        System.out.println("Informe o segundo valor.");
        double segundoValor = scan.nextDouble();
        System.out.println("Escolha uma operação:\n 1 - Dividir\n" + 
        " 2 - Multiplicar\n 3 - Somar\n 4 - Diminuir ");
        int operacao = scan.nextInt();
        double divisao = primeiroValor / segundoValor;;
        double multiplicacao;
        double adicao;
        double subtracao;
        String expressaoA;
        String expressaoB;
        String par = " É par.";
        String impar = " É ímpar.";
        String positivo = " É positivo.";
        String negativo = " É nagativo.";

        switch (operacao) {
            case 1:
                if (primeiroValor != 0) {
                    expressaoA = (divisao % 2) == 0 ? par : impar;
                    expressaoB = divisao < 0 ? negativo : positivo;
                    System.out.println(divisao + expressaoA + expressaoB);
                } else {
                    System.out.println("O dividendo não pode ser zero.");
                }
                break;
            case 2:
                multiplicacao = primeiroValor * segundoValor;
                expressaoA = multiplicacao % 2 == 0 ? par : impar;
                expressaoB = multiplicacao < 0 ? negativo : positivo;
                System.out.println(multiplicacao + expressaoA + expressaoB);
                break;
            case 3:
                adicao = primeiroValor + segundoValor;
                expressaoA = adicao % 2 == 0 ? par : impar;
                expressaoB = adicao < 0 ? negativo : positivo;
                System.out.println(adicao + expressaoA + expressaoB);
                break;
            case 4:
                subtracao = primeiroValor - segundoValor;
                expressaoA = subtracao % 2 == 0 ? par : impar;
                expressaoB = subtracao < 0 ? negativo : positivo;
                System.out.println(subtracao + expressaoA + expressaoB);
                break;

            default:
                System.out.println("Operação inválida.");
                break;
        }
                

                //20 Pergunta sobre um crime.

                int sim = 0;
                int nao = 0;
                int opcao;
                System.out.println("Telefonou para a vítima?\n" + //
                        "1- Sim\n" + //
                        "0 - Não");
                opcao = scan.nextInt();
                if (opcao == 1) {
                    sim++;
                }

                System.out.println("Esteve no local do crime?\n" + //
                        "1- Sim\n" + //
                        "0 - Não ");
                opcao = scan.nextInt();
                if (opcao == 1) {
                    sim++;
                }
                System.out.println("Mora perto da vítima? \n" + //
                        "1- Sim\n" + //
                        "0 - Não");
                opcao = scan.nextInt();
                if (opcao == 1) {
                    sim++;
                }
                System.out.println("Devia para a vítima? \n" + //
                        "1- Sim\n" + //
                        "0 - Não");
                opcao = scan.nextInt();
                if (opcao == 1) {
                    sim++;
                }
                System.out.println("Já trabalhou com a vítima? \n" + //
                        "1- Sim\n" + //
                        "0 - Não");
                opcao = scan.nextInt();
                if (opcao == 1) {
                    sim++;
                }
                switch (sim) {
                    case 2:
                        System.out.println("Suspeita");
                        break;
                    case 3:
                    case 4:
                        System.out.println("Cúmplice");
                        break;
                    case 5:
                        System.out.println("Assassino");
                        break;

                    default:
                        System.out.println("Inocente");
                        break;
                }


// 21alcool, gasolina e desconto
System.out.println("Escolha o combustível: ");
System.out.println("A - Álcool");
System.out.println("G - Gasolina");
String opcao = scan.nextLine();
System.out.println("Informe a quantidade de litros: ");
int qtdLitro = scan.nextInt();
int desconto;
double valorCombustivel;

switch (opcao) {
    case "A":
        if (qtdLitro <= 20) {
            desconto = 3;
            System.out.println("Desconto: " + desconto);
            valorCombustivel = (qtdLitro * 1.90);
            System.out.println("Valor bruto do combustível: " + valorCombustivel);
            valorCombustivel -= (valorCombustivel / 100) * desconto;
            System.out.println("Valor do combustível com desconto: " + valorCombustivel);
        } else {
            desconto = 5;
            System.out.println("Desconto: " + desconto);
            valorCombustivel = (qtdLitro * 1.90);
            System.out.println("Valor bruto do combustível: " + valorCombustivel);
            valorCombustivel = valorCombustivel - ((valorCombustivel / 100) * desconto);
            System.out.println("Valor do combustível com desconto: " + valorCombustivel);
        }
        break;
    case "G":
        if (qtdLitro <= 20) {
            desconto = 4;
            System.out.println("Desconto: " + desconto);
            valorCombustivel = (qtdLitro * 2.50);
            System.out.println("Valor bruto do combustível: " + valorCombustivel);
            valorCombustivel = valorCombustivel - ((valorCombustivel / 100) * desconto);
            System.out.println("Valor do combustível com desconto: " + valorCombustivel);
        } else if (qtdLitro > 20) {
            desconto = 6;
            System.out.println("Desconto: " + desconto);
            valorCombustivel = (qtdLitro * 2.50);
            System.out.println("Valor bruto do combustível: " + valorCombustivel);
            valorCombustivel = valorCombustivel - ((valorCombustivel / 100) * desconto);
            System.out.println("Valor do combustível com desconto: " + valorCombustivel);
        }
        break;

    default:
        System.out.println("Opção inválida.");
}




        //22Desconto por determinado valor ou peso
        System.out.println("Informe quantos kilos de morango:");
        double morangoKilo = scan.nextDouble();
        double morangoValor = 2.50;
        System.out.println("Informe quantos kilos de maça:");
        double macaKilo = scan.nextDouble();
        double macaValor = 1.80;
        double valorTotalMorango = 0;
        double valorTotalMaca = 0;
        double valorTotalCompra;

        if (morangoKilo <= 5){
           valorTotalMorango=  morangoKilo * morangoValor;
        } else {
            morangoValor = 2.20;
            valorTotalMorango=  morangoKilo * morangoValor;
        }

        if (macaKilo <= 5){
            valorTotalMaca=  macaKilo * macaValor;
        } else {
            macaValor = 1.50;
            valorTotalMaca=  macaKilo * macaValor;
        }

        System.out.println("Peso do morango(kg): " + morangoKilo);
        System.out.println("Valor total do morango(R$): " + valorTotalMorango);
        System.out.println("Peso da maça(kg): " + macaKilo);
        System.out.println("Valor total da maça(R$): " + valorTotalMaca);
        System.out.println("Valor total sem o desconto de 10%: " + (valorTotalMorango + valorTotalMaca));

        if (((morangoKilo + macaKilo) > 8) || ((valorTotalMorango + valorTotalMaca) > 25)){
            valorTotalCompra = valorTotalMorango + valorTotalMaca;
            valorTotalCompra -= valorTotalCompra/100 * 10;
            System.out.println("Valor total com o desconto de 10%: " + valorTotalCompra);
        }



        //23promoção de carne

        double fileDuploKilo;
        double fileDuploValor = 4.90;

        double alcatraKilo;
        double alcatraValor = 5.90;

        double picanhaKilo;
        double picanhaValor = 6.90;
        double valorTotalFileDuplo = 0;
        double valorTotalAlcatra = 0;
        double valorTotalPicanha = 0;
        double valorTotalCompra = 0;

        System.out.println("Escolha a carne: ");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int opcao = scan.nextInt();
        System.out.println("Forma de pagamento com o cartão Tabajara? 's' ou 'n' ");
        String formaPagamento = scan.next();

        switch (opcao){
            case 1: System.out.println("Informe quantos kilos de File Duplo:");
                fileDuploKilo = scan.nextDouble();
                if (fileDuploKilo > 5){
                        fileDuploValor = 5.80;
                        valorTotalFileDuplo = fileDuploKilo * fileDuploValor;

            } else {
                valorTotalFileDuplo = fileDuploKilo * fileDuploValor;
            }
            if (formaPagamento.equalsIgnoreCase("s")){
                System.out.println("Forma de pagamento: Cartão Tabajara\nCom desconto");
                System.out.println("Desconto: " + (valorTotalFileDuplo / 100 * 5));
                valorTotalFileDuplo -= valorTotalFileDuplo / 100 * 5;
            } else {
                System.out.println("Forma de pagamento: Outro\nSem desconto");
            }
                System.out.println("File Duplo: " + fileDuploKilo + "kg - Preço por kilo: " + fileDuploValor +
                        " Preço Total: " + valorTotalFileDuplo);
            break;

            case 2: System.out.println("Informe quantos kilos de alcatra:");
                alcatraKilo = scan.nextDouble();
                if (alcatraKilo > 5){
                alcatraValor = 6.80;
                valorTotalAlcatra = alcatraKilo * alcatraValor;

            } else {
                valorTotalAlcatra = alcatraKilo * alcatraValor;
            }
                if (formaPagamento.equalsIgnoreCase("s")){
                    System.out.println("Forma de pagamento: Cartão Tabajara\nCom desconto");
                    System.out.println("Desconto: " + (valorTotalAlcatra / 100 * 5));
                    valorTotalAlcatra -= valorTotalAlcatra / 100 * 5;
                } else {
                    System.out.println("Forma de pagamento: Outro\nSem desconto");
                }
                System.out.println("Alcatra: " + alcatraKilo + "kg - Preço por kilo: " + alcatraValor +
                        " Preço Total: " + valorTotalAlcatra);
                break;

            case 3: System.out.println("Informe quantos kilos de Picanha:");
                picanhaKilo = scan.nextDouble();
                if (picanhaKilo > 5){
                picanhaValor = 6.80;
                valorTotalPicanha = picanhaKilo * picanhaValor;

            } else {
                valorTotalPicanha = picanhaKilo * picanhaValor;
            }
                if (formaPagamento.equalsIgnoreCase("s")){
                    System.out.println("Forma de pagamento: Cartão Tabajara\nCom desconto");
                    System.out.println("Desconto: " + (valorTotalPicanha / 100 * 5));
                    valorTotalPicanha -= valorTotalPicanha / 100 * 5;
                } else {
                    System.out.println("Forma de pagamento: Outro\nSem desconto");
                }
                System.out.println("Picanha: " + picanhaKilo + "kg - Preço por kilo: " + picanhaValor +
                        " Preço Total: " + valorTotalPicanha);
                break;
            default:
                System.out.println("Opção inválida. ");

        }

 */

//versão da professora
        System.out.println("Entre com primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Entre com segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Entre com terceiro número:");
        int num3 = scan.nextInt();

        if(num1 <= num2 && num1 <= num3 && num2 <= num3){
            System.out.println(num3 + " - " + num2 + " - " + num1);
        } else if(num1 <= num2 && num1 <= num3 && num3 <= num2){
            System.out.println(num2 + " - " + num3 + " - " + num1);
            } else if(num2 <= num1 && num2 <= num3 && num1 <= num3){
                    System.out.println(num3 + " - " + num1 + " - " + num2);    
        } else if(num2 <= num1 && num2 <= num3 && num3 <= num1){
                    System.out.println(num1 + " - " + num3 + " - " + num2);  
        } else if(num3 <= num1 && num3 <= num2 && num2 <= num1){
                    System.out.println(num1 + " - " + num2 + " - " + num3);  
        } else if(num3 <= num1 && num3 <= num2 && num1 <= num2){
                    System.out.println(num2 + " - " + num1 + " - " + num3);  
        }
        
    }
}
