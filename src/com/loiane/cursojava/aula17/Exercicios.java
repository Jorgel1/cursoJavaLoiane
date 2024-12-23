package com.loiane.cursojava.aula17;

import java.text.DecimalFormat;
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

        //16 versão da professora

int primeiro = 1;
int segundo = 1;
int proximo = 0;

System.out.println(primeiro);
System.out.println(segundo);

while (proximo <= 500) { 
    proximo = primeiro + segundo;
    primeiro = segundo;
    segundo = proximo;

    System.out.println(proximo);
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

          //17 versão da professora

  System.out.println("Digite um número:");
  int num = scan.nextInt();

  System.out.println(num + "! =");

  int fatorial = 1;
  for(int i = num; i > 0;  i--) {
    fatorial *= i;
    System.out.println(i);
  }

  System.out.println("Resultado: " + fatorial);


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



        //20 media de idade, 0 e 25, 26 e 60, e maior de 60,
        // então dizer se a turma é jovem, adulta ou idosa

        int pessoas;
        int qtdPessoas = 4;
        double somaIdade = 0;
        double mediaIdade;

        System.out.println("Insira a idade de " + qtdPessoas + " para a classificação: ");
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Informe a idade da pessoa de número " + (i + 1));
            pessoas = scan.nextInt();
            somaIdade += pessoas;
        }

        mediaIdade = somaIdade / qtdPessoas;
        System.out.println("media: " + mediaIdade);
        if (mediaIdade >= 0 && mediaIdade <= 25){
            System.out.println("A turma é jovem.");
        } else if (mediaIdade >= 26 && mediaIdade <= 60){
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }



        //21 calcular a media de alunos por turma.

        int alunos;
        int qtdTurma;
        double somaAlunos = 0;
        double mediaAlunos;

        System.out.println("Insira a quantidade de  turmas para a classificação: ");
        qtdTurma = scan.nextInt();
        for (int i = 0; i < qtdTurma; i++) {
            System.out.println("Informe a quantidade de até 40 alunos para a turma de número " + (i + 1));
            alunos = scan.nextInt();
            somaAlunos += alunos;
        }

        mediaAlunos = somaAlunos / qtdTurma;
        System.out.println("media: " + mediaAlunos + " alunos para cada turma");

//21 versão da professora

System.out.println("Entre com o número de turmas:");
int numTurmas = scan.nextInt();

int numAlunos;
int soma = 0;
boolean invalido = true;

for (int i = 1; i <= numTurmas; i++) {
    invalido = true;
    do {
        System.out.println("Entre com o número de alunos" + i);
        numAlunos = scan.nextInt();

        if (numAlunos <= 40) {
            invalido = false;
        } else {
            System.out.println("Número de alunos inválido. Digite novamente.");
        }
    } while(invalido);
    soma += numAlunos;
}
double media = soma / numTurmas;

