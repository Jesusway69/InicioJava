package matriz;

import java.io.IOException;

public class Matriz3 {

    public static void main(String[] args) {
        int[][] x = {{1}, {1, 2, 3}, {1, 2, 3, 4, 5}};
        for (int f = 0; f < x.length; f++) {
            for (int c = 0; c < x[f].length; c++) {
                System.out.print(x[f][c]+ "\t");
                //pause();
            }
            System.out.println();
        }
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }
}
