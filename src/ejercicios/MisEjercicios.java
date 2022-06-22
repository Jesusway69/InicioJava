package ejercicios;

public class MisEjercicios {

    public static void ejercicio16_1() {
        int a = 4;
        String r = (a % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println(r);
    }

    public static void ejercicio16_2() {
        int a = 4;
        System.out.println((a % 2 == 0) ? "PAR" : "IMPAR");
    }

    public static void ejercicio17_1() {
        int n = 1008;
        int semanas = n / 168;
        int rs = n % 168;
        int dias = rs / 24;
        int rd = rs % 24;
        int horas = rd;
        System.out.println(semanas + " Semanas");
        System.out.println(dias + " Días");
        System.out.println(horas + " Horas");
    }

    public static void ejercicio17_2() {
        int h = 1008;

        int semanas = h / 168;
        int dias = (h % 168) / 24;
        int horas = (h % 24);

        System.out.println(h + " horas equivalen a");
        System.out.println(semanas + " Semanas ");
        System.out.println(dias + " Días ");
        System.out.println(horas + " Horas ");
    }

    public static void ejercicio17_3() {
        System.out.printf("%5s%14s%10s%10s%10s\n", "N", "CANTIDAD H", "SEMANAS", "DIAS", "HORAS");
        System.out.printf("%5s%14s%10s%10s%10s\n", "-", "----------", "-------", "----", "-----");
        for (int i = 0; i < 100; i++) {
            int aleatorio = (int) (Math.random() * 4001 + 1000);   //[1000,5000]
            Ejercicio17_3 objeto = new Ejercicio17_3(aleatorio);
            int[] x = objeto.getSemanasDiasHoras();
            System.out.printf("%5d%14d%10d%10d%10d\n", (i + 1), aleatorio, x[0], x[1], x[2]);
        }
    }
    
    public static void ejercicio15() {
        //ENTRADA
        int cantidadPersonas = Entrada.entradaCantidadPersonas();
        double precioxkiloArroz = Entrada.entradaPrecioxkilo("Arroz");
        double precioxkiloGamba = Entrada.entradaPrecioxkilo("Gambas");
        //CALCULO
        double kilosArroz = cantidadPersonas / 8.0; 
        double kilosGamba = cantidadPersonas / 16.0;
        double costoArroz = kilosArroz * precioxkiloArroz;
        double costoGamba = kilosGamba * precioxkiloGamba;
        //SALIDA
        System.out.println("Cantidad en kilos de Arroz: " + kilosArroz + " Kilos");
        System.out.println("Cantidad en kilos de Gamba: " + kilosGamba + " Kilos");
        System.out.println("Costo de Arroz: " + costoArroz + " \u20AC");
        System.out.println("Costo de Gamba: " + costoGamba + " \u20AC");
    }
    
    public static void ejercicio14() {
        //ENTRADA
        double precioPagado = Entrada.entradaPrecio("Pagado");
        double precioTarifa = Entrada.entradaPrecio("Tarifa");
        //CALCULO
        double descuento = (1 - (precioPagado/precioTarifa))*100;
        //SALIDA
        System.out.println("Descuento : " + descuento + "%");
    }

}
