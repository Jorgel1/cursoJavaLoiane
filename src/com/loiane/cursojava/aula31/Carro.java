package com.loiane.cursojava.aula31;

 public class Carro {

        public String marca;
        String modelo;
        int numPassageiros;
        double capCombustivel;
        private double consumoCombustivel;

        void exibirAutonomia () {
            System.out.println("A autonomia do carro é: " + this.capCombustivel * consumoCombustivel + " km\n");
        }

        public double obterAutonomia() {
            System.out.println("Método obter Autonomia foi chamado.");
            return capCombustivel * this.consumoCombustivel;
        }

        private double divideKMPorCombustivel(double km){
            return km/this.consumoCombustivel;
        }

        public double calcularCombustivel(double km){
            return this.divideKMPorCombustivel(km);

            // Atalho para exibir o outline é ctl + F12
        }

}
