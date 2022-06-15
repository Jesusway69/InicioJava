package coleccion_alumno;

public class Metodos {
    
    public static String getNombreAleatorio() {
                          //0       1       2         3       4        [0,4]    
        String[] nombre = {"Luis","Miguel","Carmen","Carlos","Arturo"};
        int aleatorio = (int)(Math.random()*5);
        return nombre[aleatorio];
    }
    
}
