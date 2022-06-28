package sql_alumno;

import java.sql.Connection;
import java.util.List;

public class PrincipalMostrarTodosRegistroTablaAlumno {

    public static void main(String[] args) {
        ConexionMariadb cm = new ConexionMariadb();
        cm.setConexion("instituto", "root", "");
        Connection conexion = cm.getConexion();
        if (conexion != null) {
            List<Alumno> alumnos_al = OperacionesCrud.retornaColeccionAlumnos(conexion);
            Alumno.cabecera();
            for (Alumno alumno : alumnos_al) {
                alumno.imprimir();
            }
            for(int i=0; i<alumnos_al.size();i++) {
                Alumno alumno = alumnos_al.get(i);
                alumno.imprimir();
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }

    }

}
