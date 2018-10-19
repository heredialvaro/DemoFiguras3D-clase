package org.salle.ing.dpoo.figuras3d;

public class Esfera extends Figura3D {

    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    //Estamos sobreescribiendo el metodo abstracto calcularVolumen()
    @Override
    public double calcularVolumen() {
        return (4/3)*Math.PI*Math.pow(radio,3);
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }
}
