package com.primeraPrueba.Ejercicios.Ej5;

public class Mainn {
    public static void main(String[] args) {

        CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

        System.out.println(cocheCRUD);
    }
}
