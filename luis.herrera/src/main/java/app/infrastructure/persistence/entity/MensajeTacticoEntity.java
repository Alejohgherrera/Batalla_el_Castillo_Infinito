/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.infrastructure.persistence.entity;

import app.domain.MensajeTactico;
import app.domain.model.enums.EstadoMensaje;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author ad
 */
@Entity
@Table(name = "mensajes_tacticos")
public class MensajeTacticoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pilarId;

    @Column(length = 500)
    private String contenidoFragmentado;

    @Column(length = 500)
    private String contenidoReconstruido;

    private LocalDateTime timestamp;

    
    public MensajeTacticoEntity() {}

 
    public MensajeTacticoEntity(Long id, Long pilarId, String contenidoFragmentado,
                                String contenidoReconstruido, LocalDateTime timestamp) {
        this.id = id;
        this.pilarId = pilarId;
        this.contenidoFragmentado = contenidoFragmentado;
        this.contenidoReconstruido = contenidoReconstruido;
        this.timestamp = timestamp;
    }

    
    public static MensajeTacticoEntity fromDomain(MensajeTactico m) {
        return new MensajeTacticoEntity(
                m.getId(),
                m.getPilarId(),
                m.getContenidoFragmentado(),
                m.getContenidoReconstruido(),
                m.getTimestamp()
        );
    }

    
    public MensajeTactico toDomain() {
        return new MensajeTactico(
                this.id,
                this.pilarId,
                this.contenidoFragmentado,
                this.contenidoReconstruido,
                this.timestamp
        );
    }

    
    public Long getId() { return id; }
    public Long getPilarId() { return pilarId; }
    public String getContenidoFragmentado() { return contenidoFragmentado; }
    public String getContenidoReconstruido() { return contenidoReconstruido; }
    public LocalDateTime getTimestamp() { return timestamp; }

    public void setId(Long id) { this.id = id; }
    public void setPilarId(Long pilarId) { this.pilarId = pilarId; }
    public void setContenidoFragmentado(String contenidoFragmentado) { this.contenidoFragmentado = contenidoFragmentado; }
    public void setContenidoReconstruido(String contenidoReconstruido) { this.contenidoReconstruido = contenidoReconstruido; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public void setEstado(EstadoMensaje estadoMensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public LocalDateTime getEstado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}