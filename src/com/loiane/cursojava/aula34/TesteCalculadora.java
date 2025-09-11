
package com.loiane.cursojava.aula34;

public class TesteCalculadora {

    static int resultSoma;

    public static void main(String[] args) {
       // MinhaCalculadora calc = new MinhaCalculadora();

        resultSoma = MinhaCalculadora.soma(1, 2);
		
		//calc.soma(1, 2);
		
		MinhaCalculadora.soma(1, 2);
		
        soma2Valores(1, 2);

        // aula 65/98 finalizado.
    }

    static int soma2Valores(int num1, int num2){
        return MinhaCalculadora.soma(num1, num2);
    }
}
