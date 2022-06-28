package sql_alumno;

import java.sql.Connection;

public class PrincipalActualiza1 {

    public static void main(String[] args) {
        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("instituto", "root", "");
        Connection conexion = cm.getConexion();
        try {
            Alumno alumno = new Alumno(12, "Susana", 0, 1.65);
            int y = OperacionesCrud.actualizar(alumno, conexion);
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        
        
    }

}
