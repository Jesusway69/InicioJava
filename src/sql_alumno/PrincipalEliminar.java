package sql_alumno;

import java.sql.Connection;

public class PrincipalEliminar {

    public static void main(String[] args) {
        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("instituto", "root", "");
        Connection conexion = cm.getConexion();
        if (conexion != null) {
            if (OperacionesCrud.eliminar("Marianela", conexion) != -1) {
                System.out.println("OK: ELIMINAR ALUMNO");
            } else {
                System.out.println("ERROR: ELIMINAR ALUMNO");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }

    }

}
