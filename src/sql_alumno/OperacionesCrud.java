package sql_alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OperacionesCrud {

    public static int crearTablaAlumno(Connection conexion) {
        String query = "CREATE TABLE IF NOT EXISTS Alumno ("
                + "idAlumno INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,"
                + "nombre   VARCHAR(25) NOT NULL,"
                + "edad     INT         NOT NULL,"
                + "estatura DOUBLE      NOT NULL"
                + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
        } catch (SQLException e) {
            return -1;
        }
        return 1;

    }

    public static int insertar(Alumno alumno, Connection conexion) {
        String nombre = alumno.getNombre();
        int edad = alumno.getEdad();
        double estatura = alumno.getEstatura();
        String query = "INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,?,?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setInt(2, edad);
            ps.setDouble(3, estatura);
            ps.executeUpdate();
        } catch (SQLException ex) {
            return -1;
        }
        return 1;
    }

    public static int eliminar(int idAlumno, Connection conexion) {
        String query = "DELETE FROM Alumno WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ps.executeUpdate();
        } catch (SQLException ex) {
            return -1;
        }
        return 1;
    }

}
