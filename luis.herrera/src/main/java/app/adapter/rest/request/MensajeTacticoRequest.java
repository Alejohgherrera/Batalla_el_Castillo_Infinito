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
public class MensajeTacticoRequest {

    @NotNull(message = "El ID del Pilar es obligatorio")
    private Long pilarId;

    @NotNull(message = "El contenido fragmentado es obligatorio")
    private String contenidoFragmentado;

    public MensajeTacticoRequest() {
    }

    public MensajeTacticoRequest(Long pilarId, String contenidoFragmentado) {
        this.pilarId = pilarId;
        this.contenidoFragmentado = contenidoFragmentado;
    }

    public Long getPilarId() {
        return pilarId;
    }

    public void setPilarId(Long pilarId) {
        this.pilarId = pilarId;
    }

    public String getContenidoFragmentado() {
        return contenidoFragmentado;
    }

    public void setContenidoFragmentado(String contenidoFragmentado) {
        this.contenidoFragmentado = contenidoFragmentado;
    }
}
