package org.example;

public class Mecanico extends Profesion{
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Mecanico(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String nombreProfesion() {
        return "Mecanico";
    }
}
