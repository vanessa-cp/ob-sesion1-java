package com.example.estructurasDeControl.repeticion;

public class ForEach {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Maria"};

        for (String nombre : nombres) {
            System.out.println(nombre);

        }


        int[] numeros = {1, 2, 3, 4, 5,};
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;

        }

        System.out.println(suma);
    }

}
