
package com.loiane.cursojava.aula34;

public class TesteCalculadora {

    static int resultSoma;

    public static void main(String[] args) {
       MinhaCalculadora calc = new MinhaCalculadora();

        resultSoma = MInhaCalculadora.soma(1, 2);

        char opcao;
        int num1;
        int num2;
        int num3;
        double numDec1;
        double numDec2;
		
		//calc.soma(1, 2);
		
		MInhaCalculadora.soma(1, 2);
		
        soma2Valores(1, 2);

          int[] vetor = {1, 4, 5, 8};
        System.out.println(calc.soma(1, 2));
        System.out.println(calc.soma(3.0, 4.0));
        System.out.println(calc.soma(1, 2, 3));
        System.out.println(calc.soma(vetor));

        System.out.println("-- Calculadora ---");
        System.out.println("-Escolha uma opção: \n 1 - Somar 2 números inteiros\n 2 - Somar 2 números decimais\n 3 - Somar 3 números inteiros");
        System.out.println("4 - Subtrair 2 números inteiros\n 5 - Multiplicar 2 números inteiros\n 6 - Dividir 2 números inteiros\n 7 - Expoente\n Qualquer caracteres para sair.")
        Scanner scan = new Scanner(System.in);
        opcao = scan.next; 
        if('2') {
            System.out.println("  Digite o primeiro número: ");
            numDec1 = scan.double; 
            System.out.println("  Digite o segundo número: ");
            numDec2 = scan.double; 
        }
          if('3') {
            System.out.println("  Digite o primeiro número: ");
            num1 = scan.int; 
            System.out.println("  Digite o segundo número: ");
            num2 = scan.int; 
            System.out.println("  Digite o segundo número: ");
            num3 = scan.int; 
        }
       
        System.out.println("  Digite o primeiro número: ");
        numDec1 = scan.int; 
        System.out.println("  Digite o segundo número: ");
        numDec2 = scan.int; 

           switch (opcao) {
            case '1': System.out.println("Resultado: "calc.soma(num1, num2)); break;
            case '2': System.out.println("Resultado: "calc.soma(num1, num2)); break;
            case '3': System.out.println("Resultado: "calc.soma(num1, num2, num3)); break;
            case '4': System.out.println("Resultado: "calc.Subtrair(num1, num2)); break;
            case '5': System.out.println("Resultado: "calc.Multiplicar(num1, num2)); break;
            case '6': System.out.println("Resultado: "calc.Dividir(num1, num2)); break; 
            case '7': System.out.println("Resultado: "calc.elevarPotencia(num1, num2)); break;          
            default:System.out.println("Saindo ...");
        }



        // aula 65/98 exerc 2 em andamento.
    }

    static int soma2Valores(int num1, int num2){
        return MInhaCalculadora.soma(num1, num2);
    }
}
