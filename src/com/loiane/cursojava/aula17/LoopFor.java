package com.loiane.cursojava.aula17;

public class LoopFor {
    public static void main(String[] args) {
        for (int i=0; i < 5 ; i++){
            System.out.println("i tem valor: " + i);
        }

        System.out.println(" ...");
        for (int i=5; i > 0 ; i--){
            System.out.println("i tem valor: " + i);
        }

        int count = 0;
        for (; count < 10 ; ){
            System.out.println("valor de count " + count);
            count += 2;
        }

        for (int cont=0; cont < 10; cont +=2){
            System.out.println("valor de cont " + cont);
        }
    }
}
