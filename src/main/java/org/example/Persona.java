package org.example;

public class Persona {
    private String nombre;
    private String apellido;

    public EstrategiaDeSueldo estrategiaDeSueldo;

    private Profesion profesion;

    public Persona(String nombre, String apellido, Profesion profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }

    public Profesion getProfesion() {
        return this.profesion;
    }

    public String getNombreProfession() {
        return profesion.nombreProfesion();
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer calcularsueldo(){
        return this.estrategiaDeSueldo.calcularSueldo();
    }
}
