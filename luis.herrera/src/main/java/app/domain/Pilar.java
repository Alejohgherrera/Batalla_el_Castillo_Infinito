package app.domain;

import app.domain.model.enums.EstadoPilar;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pilares")
public class Pilar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int posX;
    private int posY;

    @Enumerated(EnumType.STRING)
    private EstadoPilar estado;

    private String rango;
    private String armaPrincipal;

    public Pilar() {}

    public Pilar(String nombre, int posX, int posY, EstadoPilar estado, String rango, String armaPrincipal) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
        this.estado = estado;
        this.rango = rango;
        this.armaPrincipal = armaPrincipal;
    }

    public Pilar(Long id, String nombre, int posX, int posY, EstadoPilar estado, String rango, String armaPrincipal) {
        this.id = id;
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
        this.estado = estado;
        this.rango = rango;
        this.armaPrincipal = armaPrincipal;
    }

    public Pilar(Long id, String nombre, int posX, int posY, EstadoPilar estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getPosX() { return posX; }
    public void setPosX(int posX) { this.posX = posX; }

    public int getPosY() { return posY; }
    public void setPosY(int posY) { this.posY = posY; }

    public EstadoPilar getEstado() { return estado; }
    public void setEstado(EstadoPilar estado) { this.estado = estado; }

    public String getRango() { return rango; }
    public void setRango(String rango) { this.rango = rango; }

    public String getArmaPrincipal() { return armaPrincipal; }
    public void setArmaPrincipal(String armaPrincipal) { this.armaPrincipal = armaPrincipal; }
}
