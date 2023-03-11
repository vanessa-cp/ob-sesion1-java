package com.example.estructurasDeControl.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Lunes";
        boolean resultado = dia.equals("Lunes");

        //if else if

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana de proyecto");

        } else if (dia.equals("Martes")) {
            System.out.println("Animo con el codigo");

        } else if (dia.equals("Miercoles")) {
            System.out.println("tercer dia de proyecto");

        } else if (dia.equals("jueves")) {
            System.out.println("cuarto dia de proyecto");

        } else if (dia.equals("viernes")) {
            System.out.println("Animo con la presentacion");

        } else {
            System.out.println("El dia introducido no es valido");
        }
    }
}
