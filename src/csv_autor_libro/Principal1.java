package csv_autor_libro;

import autor_libro.Autor;
import autor_libro.Libro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal1 {

    public static void main(String[] args) {
        List<Autor> autores_al = new ArrayList<Autor>();
        List<Libro> libros_al = new ArrayList<Libro>();
        File f;
        FileReader fr;
        BufferedReader br;
        String registro = "";
        try {
            //AUTOR
            f = new File("datos/autor.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((registro = br.readLine()) != null) {
                String[] c = registro.split(";");
                Autor autor = new Autor(Integer.parseInt(c[0]),
                        c[1], c[2], Integer.parseInt(c[3]));
                autores_al.add(autor);
                //autores_al.add(new Autor(Integer.parseInt(c[0]),c[1],c[2],Integer.parseInt(c[3])));
            };
            //LIBRO
            f = new File("datos/libro.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] c = registro.split(";");
                Libro libro = new Libro(Integer.parseInt(c[0]),
                        c[1], c[2],
                        Integer.parseInt(c[3]),
                        Integer.parseInt(c[4]));
                libros_al.add(libro);
                //autores_al.add(new Autor(Integer.parseInt(c[0]),c[1],c[2],Integer.parseInt(c[3])));
            };
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println();
        System.out.println("1. MOSTRAR TODOS REGISTROS DE LA TABLA LIBRO");
        System.out.println("============================================");
        System.out.println();

        Libro.cabecera();
        for (int i = 0; i < libros_al.size(); i++) {
            Libro libro = libros_al.get(i);
            libro.imprimir();
        }
        System.out.println();
        System.out.println("2. MOSTRAR TODOS LOS LIBROS DE PROGRAMACION");
        System.out.println("===========================================");
        System.out.println();

        Libro.cabecera();
        for (int i = 0; i < libros_al.size(); i++) {
            Libro libro = libros_al.get(i);
            if (libro.getDescripcion().equalsIgnoreCase("ProgRamaciÓn")) {
                libro.imprimir();
            }
        }
        System.out.println();
        System.out.println("3. MOSTRAR TODOS LOS AUTORES DE LIBROS DE PROGRAMACION");
        System.out.println("======================================================");
        System.out.println();

        Set<Integer> autores_ts = new TreeSet<Integer>();
        for (int i = 0; i < libros_al.size(); i++) {
            Libro libros = libros_al.get(i);
            if (libros.getDescripcion().equalsIgnoreCase("Programación")) {
                int idAutor = libros.getIdAutor();
                autores_ts.add(idAutor);
            }
        }
        List<Integer> identificadoresautores_al = new ArrayList<Integer>(autores_ts);
        Autor.cabecera();
        //FORMA 1
        for (int i = 0; i < identificadoresautores_al.size(); i++) {
            for (Autor a : autores_al) {
                if (a.getIdAutor() == identificadoresautores_al.get(i)) {
                    a.imprimir();
                    break;
                }
            }
        }
        //FORMA 2
        for (int i = 0; i < identificadoresautores_al.size(); i++) {
            for (int j = 0; j < autores_al.size(); j++) {
                Autor a = autores_al.get(j);
                if (a.getIdAutor() == identificadoresautores_al.get(i)) {
                    a.imprimir();
                    break;
                }
            }
        }
        //FORMA 3
        for (Integer id : identificadoresautores_al) {//1, 2
            for (Autor a : autores_al) {
                if (a.getIdAutor() == id) {
                    a.imprimir();
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("4. MOSTRAR TODOS LOS LIBROS DE JAVA");
        System.out.println("===================================");
        System.out.println();

        String str = "Introducción Java";
        String subStr = "Java";
        boolean containsStr = str.contains(subStr);
        System.out.println(containsStr);

    }
}
