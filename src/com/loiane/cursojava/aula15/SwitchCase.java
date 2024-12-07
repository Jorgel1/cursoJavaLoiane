package com.loiane.cursojava.aula15;


public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int diaSemana = scan.nextInt();
        
        if (diaSemana == 1){
            System.out.println("Domingo");
        }else if (diaSemana == 2){
            System.out.println("Segunda");
        }else if (diaSemana == 3){
            System.out.println("Terça");
        }else if (diaSemana == 4){
            System.out.println("Quarta");
        }else if (diaSemana == 5){
            System.out.println("Quinta");
        }else if (diaSemana == 6){
            System.out.println("Sexta");
        }else if (diaSemana == 7){
            System.out.println("Sábado");
        }else{
            System.out.println("Não é um dia da semana válido");
        }


    }

}
