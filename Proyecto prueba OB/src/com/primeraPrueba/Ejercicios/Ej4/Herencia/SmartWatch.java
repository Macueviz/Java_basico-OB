package com.primeraPrueba.Ejercicios.Ej4.Herencia;

import com.primeraPrueba.Ejercicios.Ej4.Apk;
import com.primeraPrueba.Ejercicios.Ej4.SmartDevice;

public class SmartWatch extends SmartDevice {

        // 1. A
        Double heartRate;
        int dreamQuality;

        // 2. Constr
        public SmartWatch(){

        }
        public SmartWatch(String color, String op, String brand,
                          Double size, Double price, Double peso, Apk apk, Double heartRate, int dreamQuality){
                super(color,op,brand,size,price,peso,apk);
                this.heartRate = heartRate;
                this.dreamQuality = dreamQuality;

        }

}
