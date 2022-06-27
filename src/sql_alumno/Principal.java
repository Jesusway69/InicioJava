package sql_alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        
        String query = "INSERT INTO Alumno (idAlumno, nombre, edad, estatura) VALUES (NULL,'Delly',17,1.63)";
        
        //PARAMETROS DE CONEXION
        /*
        PROTOCOLO        :   jdbc:mysql
        NOMBRE SERVIDOR  :   localhost = 127.0.0.1
        PUERTO           :   3306
        BASE DATOS       :   instituto
        */
        String url     = "jdbc:mysql://localhost:3306/instituto";
        String usuario = "root";
        String clave   = "";
        //CONEXION
        Connection conexion = null;
        try {
             conexion = DriverManager.getConnection(url, usuario, clave);
        }catch(SQLException e) {
             System.out.println(e.getMessage());
        }
       
        //INSERTAR REGISTRO ALUMNO
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.executeUpdate();
            System.out.println("OK: INSERTAR REGISTRO ALUMNO");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
       
    }

}
