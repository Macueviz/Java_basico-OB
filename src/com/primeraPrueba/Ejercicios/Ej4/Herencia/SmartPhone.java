package com.primeraPrueba.Ejercicios.Ej4.Herencia;

import com.primeraPrueba.Ejercicios.Ej4.Apk;
import com.primeraPrueba.Ejercicios.Ej4.SmartDevice;

public class SmartPhone extends SmartDevice {
        // 1. At
        boolean gps;
        boolean videocall;

        // 2. Constr
        public SmartPhone(){
        }

        public SmartPhone(String color, String brand, String op, Double size, Double price, Double peso, boolean gps, boolean videocall) {
                super(color, brand, op, size, price, peso, new Apk());
                this.gps = gps;
                this.videocall = videocall;
        }
        // 3. Mét
}
