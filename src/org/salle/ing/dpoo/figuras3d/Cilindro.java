package org.salle.ing.dpoo.figuras3d;

public class Cilindro extends Figura3D {

    private double altura;
    private double radio;

    public Cilindro(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
    }

    @Override
    public double calcularVolumen() {
        return Math.PI*Math.pow(radio,2)*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                ", radio=" + radio +
                '}';
    }
}
