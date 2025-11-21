/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.infrastructure.persistence.entity;

import app.domain.Pilar;
import app.domain.model.enums.EstadoPilar;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author ad
 */
@Entity
@Table(name = "pilares")
public class PilarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private int posX;
    private int posY;

    @Enumerated(EnumType.STRING)
    private EstadoPilar estado;

   
    public PilarEntity() {}

   
    public PilarEntity(Long id, String nombre, int posX, int posY, EstadoPilar estado) {
        this.id = id;
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
        this.estado = estado;
    }

   
    public static PilarEntity fromDomain(Pilar p) {
        return new PilarEntity(
                p.getId(),
                p.getNombre(),
                p.getPosX(),
                p.getPosY(),
                p.getEstado()
        );
    }

   
    public Pilar toDomain() {
        return new Pilar(
                this.id,
                this.nombre,
                this.posX,
                this.posY,
                this.estado
        );
    }

   
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public int getPosX() { return posX; }
    public int getPosY() { return posY; }
    public EstadoPilar getEstado() { return estado; }

    public void setId(Long id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPosX(int posX) { this.posX = posX; }
    public void setPosY(int posY) { this.posY = posY; }
    public void setEstado(EstadoPilar estado) { this.estado = estado; }
}
