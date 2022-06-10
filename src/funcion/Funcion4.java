package funcion;

import java.util.Scanner;
import libreria.MiFunciones;

public class Funcion4 {

    public static void main(String[] args) {
       
        Circulo c = new Circulo(10);
        
        System.out.println("Perimetro: " + c.perimetro());
        System.out.println("Area: " + c.area());
    }
    
}
