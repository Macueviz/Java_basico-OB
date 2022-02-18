package com.primeraPrueba.Ejercicios.Ej7_8_9;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.util.*;

public class sieteOchoNueve {
    public static void main(String[] args) throws FileNotFoundException {
     /*
 //---------------EJ 0----------------------------------------------------------------------------------
        String frase = "Hola mundo";
        String fraseInv = "";

        for (int i = frase.length() - 1; i >= 0; i--){
            fraseInv += frase.charAt(i);
            }
        System.out.println("frase invertida " + fraseInv);

//---------------EJ 1----------------------------------------------------------------------------------
        String[] nombres = {
                "Miguel",
                "Alberto",
                "Adrian",
                "Rafael"
        };

        for(String nombre : nombres){
            System.out.println(nombre);
        }

//---------------EJ 2----------------------------------------------------------------------------------
        int[][] edadPeso = {
                {20, 25, 30},
                {70, 75, 80}
        };
        for(int i = 0; i < edadPeso.length; i++){
            for(int j = 0; j < edadPeso[1].length; j++){
                System.out.println("Estoy en i = " + i + ", estoy en j = " + j);
                System.out.println(edadPeso[i][j]);
            }

//---------------EJ 3----------------------------------------------------------------------------------
        Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        numbers.remove(1);
        numbers.remove(1); // Eliminar misma posición del índice despues de que 2º desaparezca.
        System.out.println(numbers);
//---------------EJ 4----------------------------------------------------------------------------------
        Vector<Integer> capacidad = new Vector<Integer>();
        System.out.println("tamaño inicial = " +  capacidad.size() + ",capacidad inicial = " + capacidad.capacity());
        //capacidad inicial muy baja, para añadir 1000 elementos deberíamos copiar muchos arrays en memoria para ampliar

//---------------EJ 5 Y 6----------------------------------------------------------------------------------
      ArrayList<String> names = new ArrayList<String>();
      names.add("Miguel");
      names.add("Angel");
      names.add("Federico");
      names.add("Antonio");
        LinkedList<String> nameLinks = new LinkedList<String>(names);
        for (String name : names){
            System.out.println(name);
        }
        for (String nameLink : nameLinks) {
                System.out.println(nameLink);
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++){
            numbers.add(i);

        }
        System.out.println(numbers);
        for (int j = 0; j <= numbers.size(); j++){
            if ( numbers.get(j) % 2 == 0){
                numbers.remove(j);
                continue;
            }
        }System.out.println(numbers);

//---------------EJ 7---------------------------------------------------------------------------------
        try {

            DividePorCero(10, 0);

        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally  {
            System.out.println("Demo de código");

        }
    }
    public static void DividePorCero(int valor1, int valor2) throws ArithmeticException{
        int resultado = 0;
        try {
            resultado = valor1 / valor2;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        System.out.println(resultado);
    }
    //---------------EJ 8----------------------------------------------------------------------------------
     copiaArchivos("/home/german/Descargas/ejemplo1", "/home/german/Descargas/ejemplo2");

  }public static void copiaArchivos(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
        } catch (Exception e) {
            System.out.println("Excepción " + e.getMessage());
        }
      }

    */
/**
 *
 Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 LAtarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

 Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
 un HashMap y un ArrayList, LinkedList o array.

 */
        ArrayList<String> agenda = new ArrayList<String>();
        PrintWriter info = new PrintWriter("/home/german/Descargas/pruebaAgenda.txt");

        // HashMap<String, Integer> userPass = new HashMap<>();
        // userPass.put("Openbootcamp", 123456);

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce nombre de contacto");
            try {
                String a = scanner.next();
                agenda.add(a);
            } catch (Exception e) {
                System.out.println("nombre incorrecto");
            }
        }
        info.write(String.valueOf(agenda));

        for (String nombres : agenda) {
            System.out.println(nombres);
        }
        /*
        System.out.println("Guardados con éxito");
        System.out.println("Introduce 1 para hacer copia de seguridad, 2 para salir");
        Scanner scanner = new Scanner(System.in);

        int respuesta = scanner.nextInt();
        //  boolean resultado = respuesta.startsWith("y");

        if (respuesta == 1) {
            try {
                InputStream contacts = new DataInputStream(agenda)
                PrintStream contacts = new PrintStream("home/german/Descargas/pruebaPrograma.txt");
                contacts.println();
            }catch (FileNotFoundException e){
                System.out.println("Archivo no encontrado " + e.getMessage());
            }
        } else {
            System.out.println("Hasta luego!");
        }*/
    }
}
