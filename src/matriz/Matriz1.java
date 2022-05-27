package matriz;

public class Matriz1 {

    public static void main(String[] args) {
        //Declarar matriz enteros de tamaño 3x2 filas x columnas
        int[][] m = new int[3][2]; //3x2 = 6 elementos
        //Llenar la matriz
        m[0][0] = 5;
        m[0][1] = 6;
        m[1][0] = 7;
        m[1][1] = 8;
        m[2][0] = 9;
        m[2][1] = 10;
        
        //int[][] m = {{5,6},{7,8},{9,10}};
        
        //Mostrar la matriz
        System.out.println("Número filas   : " + m.length);
        System.out.println("Número columnas: " + m[2].length);
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                System.out.print("("+f+","+c+")="+m[f][c]);
            }
            System.out.println();
        }
    }
}
