/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.rest.builder;

import app.adapter.rest.response.PilarResponse;

/**
 *
 * @author ad
 */
public class PilarResponseBuilder {

    private Long id;
    private String nombre;
    private String rango;
    private String armaPrincipal;

    public PilarResponseBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public PilarResponseBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PilarResponseBuilder setRango(String rango) {
        this.rango = rango;
        return this;
    }

    public PilarResponseBuilder setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
        return this;
    }

    public PilarResponse build() {
        return new PilarResponse(id, nombre, rango, armaPrincipal);
    }
}