package sql_alumno;

import java.sql.*;
import java.util.*;

public class PrincipalBuscarAlumno {

    public static void main(String[] args) {
        //CANDENA DE CONEXION
        String url = "jdbc:mysql://127.0.0.1:3306/instituto"; //Protocolo,NombreServidor,Puerto,BaseDatos
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "");
            String query = "SELECT * FROM Alumno WHERE idAlumno = 15";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            boolean bandera = false;
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " "
                        + rs.getString(2) + " "
                        + rs.getInt(3) + " "
                        + rs.getDouble(4));
                bandera = true;
            }
            if(bandera == false) System.out.println("NO EXISTE ALUMNO");
        } catch (SQLException ex) {
            System.out.println("ERROR");
        }
    }
}
