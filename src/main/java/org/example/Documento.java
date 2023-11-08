package org.example;

public class Documento {

    private EstadoDocumento estadoDocumento;
    private String tipoUsuario;


    public Documento(EstadoDocumento estadoDocumento, String tipoUsuario) {
        this.estadoDocumento = estadoDocumento;
        this.tipoUsuario = tipoUsuario;
    }

    public EstadoDocumento getEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(EstadoDocumento estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void publicar(){
        estadoDocumento.publicarDocumento(this);
    };
}
