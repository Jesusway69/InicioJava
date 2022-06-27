package sql_alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OperacionesCrud {
    
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
    
    
    
}
