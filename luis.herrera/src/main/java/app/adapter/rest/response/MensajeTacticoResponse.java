/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.rest.response;

/**
 *
 * @author ad
 */
public class MensajeTacticoResponse {

    private Long id;
    private Long pilarId;
    private String contenido;

    public MensajeTacticoResponse() {}

    public MensajeTacticoResponse(Long id, Long pilarId, String contenido) {
        this.id = id;
        this.pilarId = pilarId;
        this.contenido = contenido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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