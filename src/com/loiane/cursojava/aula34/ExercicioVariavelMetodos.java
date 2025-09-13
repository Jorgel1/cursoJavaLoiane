package com.loiane.cursojava.aula34;

public class ExercicioVariavelMetodos {
    public static void main(String[] args) {

        // 1. Escreva  uma classe chamada  Contador,  que  tem  um  atributo  
        // estático  que   é  incrementado  sempre  que  a  classe  for  
        // instanciada. Crie  métodos  para   zerar,  incrementar  e  
        // retornar  o  valor  do  contador. Desenvolva  um   programa  para  
        // testar  essa  classe.

        Contador cont = new Contador();

       System.out.println(cont.getContador());

        cont.incrementarContador();
        System.out.println(cont.getContador());

        cont.setContador(10);
        System.out.println(cont.getContador());

        cont.zerarContador();
        System.out.println(cont.getContador());

        //  2. Escreva  uma  classe  Calculadora  que  tenha  os seguintes  
        //  métodos:  somar,   subtrair,  multiplicar,  dividir 
        //  (dois  números),  elevar  à  potência  n.   Desenvolva  um  
        //  programa  para  testar  essa  classe. 
        
    }
}