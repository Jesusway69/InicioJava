package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Coleccion1 {

    public static void main(String[] args) {
        //ARRAYLIST  (VECTOR DE OBJETOS)
        
        int[] x = new int[100];//Vector que agrupa número enteros
        Circulo[] y = new Circulo[100];//Vector que agrupa objetos de tipo circulo
        
        //EJEMPLO 1: ES UNA COLECCION DE ELEMENTOS OBJETOS DE TIPO CIRCULO
        //Declarar una coleccion de tipo Circulo
        List<Circulo> circulos_al = new ArrayList<Circulo>();//Lista que agrupa objetos de tipo circulo
        
        //Llenar la colección
        for(int i=0; i<300; i++) {
            Circulo c = new Circulo(i);
            circulos_al.add(c);
        }
        for(Circulo c: circulos_al) {
            System.out.println(c.getRadio() + "\t" + c.area() + "\t" + c.perimetro());
        }
        
        //EJEMPLO 2: UNA COLECCION CUYOS ELEMENTOS SEAN CADENAS
        List<String> nombreclientes_al = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            nombreclientes_al.add("nombre"+i);
        }
        for(int i=0; i<nombreclientes_al.size(); i++) {
            String n = nombreclientes_al.get(i);
            System.out.println(n);
        }
        
        
        
        
        
        
    }
    
}
