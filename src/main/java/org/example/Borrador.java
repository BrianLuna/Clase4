package org.example;

public class Borrador implements EstadoDocumento{
    @Override
    public void publicarDocumento(Documento documento) {
        EstadoDocumento nuevoEstado = new Borrador();
        if (documento.getTipoUsuario().equals("Administrador")){
            nuevoEstado = new Publicado();
        } else {
            nuevoEstado = new Moderacion();
        }

        documento.setEstadoDocumento(nuevoEstado);
    }
}
