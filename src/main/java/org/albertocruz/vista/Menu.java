package org.albertocruz.vista;

public class Menu {

    public static void menuEjecutable() {
        System.out.println("Programa Pixup ");
        System.out.println("Menu de opciones");
        System.out.println("Seleccione la opcion deseada");
        System.out.println("[1] Consola");
        System.out.println("[2] Ventana");
        System.out.println("[3] Salir");

    }

    public static void menuResumen(){
        System.out.println("Seleccione la opcion deseada");
        System.out.println("[1] Catalogo");
        System.out.println("[2] Pendiente");
        System.out.println("[3] Salir");
    }

    public static void menuLocalidad(){
        System.out.println("Seleccione la opcion deseada");
        System.out.println("[1] Estado");
        System.out.println("[2] Municipio");
        System.out.println("[2] Colonia");
        System.out.println("[4] Domicilio");
        System.out.println("[5] Salir");
    }

    public static void menuRegistro(){
        System.out.println("Seleccione la opcion deseada");
        System.out.println("[1] Alta");
        System.out.println("[2] Baja");
        System.out.println("[2] Ver");
        System.out.println("[4] Actualizar");
        System.out.println("[5] Salir");
    }


    public static void errorDato() {
        System.out.println("No es un dato valido");
    }

    public static void opcionInvalida() {
        System.out.println("La opción no es correcta");
    }

    public static void seleccionaOpcion( )
    {
        System.out.println("Dame una opción");
    }
}
