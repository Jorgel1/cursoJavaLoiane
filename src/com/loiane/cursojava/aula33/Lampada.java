package com.loiane.cursojava.aula33;

public class Lampada {
    private String lampada;


    public void setLampada(String lampada) {
        this.lampada = lampada;
    }

    public void ligarLampada(boolean valor) {
        if (valor){
            setLampada("ligado");
            System.out.println("A lâmpada está " + lampada);
        }else {
            setLampada("desligado");
            System.out.println("A lâmpada está " + lampada);
        }
    }
}
