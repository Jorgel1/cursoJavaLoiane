package com.loiane.cursojava.aula34;

import java.util.Scanner;

public class ConversaoDeUnidadesDeVolume {
    static Scanner scan = new Scanner(System.in);

    //converte litros para centímetros cúbicos
    public static double ltParaCent3(){
        System.out.println("\nDigite a quantidade de litros para converter em centímetros cúbicos:");
        double litros = scan.nextDouble();
        double cent3 = 1000 * litros;
        return cent3;
    }

    //converte metro cúbico para litros
    public static double m3ParaLt(){
        System.out.println("\nDigite metro cúbico para converter para litro:");
        double metro3 = scan.nextDouble();
        double litros = 1000 * metro3;
        return litros;
    }

    //converte metro cúbico  para pes cúbicos
    public static double m3ParaPes3(){
        System.out.println("\nDigite metro cúbico para converter para pes ao cúbicos:");
        double metro3 = scan.nextDouble();
        double pes3 = 35.32 * metro3;
        return pes3;
    }

    //converte galão americano  para polegadas cúbicos
    public static double galaoAmerParapol3() {
        System.out.println("\nDigite a quantidade de galão americano para converter para polegadas cúbicas:");
        double galaoAmer = scan.nextDouble();
        double pol3 = 231 * galaoAmer;
        return pol3;
    }

    //converte galão americano  para litros
    public static double galaoAmerParaLl() {
        System.out.println("\nDigite a quantidade de galão americano para converter para litros:");
        double galaoAmer = scan.nextDouble();
        double litros = 3.785 * galaoAmer;
        return litros;
    }

}
