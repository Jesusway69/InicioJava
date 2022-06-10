package funcion;

import libreria.MiFunciones;




public class Funcion2 {

    public static void main(String[] args) {
        //Implementar un método que reciba un vector de grados centigrados de tamaño 10
        //y sus valores son aleatorios entre el rango [1,100]

        int[] vectorC = new int[10]; //0-9

        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = MiFunciones.retornaGradoCentigradoAleatorio();
        }

        //Crear un método que reciba vectorC y retorne vectorF
        double[] vectorF = MiFunciones.retornaVectorF(vectorC);

        System.out.printf("%10s%10s\n","CENTI", "FARE");
        for (int i = 0; i < vectorC.length; i++) {
             System.out.printf("%10d%10.3f\n",vectorC[i], vectorF[i]);
        }
    }

}
