package com.loiane.cursojava.aula27;

public class Aluno {
    String nome;
    String matricula;
    String cursoMatriculado;
    String[] disciplinas;
    double[] notas;

    void verificarAprovacao(){
        for (int i = 0; i < disciplinas.length; i++) {
            if (notas[i] >= 7) {
                System.out.println("Disciplina: " + disciplinas[i] + "nota: " + notas[i] + " Aprovado");
            } else {
                System.out.println("Disciplina: " + disciplinas[i] + " nota: " + notas[i] + " Reprovado");
            }
        }        
    }
}
