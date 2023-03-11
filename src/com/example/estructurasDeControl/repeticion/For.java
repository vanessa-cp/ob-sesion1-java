package com.example.estructurasDeControl.repeticion;

public class For {
    public static void main(String[] args) {

       for(int i = 0; i < 10; i++){
           System.out.println("El valor de i es: " + i);

       }

       String[] nombre = {"Juan", "Pedro", "Maria"};//length 3
       for(int i = 0; i < nombre.length; i++){
           System.out.println(nombre[i]);
       }

       //suma
        int suma = 0;
        int[] numeros = {1, 2, 3, 4, 5, 6};
        for(int i = 0; i < numeros.length; i++){
            //suma = suma + numeros[i];
            suma += numeros[i];



        }
        System.out.println("La suma es: " + suma);
    }
}
