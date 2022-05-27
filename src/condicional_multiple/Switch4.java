package condicional_multiple;

import java.util.Scanner;

public class Switch4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una letra ? ");
        String letra = sc.next().toLowerCase();

        //char x = letra.charAt(0);
        //EXPRESIONES REGULARES (IDENTIFICA PATRONES)
        String er0 = "[A-Za-z]|[\u00f1]";  //letra = a
        String er1 = "[abc]";
        String er2 = "[0-9]";
        String er3 = "";
        boolean y = letra.matches(er0);

        if (y == true) {
            System.out.println("Letra");
            //System.out.println("SI a b c");
        }else {
            System.out.println("No Letra");
            //System.out.println("NO");
        }

        /*
       
        
        String cadena = "";
        switch (x) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                cadena = "vocal";
                break;

            default:
                cadena = "consonante";

        }
        System.out.print(cadena);
        {

        }
         */
    }

}

}
