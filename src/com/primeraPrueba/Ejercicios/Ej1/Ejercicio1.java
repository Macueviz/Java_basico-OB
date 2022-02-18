package com.primeraPrueba.Ejercicios.Ej1;

public class Ejercicio1 {
    /**
     * Mostramos los datos que existen en Java
     * Usamos la consola para motrarlos en pantalla
     * @param args
     */
    public static void main(String[] args) {

        // tipo identificador = valor;

        // enteros (integer)
        byte number1 = 1; //1 byte
        System.out.println(number1);
        short number2 = 2; //2 byte
        System.out.println(number2);
        int number3 = 3; //4 byte
        System.out.println(number3);
        long number4 = 4L; //8 byte
        System.out.println(number4);

        // punto flotante
        float decimal1 = 4.9f;  //f indica float, un decimal
        System.out.println(decimal1);
        double decimal2 = 9.99d;  //d indica double, decimal largo
        System.out.println(decimal2);

        // caracter
        char caracter1 = 'a'; // solo admite un caracter
        System.out.println(caracter1);

        //booleanos

        boolean verdadero = true;
        System.out.println(verdadero);
        boolean falso = false;
        System.out.println(falso);

        //cadenas de textos

        String nombre = "Miguel";
        System.out.println(nombre);
        String apellido = "Cuevas";
        System.out.println(apellido);

        /* TIPOS ENVOLTORIO --> Los primitivos (inician en minus) no pueden ser nulos, si los creamos como envoltorio
        con Mayúscula (se crean como clase), se nos permite el resultado "null"
        */
        Integer numero = null;
        Long numero2 = 2L;
    }
}
