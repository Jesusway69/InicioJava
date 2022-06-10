package expresion_regular;

import java.util.Scanner;

public class Probando {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//UTF-8
        String scadena;
        String erl = "[a-zA-ZñÑ]|[áéíóúÁÉÍÓÚÄÜ]"; //Todas las letras
        String erv = "[aeiouAEIOUáéíóúÁÉÍÓÚ]";
        
        do {
             System.out.print("Ingrese cadena?");
             String letra = sc.next();
             //String letra = cadena.charAt(0)+"";
             if(letra.matches(erl)) {
                System.out.println("SI");
             }else {
                System.out.println("NO");
             }
            
        }while(true);
        
        
        
        
        
        
        
        
    }

}
