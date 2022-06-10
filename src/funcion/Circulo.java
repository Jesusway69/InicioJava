package funcion;

public class Circulo {

    //ATRIBUTO
    double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }

    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

}
