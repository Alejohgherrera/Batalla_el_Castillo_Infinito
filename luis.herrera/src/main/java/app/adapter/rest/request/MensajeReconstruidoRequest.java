/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.rest.request;

import jakarta.validation.constraints.NotNull;

/**
 *
 * @author ad
 */
public class MensajeReconstruidoRequest {

    @NotNull(message = "El contenido reconstruido no puede ser nulo")
    private String contenidoReconstruido;

    public MensajeReconstruidoRequest() {
    }

    public MensajeReconstruidoRequest(String contenidoReconstruido) {
        this.contenidoReconstruido = contenidoReconstruido;
    }

    public String getContenidoReconstruido() {
        return contenidoReconstruido;
    }

    public void setContenidoReconstruido(String contenidoReconstruido) {
        this.contenidoReconstruido = contenidoReconstruido;
    }
}
