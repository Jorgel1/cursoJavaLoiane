package com.loiane.cursojava.aula27;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia do carro é: " + autonomia);
        System.out.println("Autonomia do carro é: " + van.obterAutonomia());


        Carro fusca = new Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        fusca.exibirAutonomia();

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
        System.out.println("qtdCombustivel15 = " + qtdCombustivel15);



        //parei no video 50/98
    }
}
