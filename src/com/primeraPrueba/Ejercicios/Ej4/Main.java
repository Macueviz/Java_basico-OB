package com.primeraPrueba.Ejercicios.Ej4;

import com.primeraPrueba.Ejercicios.Ej4.Apk;
import com.primeraPrueba.Ejercicios.Ej4.SmartDevice;


public class Main {
    public static void main(String[] args) {

        Apk whatsapp = new Apk(true,true,2.1,true,20);

        SmartDevice appleWatch = new SmartDevice("Blanco","Apple", "Cascabel",
                115.4, 1200d, 150.0, whatsapp);
        System.out.println(appleWatch.size);

        Apk twitter = new Apk(true,false,1.5,false,10);
        SmartDevice xiaomi5 = new SmartDevice("Black", "Android", "Xiaomi",
                150.2, 249.99, 220.3, twitter);
        System.out.println(xiaomi5.op);
        System.out.println("Fin programa");
    }

}
