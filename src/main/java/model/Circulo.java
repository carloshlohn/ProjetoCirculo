package model;

public class Circulo {

    private double pi;
    private double raio;

    public Circulo() {
        this(0, 0);
    }

    public Circulo(double pi, double raio) {
        this.pi = 3.14;
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = 3.14;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return (getPi() * (getRaio() * getRaio()));
    }
}
