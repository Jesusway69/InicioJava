
package expresion_regular;

import java.util.Scanner;

public class ExpresionRegular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sn1, sn2;
        double n1, n2, r;
        String er = "(20)[0-4][0-9]||(2050)";//2000 - 2050
        boolean correcto;
        do {
            System.out.print("Ingrese cadena ?");
            sn1 = sc.next();
            correcto = sn1.matches(er);
            if (correcto == false) {
                System.out.println("Cadena no válida");
                
            }
        } while (correcto == false); 

    }

}