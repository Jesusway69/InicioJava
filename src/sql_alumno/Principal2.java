package sql_alumno;

import java.sql.Connection;

public class Principal2 {

    public static void main(String[] args) {
        //CONEXION
        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("instituto", "root", "");
        Connection conexion = cm.getConexion();
        //VERIFICAR LA CONEXION
        if (conexion != null) {
            Alumno alumno = new Alumno(0, "Ismael", 24, 1.70);
            //HACER OPERACION CRUD Y VERIFICAR
            if (OperacionesCrud.insertar(alumno, conexion) != -1) {
                System.out.println("OK");
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }

    }

}
