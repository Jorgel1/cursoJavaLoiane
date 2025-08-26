package com.loiane.cursojava.aula33;

public class Lampada {
    private String lampada;

    private int tensaoVolts;
    private int potenciaW;
    private boolean ligada;

    public String getLampada() {
        return lampada;
    }

    public int getTensaoVolts() {
        return tensaoVolts;
    }

    public void setTensaoVolts(int tensaoVolts) {
        this.tensaoVolts = tensaoVolts;
    }

    public int getPotenciaW() {
        return potenciaW;
    }

    public void setPotenciaW(int potenciaW) {
        this.potenciaW = potenciaW;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public Lampada(String lampada, int tensaoVolts, int potenciaW, boolean ligada) {
        this.lampada = lampada;
        this.tensaoVolts = tensaoVolts;
        this.potenciaW = potenciaW;
        this.ligada = ligada;
    }

    public void ligarLampada(){
        setLigada(true);
    }

    public void desligarLampada(){
        setLigada(false);
    }

    public void setLampada(String lampada) {
        this.lampada = lampada;
    }

    public void mostrarEstado() {
        if (isLigada()){
            setLampada("ligado");
            System.out.println("A lâmpada está " + lampada);
        }else {
            setLampada("desligado");
            System.out.println("A lâmpada está " + lampada);
        }
    }

    public void descricao() {
        System.out.println("------------Descrição----------");
        System.out.println("Lampada: " + getLampada());
        System.out.println("Tensão: " + getTensaoVolts());
        System.out.println("Postência: " + getPotenciaW());
        System.out.println("Ligada: " + ligada);
        System.out.println("---------------------------------");
        System.out.println();
    }
}
