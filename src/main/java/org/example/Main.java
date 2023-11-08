package org.example;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        Profesor profesorDeDiseño = new Profesor("Diseño de sistemas");
        Persona franco = new Persona("Franco", "Bulgarelli", profesorDeDiseño);

        System.out.println(franco.getNombreProfession());

        System.out.println(franco.calcularsueldo());

    }
}