System.out.println("Média: " + media);

        //22 media gasto pelo colecionador por cada cd.

        int valor;
        int qtdCd;
        double somaValor = 0;
        double mediaValorCd;

        System.out.println("Insira a quantidade de  CDs: ");
        qtdCd = scan.nextInt();
        for (int i = 0; i < qtdCd; i++) {
            System.out.println("Informe o valor investido pelo CD de número " + (i + 1));
            valor = scan.nextInt();
            somaValor += valor;
        }

        mediaValorCd = somaValor / qtdCd;
        System.out.println("media de valor investido por cada CD: R$" + mediaValorCd);



        //23 montar uma tabela de preços do número 1 até o número 50, do valor 1.99 até 99.99
        // Lojas Quase Dois - Tabela de preços
        // ex: 1 - R$ 1.99

        int qtdItens;
        double valorItens;

        System.out.println("Informe a quantidade de itens: ");
        qtdItens = scan.nextInt();

        System.out.println("Lojas Quase Dois - Tabela de preços");
        for (int i = 0; i < qtdItens; i++) {
            System.out.print((i + 1) + " - R$ " );
            valorItens = scan.nextDouble();
        }

          //23 versão da professora

        System.out.println("Lojas Quase Dois - Tabela de preços");

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " = R$ " + (1.99*i));
        }




        //24 tabela de preço informado apartir do usuário

        int qtdItens;
        double valorItens;

        System.out.println("Informe a quantidade de itens: ");
        qtdItens = scan.nextInt();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for (int i = 0; i < qtdItens; i++) {
            System.out.print((i + 1) + " - R$ " );
            valorItens = scan.nextDouble();
        }

           //24 versão da professora

        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " = R$ " + (0.18*i));
        }



        //25 caixa registradora
        int qtdItens = Integer.MAX_VALUE;
        int i = 0;
        double valorItens = -1;
        double somaValor = 0;
        double dinheiro;
        double troco;
        
        for (int j = 0; j < qtdItens; j++) {
            System.out.println("\n    Lojas Tabajara");
            i = 0;  
            do {            
                System.out.print("    Produto " + (i + 1) + ": R$ ");
                valorItens = scan.nextDouble();
                somaValor += valorItens;                
                i++;
            } while (valorItens != 0);
        System.out.println("    Total: R$ " + somaValor);
        System.out.print("    Dinheiro: R$ ");
        dinheiro = scan.nextDouble();
        troco = dinheiro - somaValor;

        System.out.println("    Troco: R$ " + troco);
    }

         //25 versão da professora

        //System.out.println("Lojas Tabalaja");

        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago, troco;

        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.next();
            if (continuarCompra.equalsIgnoreCase("S")){

                output = "Lojas Tabalaja\n";

            System.out.println("Digite a quantidade de produtos da compra:");
            qtdProdutos = scan.nextInt();

            total = 0;

                for (int i = 1; i <= qtdProdutos; i++) {
                    System.out.println("Informe preço do produto " + i);
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";

                }
                output += "Total: R$ " + total;

                System.out.println("Total: R$ " + total);

                System.out.println("Entre com o valor pago:");
                valorPago = scan.nextDouble();

                output += "Dinheiro: R$ " + valorPago + "\n";

                troco = total - valorPago;

                output += "Troco: R$ " + troco;

                System.out.println(output);
            
            } else {
                sair = true;
            }

        } while (!sair);
     

        //26 Fatorial de: 5
        //   5! =  5 * 4 * 3 * 2 * 1 = 120

        System.out.print("Fatorial de: ");
        int num = scan.nextInt();
        int fat = num;

        System.out.print(num + "! = ");
        for (int i = num; i > 0; i--) {
            if (i >= 2) {                
                fat *= i - 1;
            } 
            System.out.print(i);
            if(i > 1){
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + fat);


         //26 versão da professora
        //   5! =  5 * 4 * 3 * 2 * 1 = 120
        System.out.println("Digite um número:");
        int num = scan.nextInt();

        System.out.println("Fatorial de " + num);

        System.out.print(num + "! = ");
        int fatorital = 1;
        for (int i = num; i > 1; i--) {
            fatorital *= i;
            System.out.print(i + " . ");            
            }        
        System.out.println("1 = " + fatorital);



//27 maior, menor e a média das temperaturas
double maiorTemp = Double.MIN_VALUE;
double menorTemp = Double.MAX_VALUE;
double mediaTemp = 0;
double temperatura;
double somaTemp = 0;
double qtdTemp;

System.out.println("Informe a quantidade de tempraturas:");
qtdTemp = scan.nextDouble();

for (int i = 0; i < qtdTemp; i++) {
    System.out.print("Temperatura de número " + (i + 1) + ": ");
    temperatura = scan.nextDouble();
    somaTemp += temperatura;
    mediaTemp = somaTemp / qtdTemp;
    if (temperatura > maiorTemp) {
        maiorTemp = temperatura;
    }
    if (temperatura < menorTemp) {
        menorTemp = temperatura;
    }
}
System.out.println("Quantidade de temperaturas: " + qtdTemp);
System.out.println("Maior temperatura: " + maiorTemp + "ºC");
System.out.println("Menor temperatura: " + menorTemp + "ºC");
System.out.println("Temperatura média: " + mediaTemp + "ºC");



//28 Determinar se é um número primo

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

//29 Determinar quantos números primos há de 1 até um determinado número.

System.out.println("Informe valor para verificar se há números primos:");
int num = scan.nextInt();
boolean primo = true;

if (num > 1) {    
         if (num == 2) {
            System.out.println("O número " + num + " não tem números primos.");
            
         } else {      
                System.out.println("Segue os números primos de " + num + ":"); 
                for (int i = 1; i <= num; i++) {         
                    for (int j = 2; j < i; j++){           
                        if (i % j == 0) {
                            primo = false;
                        }                         
                    }
                    if (primo) {
                        System.out.print(i + " ");                            
                    }
                    primo = true;
                }
            }
} else {
    System.out.println("Informe um número maior que 1!");
}
System.out.println();


//30 tabuada com o número inicial e final escolhidos pelo usuário.

System.out.print("    Montar a tabuada de: ");
int tabuada = scan.nextInt();

System.out.print("    Começar por: ");
int tabuadaInic = scan.nextInt();
int tabuadaFinal;

boolean verificar = false;
do {
    System.out.print("    Terminar por: ");
    tabuadaFinal = scan.nextInt();
    if (tabuadaFinal < tabuadaInic) {
        System.out.println("O número final da tabuada não pode ser menor que o inicial.");       
    } else {
        verificar = true;
    }
} while(!verificar);


System.out.println("\n    Vou montar a tabuada de " + tabuada +
 " começando em " + tabuadaInic + " e terminando em " + tabuadaFinal + ":");

 for (int i = tabuadaInic; i <= tabuadaFinal; i++) {
    System.out.println("    " + tabuada + " x " + i + " = " + (tabuada * i));
 }

 //31 1995 salario = 1000, 1996 salario + 1,5%, apartir de 1997 salario +(1,5 * 2).
        // Após isso, o usuário que define o salario inicial.

        double percent = 1.5;
        int anoInicial = 1995;
        int anoFinal = 2024;

        System.out.println("Informe o valor do salário inicial:");
        double salario = scan.nextDouble();

        for (int i = anoInicial; i <= anoFinal; i++) {
            if (i == 1995) {
                System.out.println("Salário em " + i + " : R$ " + salario + "\n");
            } else {
                salario += (salario / 100) * percent;

                DecimalFormat format = new DecimalFormat("###,###.##");

                System.out.println("Salário em " + i + " : R$ " + format.format(salario));
                System.out.println("Percentual de aumento salarial: " + format.format(percent) + "\n");
                percent = percent * 2;


        //32 calcular o preço total de acordo com o código do produto e a quantidade.

        double valor = 0;
        double precoTotal = 0;
        int codigoProduto;
        double qtdProduto;

            do {
                System.out.println();
                System.out.println("    Especificação   Código  Preço");
                System.out.println("    Cachorro Quente 100  R$ 1,20");
                System.out.println("    Bauru Simples   101  R$ 1,30");
                System.out.println("    Bauru com ovo   102  R$ 1,50");
                System.out.println("    Hambúger        103  R$ 1,20");
                System.out.println("    Cheeseburger    104  R$ 1,30");
                System.out.println("    Refrigerante    105  R$ 1,00");

                System.out.println("\nInforme o código do produto:");
                System.out.println("Digite zero(0) para sair.");
                codigoProduto = scan.nextInt();

                if (codigoProduto != 0) {

                    System.out.println("Informe a quantidade desse produto: ");
                    qtdProduto = scan.nextDouble();

                    switch (codigoProduto) {
                        case 100:
                            valor = 1.20 * qtdProduto;
                            break;
                        case 101:
                            valor = 1.30 * qtdProduto;
                            break;
                        case 102:
                            valor = 1.50 * qtdProduto;
                            break;
                        case 103:
                            valor = 1.20 * qtdProduto;
                            break;
                        case 104:
                            valor = 1.30 * qtdProduto;
                            break;
                        case 105:
                            valor = 1.00 * qtdProduto;
                            break;
                        default:
                            if (codigoProduto != 0) {
                                System.out.println("Código não exite! ");
                            }
                    }
                    precoTotal += valor;
                    valor = 0;
                }

            } while (codigoProduto != 0);

        System.out.println("Valor total: " + precoTotal);


 
        //33 mostrar os n termos da Série e mostrar a soma deles.

        

        System.out.println("Forneça a quantidade de termos:");
        int numTermo = scan.nextInt();
        int conciente = 1;
        int resultadoNumerador = 0;
        int resultadoDenominador = 0;

        System.out.print("S = ");
        for (int i = 1; i <= numTermo; i++) {
            System.out.print(i + "/" + conciente);
            if (i < numTermo) {
                System.out.print(" + ");
            }
            
            resultadoNumerador += i;
            resultadoDenominador += conciente;
            conciente += 2;
        }
        System.out.println();
        System.out.println("A soma da série: " + resultadoNumerador + "/" + resultadoDenominador);
        
        

        //34 calcular o valor de H com N termos.

        System.out.println("Forneça a quantidade de termos:");
        int numTermo = scan.nextInt();
        int conciente = 1;
        double resultado = 0;
        double recebeConciente;

        System.out.print("H = ");
        for (int i = 1; i <= numTermo; i++) {
            if (i == 1) {
                System.out.print("1"); 
            } else {
                System.out.print("1" + "/" + conciente);
            }
            if (i < numTermo) {
                System.out.print(" + ");
            }
            recebeConciente = conciente;
            resultado += (1/recebeConciente);
            //System.out.println("#" + (1/recebeConciente));
            conciente++;
            
        }
        System.out.println();
        System.out.println("A soma da série: " + resultado);

        //35 mostrar os n termos da Série e mostrar a soma deles.
        

        System.out.println("Forneça a quantidade de termos:");
        int numTermo = scan.nextInt();
        int conciente = 1;
        int resultadoNumerador = 0;
        int resultadoDenominador = 0;

        System.out.print("S = ");
        for (int i = 1; i <= numTermo; i++) {
            System.out.print(i + "/" + conciente);
            if (i < numTermo) {
                System.out.print(" + ");
            }
            
            resultadoNumerador += i;
            resultadoDenominador += conciente;
            conciente += 2;
        }
        System.out.println();
        System.out.println("A soma da série: " + resultadoNumerador + "/" + resultadoDenominador);
        
        
      

        //36 mostrar os n termos da Série e mostrar a soma deles.

        System.out.println("Forneça a quantidade de termos:");
        int numTermo = scan.nextInt();
        int conciente = 1;
        double resultado = 0;
        double recebeConciente;

        System.out.print("H = ");
        for (int i = 1; i <= numTermo; i++) {
            if (i == 1) {
                System.out.print("1"); 
            } else {
                System.out.print("1" + "/" + conciente);
            }
            if (i < numTermo) {
                System.out.print(" + ");
            }
            
            recebeConciente = conciente;
            resultado += (1/recebeConciente);
            conciente ++;
        }
        System.out.println();
        System.out.println("H = " + resultado);
                
        recebeConciente = conciente;
        resultado += (1/recebeConciente);

*/
//corrigido todos os exercicios




        


    
    }
    
}
