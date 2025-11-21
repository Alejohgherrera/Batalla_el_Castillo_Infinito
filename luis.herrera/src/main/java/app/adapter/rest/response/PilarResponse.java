package app.adapter.rest.response;

import app.domain.model.enums.EstadoPilar;

/**
 *
 * @author ad
 */
public class PilarResponse {

    private Long id;
    private String nombre;
    private String rango;
    private String armaPrincipal;
    private int posX;
    private int posY;
    private EstadoPilar estado;

    public PilarResponse() {}

    public PilarResponse(Long id, String nombre, String rango, String armaPrincipal,
                         int posX, int posY, EstadoPilar estado) {
        this.id = id;
        this.nombre = nombre;
        this.rango = rango;
        this.armaPrincipal = armaPrincipal;
        this.posX = posX;
        this.posY = posY;
        this.estado = estado;
    }

    public PilarResponse(Long id, String nombre, String rango, String armaPrincipal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public EstadoPilar getEstado() {
        return estado;
    }

    public void setEstado(EstadoPilar estado) {
        this.estado = estado;
    }
}
