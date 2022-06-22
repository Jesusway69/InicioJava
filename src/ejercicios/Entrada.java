package ejercicios;

import java.util.Scanner;

public class Entrada {

    public static int entradaCantidadPersonas() {
        Scanner sc = new Scanner(System.in);
        String er = "[0-9]+";
        String scantidadPersonas;
        int icantidadPersonas;
        boolean correcto;
        do {
            System.out.print("Ingrese cantidad personas? ");
            scantidadPersonas = sc.next();
            correcto = scantidadPersonas.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        icantidadPersonas = Integer.parseInt(scantidadPersonas);
        return icantidadPersonas;
    }

    public static double entradaPrecioxkilo(String cadena) {
        Scanner sc = new Scanner(System.in);
        String er = "([0-9]+\\.[0-9]+)||[0-9]+";
        String sprecioxkilo;
        double dprecioxkilo;
        boolean correcto;
        do {
            System.out.print("Ingrese precio x kilo de " + cadena + "? ");
            sprecioxkilo = sc.next();
            correcto = sprecioxkilo.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        dprecioxkilo = Double.parseDouble(sprecioxkilo);
        return dprecioxkilo;
    }
}
