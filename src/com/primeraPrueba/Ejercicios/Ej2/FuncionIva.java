package com.primeraPrueba.Ejercicios.Ej2;

public class FuncionIva {
    public static void main(String[] args) {
        double price = 19.99d;
        double iva = 0.21d;
        double resultado = getPriceIva(price, iva);

        System.out.println(resultado);


    }
    public static double getPriceIva(double price, double iva){
        return price * iva + price;
    }
}
