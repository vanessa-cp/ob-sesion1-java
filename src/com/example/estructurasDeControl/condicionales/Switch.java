package com.example.estructurasDeControl.condicionales;

public class Switch {
    public static void main(String[] args) {

        String dia = "Martes";

        switch (dia) {

            case"Lunes":
                System.out.println("Hoy es lunes!");
                break;

            case"Martes":
                System.out.println("Hoy es martes!");
                break;

            case"Miercoles":
                System.out.println("Hoy es miercoles!");
                break;

            case"Jueves":
                System.out.println("Hoy es jueves!");
                break;

            case"Viernes":
                System.out.println("Hoy es viernes!");
                break;
                default:
                    System.out.println("No es valido");
                    break;

        };
    }
}
