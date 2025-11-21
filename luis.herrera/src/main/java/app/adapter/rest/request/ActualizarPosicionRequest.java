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

public class ActualizarPosicionRequest {

    @NotNull(message = "El ID del Pilar es obligatorio")
    private Long pilarId;

    @NotNull(message = "La posición X es obligatoria")
    private Integer posX;

    @NotNull(message = "La posición Y es obligatoria")
    private Integer posY;

    @NotNull(message = "El estado del Pilar es obligatorio")
    private String estado;

    public ActualizarPosicionRequest() {
    }

    public ActualizarPosicionRequest(Long pilarId, Integer posX, Integer posY, String estado) {
        this.pilarId = pilarId;
        this.posX = posX;
        this.posY = posY;
        this.estado = estado;
    }

    public Long getPilarId() {
        return pilarId;
    }

    public void setPilarId(Long pilarId) {
        this.pilarId = pilarId;
    }

    public Integer getPosX() {
        return posX;
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
