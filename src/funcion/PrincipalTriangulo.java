package funcion;

import libreria.MiFunciones;

public class PrincipalTriangulo {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10, 20);
        System.out.println("Area Triangulo: " + t1.area());

        //Crear un vector de tamaño 10 con objetos de tipo triangulo donde
        //sus atributos son aleatorios en el rango [1,100];
        //Declarar el vector
        Triangulo[] vector = new Triangulo[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Triangulo(MiFunciones.aleatorio(), MiFunciones.aleatorio());
        }

        System.out.printf("%10s%10s%10s%10s\n", "N", "BASE", "ALTURA", "AREA");
        System.out.printf("%10s%10s%10s%10s\n", "-", "----", "------", "----");
        Triangulo x = null;
        for (int i = 0; i < vector.length; i++) {
            x = vector[i];
            System.out.printf("%10d%10.2f%10.2f%10.2f\n", (i+1), x.getBase(), x.getAltura(), x.area());
        }
    }

}
