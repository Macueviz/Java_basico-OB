package com.primeraPrueba.Ejercicios.Ej3;

public class ConcatNombres {
    public static void main(String[] args) {

        String concat = " ";
        String[] nombres = {"Miguel ", "Alberto ", "Adrian ", "Javier ", "Ruben"};

        for(String nombre : nombres){
            concat += nombre;
        }
        System.out.println("Los nombres son" + concat);

    }
}
