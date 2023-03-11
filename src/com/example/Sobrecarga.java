package com.example;

//Sobre carga permite duplicar un metodo siempre y cuando tengan diferente numero/tipo parametro

public class Sobrecarga {

    public static void main(String[] args) {



    }

    static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    static int suma(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }
}
