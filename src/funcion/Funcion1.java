package funcion;

import java.util.Scanner;
import libreria.MiFunciones;


public class Funcion1 {

    public static void main(String[] args) {
        //Construir una función que convierta centigrados a farenhite y viceversa
        double c = MiFunciones.entrada();
        System.out.print("F: " + MiFunciones.convertirCF(c));
    }
}
