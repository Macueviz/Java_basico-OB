package com.primeraPrueba.datosComplejos;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    /**
     * Los HashMap son como un diccionario, tiene una clave y un valor
     * Las claves no pueden estar repetidas
     * Sería como un array con valor Array["clave"] = valor
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>(); //Creamos tipo de dato
        mapa.put("clave1", 10); // Añadimos clave y valor
        mapa.put("clave2", 20); //En este ej hemos puesto clave STRING y valor INTEGER
        mapa.put("clave3", 30);
        System.out.println(mapa); // System.out.println(map.get("clave1")); Si queremos un dato del mapa

        mapa.replace("clave3", 20); //reemplazar clave, pero si no existe la ignora (no hace nada)
                                    //Si usamos mapa.put con la misma clave, la va a sustituir, si no existe, la crea
        mapa.remove("clave2"); //borrar clave

        //Iterar sobre mapa
        /**
         * Map.Entry son todos los elementos del mapa
         *  mapa.entrySet cada dato individual que lo metemos en VAR elemento
         *  Sacar el dato de VAR con los métodos
         */
        for (Map.Entry elemento : mapa.entrySet()){
            System.out.println(elemento.getKey()); //Método para obtener clave
            System.out.println(elemento.getValue()); // Método para obtener valor

        }
    }
}
