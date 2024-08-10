package org.example;

public class Calculadora {
    private int numeroA;
    private int numeroB;

    //Constructor
    public Calculadora(int a, int b){
        this.numeroA = a;
        this.numeroB = b;
    }

    //Método
    int somar(){
        return this.numeroA + this.numeroB;
    }

    int subtrair(){
        return this.numeroA - this.numeroB;

    }
}


