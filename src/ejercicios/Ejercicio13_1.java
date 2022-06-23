package ejercicios;


public class Ejercicio13_1 {
    
    private int cantidadCajas;
    private int unidaddadesxCaja;
    private double precioCaja;

    public Ejercicio13_1() {
    }

    public Ejercicio13_1(int cantidadCajas, int unidaddadesxCaja, double precioCaja) {
        this.cantidadCajas = cantidadCajas;
        this.unidaddadesxCaja = unidaddadesxCaja;
        this.precioCaja = precioCaja;
    }

    public int getCantidadCajas() {
        return cantidadCajas;
    }

    public void setCantidadCajas(int cantidadCajas) {
        this.cantidadCajas = cantidadCajas;
    }

    public int getUnidaddadesxCaja() {
        return unidaddadesxCaja;
    }

    public void setUnidaddadesxCaja(int unidaddadesxCaja) {
        this.unidaddadesxCaja = unidaddadesxCaja;
    }

    public double getPrecioCaja() {
        return precioCaja;
    }

    public void setPrecioCaja(double precioCaja) {
        this.precioCaja = precioCaja;
    }

    @Override
    public String toString() {
        return "Ejercicio13_1{" + "cantidadCajas=" + cantidadCajas + ", unidaddadesxCaja=" + unidaddadesxCaja + ", precioCaja=" + precioCaja + '}';
    }
    
    public double[] getCalculoAtributos() {
        double[] v = new double[1];
        v[0] = this.cantidadCajas * this.precioCaja;  //Importe por cada producto
        return v;
    }
    
}
