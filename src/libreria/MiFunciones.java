package libreria;

import java.util.Scanner;

public class MiFunciones {

    public static double entrada() {
        Scanner sc = new Scanner(System.in);
        String er = "([0-9]+\\.[0-9]+)||[0-9]+";
        String scenti;
        double dcenti;
        boolean correcto;
        do {
            System.out.print("Ingrese grados centigrados? ");
            scenti = sc.next();
            correcto = scenti.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        dcenti = Double.parseDouble(scenti);
        return dcenti;
    }

    public static double convertirCF(double c) {
        double f = 0;
        f = (c * 1.8) + 32;
        return f;
    }
    
    public static int retornaGradoCentigradoAleatorio() { //[1,100]  
        return (int)(Math.random()*100 + 1);
    }

}
