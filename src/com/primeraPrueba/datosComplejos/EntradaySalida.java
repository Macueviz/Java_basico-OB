package com.primeraPrueba.datosComplejos;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class EntradaySalida {
    /**
     * "FileInputStream" necesita un throws por si da error, así que meterlo en try{catch} y localizar exception
     * "readAllBytes" también necesita un throws por posible error.
     * readAllBytes lee todo el fichero, puede ser demasiad largo y ralentizar
     */
     /* try {
        InputStream fichero = new FileInputStream("/etc/passwd"); //Declarar tipo de dato y recibir fichero
        //desde el pc (poner ruta en parametro)
        try {
            byte[] datos = fichero.readAllBytes(); //meter los datos en VAR (es array pero el tipo es byte)

            for(byte dato : datos){  //Iteramos sobre la VAR para ver el fichero
                System.out.println((char)dato);
            }
        } catch (IOException e ){
            System.out.println("no puedo leer el fichero " + e.getMessage());
        }
    } catch (FileNotFoundException e) {
        System.out.println("Oye que el fichero no existe" + e.getMessage());
    }   */

    /**
     * Leer fichero por carácter --> int datos = fichero.read();
     *          meter en while (datos != -1){ para que lea todo hasta que acabe el fichero (-1)
     */
    // int dato = fichero.read();
    //  while (dato != -1){
    //   System.out.println((char)dato);
    //   dato = fichero.read();
    //  }

    /**
     * Leer por trozos, cada X --> byte datos[] = new byte[5];
     */

    /**
     * BufferedInputStream --> va leyendo poco a poco y va pasando datos
     */
    /*    try {
            InputStream fichero = new FileInputStream();
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero); //No trabaja con ficheros asi q
            try {                                                               //metemos VAR fichero en param
                int dato = ficheroBuffer.read();
                while (dato != -1) {
                    System.out.println(dato);
                    dato = ficheroBuffer.read();
                }
            }catch (IOException e){
                System.out.println("No puedo leer el fichero " + e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("No leo " + e.getMessage());
        }*/
}
