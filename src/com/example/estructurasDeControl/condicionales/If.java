package com.example.estructurasDeControl.condicionales;

public class If {
    public static void main(String[] args) {

        int edad = 17;

        //..............una opcion...........................
        //if(edad >= 18){                             //...
            //System.out.println("Es mayor de edad"); //... una opcion
        //}                                           //...

        //.............................................

        //..............segunda opcion..............................

        //boolean esMayor = edad >= 18;//false

        //if (esMayor) {
            //System.out.println("Es mayor de edad");
        //}

        //............................................

        //..............tercera opcion..............................

        //boolean esMayor = edad >= 18;//true

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }
        //............................................



        System.out.println("Es menor de edad");


    }

}
