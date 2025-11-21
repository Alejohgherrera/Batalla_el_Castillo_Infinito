/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.rest.builder;

import app.adapter.rest.response.MensajeTacticoResponse;

/**
 *
 * @author ad
 */
public class MensajeTacticoResponseBuilder {

    private Long id;
    private Long pilarId;
    private String contenido;

    public MensajeTacticoResponseBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public MensajeTacticoResponseBuilder setPilarId(Long pilarId) {
        this.pilarId = pilarId;
        return this;
    }

    public MensajeTacticoResponseBuilder setContenido(String contenido) {
        this.contenido = contenido;
        return this;
    }

    public MensajeTacticoResponse build() {
        return new MensajeTacticoResponse(id, pilarId, contenido);
    }
}