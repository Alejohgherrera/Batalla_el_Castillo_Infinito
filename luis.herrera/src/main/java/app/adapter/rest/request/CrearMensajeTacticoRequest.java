/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.rest.request;

/**
 *
 * @author ad
 */
public class CrearMensajeTacticoRequest {

    private Long pilarId;
    private String contenido;

    public CrearMensajeTacticoRequest() {}

    public Long getPilarId() {
        return pilarId;
    }

    public void setPilarId(Long pilarId) {
        this.pilarId = pilarId;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}

