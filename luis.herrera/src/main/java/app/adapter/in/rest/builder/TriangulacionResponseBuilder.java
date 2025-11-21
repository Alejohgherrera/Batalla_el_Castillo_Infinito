/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.rest.builder;

import app.adapter.rest.response.TriangulacionResponse;

/**
 *
 * @author ad
 */
public class TriangulacionResponseBuilder {

    private double x;
    private double y;
    private double nivelConfianza;
    private String descripcion;

    public TriangulacionResponseBuilder setX(double x) {
        this.x = x;
        return this;
    }

    public TriangulacionResponseBuilder setY(double y) {
        this.y = y;
        return this;
    }

    public TriangulacionResponseBuilder setNivelConfianza(double nivelConfianza) {
        this.nivelConfianza = nivelConfianza;
        return this;
    }

    public TriangulacionResponseBuilder setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public TriangulacionResponse build() {
        return new TriangulacionResponse(
                x,
                y,
                nivelConfianza,
                descripcion
        );
    }
}