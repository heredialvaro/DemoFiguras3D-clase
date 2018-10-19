package org.salle.ing.dpoo.figuras3d;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {

        ArrayList<Figura3D> arrayFiguras = new ArrayList<>();

        //Creamos las figuras
        Esfera e = new Esfera(2);
        Cilindro c = new Cilindro(2, 3);
        Cubo cu = new Cubo(3);

        //Añadimos las figuras al ArrayList
        arrayFiguras.add(e);
        arrayFiguras.add(c);
        arrayFiguras.add(cu);

        mostrarArrayFiguras(arrayFiguras);

        //Ordenación de las figuras de manera descendente en base a su volumen
        arrayFiguras.sort(comparing(Figura3D::calcularVolumen).reversed());

        System.out.println("Ordenado descendente: ");

        mostrarArrayFiguras(arrayFiguras);

        //Ordenación de las figuras de manera ascendente en base a su volumen
        arrayFiguras.sort(comparing(Figura3D::calcularVolumen));

        System.out.println("Ordenado ascendente: ");

        mostrarArrayFiguras(arrayFiguras);
    }

    private static void mostrarArrayFiguras(ArrayList<Figura3D> arrayFiguras) {
        for (Figura3D f : arrayFiguras) {
            System.out.println(f);
            System.out.println("Volumen: " + f.calcularVolumen());
            System.out.println();
        }
    }
}