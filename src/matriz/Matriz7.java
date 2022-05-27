package matriz;

import java.util.Scanner;

public class Matriz7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar número de asteriscos que tendra el lado de un cuadrado? ");
        int n = sc.nextInt();
        int k = (n - 1);
        int m = 0;
        int h = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            m = i + k;
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*");
                    //m = j + k;
                } else {
                    System.out.print(" ");
                }
                if (j == m && i != h && j != h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            k = k - 2;
            System.out.println();
        }
    }

}
