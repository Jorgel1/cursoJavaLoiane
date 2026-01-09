package com.loiane.cursojava.aula34;

import java.util.Scanner;

public class ConversaoDeUnidadesDeArea {
    static Scanner scan = new Scanner(System.in);

    public static double metro2ParaPes2(){
        System.out.println("\nDigite a medida em metros ao quadrado para converter em pés ao quadrado:");
        double metro = scan.nextDouble();
        double pes = 10.76 * metro;
        return pes;
    }


    public static double pes2ParaCent2(){
        System.out.println("\nDigite a medida em pés ao quadrado para converter em centímetros ao quadrado:");
        double pes = scan.nextDouble();
        double centimetro = 929 * pes;
        return centimetro;
    }

    public static double milha2ParaAcres2(){
        System.out.println("\nDigite a medida em milhas ao quadrado para converter em acres ao quadrado:");
        double milhas = scan.nextDouble();
        double acres = 640 * milhas;
        return acres;
    }

    public static double acre2ParaPes2(){
        System.out.println("\nDigite a medida em acres ao quadrado para converter em pés ao quadrado:");
        double acres = scan.nextDouble();
        double pes = 43.560 * acres;
        return pes;
    }
}

