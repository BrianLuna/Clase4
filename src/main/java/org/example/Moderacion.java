package org.example;

public class Moderacion implements EstadoDocumento{
    @Override
    public void publicarDocumento(Documento documento) {
        documento.setEstadoDocumento(new Publicado());
    }
}
