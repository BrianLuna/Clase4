package org.example;

public class Profesor extends Profesion{
    private String materia;

    public Profesor(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String nombreProfesion() {
        return "Profesor";
    }
}
