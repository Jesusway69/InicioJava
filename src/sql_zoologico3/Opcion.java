package sql_zoologico3;

import java.io.IOException;
import java.sql.Connection;

public class Opcion {
    
    public static void opcion6() {
        cls();
        System.out.println("6. QUE ANIMALES HAY EN UNA CIUDAD");
        System.out.println("=================================");
        Connection conexion = OperacionesCrud.miconexion();
        if(conexion != null) {
            OperacionesCrud.mostrar(conexion);
        }else {
            System.out.println("ERROR: CONEXION");
        }
        pause();
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
