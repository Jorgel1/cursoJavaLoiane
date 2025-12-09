
package com.loiane.cursojava.aula34;

public class Contador {

    static int contador = 0;

    public Contador () {
        this.contador = contador + 1;
    }

    public void setContador(int contador){
        this.contador = contador;
    }

    public int getContador(){
        return contador;
    }

    public void incrementarContador(){
        this.contador = contador + 1;
    }

    public void zerarContador(){
        this.contador = 0;
    }

}
