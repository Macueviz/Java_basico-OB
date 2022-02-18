package com.primeraPrueba.interfaces;

public class Main {

    static EmpleadoCRUD empleadoCRUD;
    public static void main(String[] args) {

       empleadoCRUD.save(new Empleado());
       empleadoCRUD.findAll();





    }
}
