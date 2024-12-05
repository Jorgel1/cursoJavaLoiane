package com.loiane.cursojava.aula16;

public class CurtoCircuito {
    public static void main(String[] args) {

        boolean verddeiro = true;
        boolean falso = false;
        boolean resulado1 = falso &
                verddeiro;
        boolean resulado2 = falso &&
                verddeiro;
        System.out.println(resulado1);
        System.out.println(resulado2);

        int resultado = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(resultado);

    }

}
