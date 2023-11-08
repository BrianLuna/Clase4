package org.example;

public class Policia extends Profesion{

    private String especialidad;

    public Policia(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String nombreProfesion() {
        return "Policía";
    }
}
