/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.rest.response;

/**
 *
 * @author ad
 */
public class TriangulacionResponse {

    private Coordenada posiblePosicionMuzan;
    private double nivelConfianza;
    private String descripcion;

    public TriangulacionResponse() {
    }

    public TriangulacionResponse(Coordenada posiblePosicionMuzan, double nivelConfianza, String descripcion) {
        this.posiblePosicionMuzan = posiblePosicionMuzan;
        this.nivelConfianza = nivelConfianza;
        this.descripcion = descripcion;
    }

    public TriangulacionResponse(double x, double y, double nivelConfianza, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Coordenada getPosiblePosicionMuzan() {
        return posiblePosicionMuzan;
    }

    public void setPosiblePosicionMuzan(Coordenada posiblePosicionMuzan) {
        this.posiblePosicionMuzan = posiblePosicionMuzan;
    }

    public double getNivelConfianza() {
        return nivelConfianza;
    }

    public void setNivelConfianza(double nivelConfianza) {
        this.nivelConfianza = nivelConfianza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Clase interna para coordenadas X e Y
    public static class Coordenada {
        private int x;
        private int y;

        public Coordenada() {
        }

        public Coordenada(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}