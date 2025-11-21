/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain;

import app.domain.model.enums.EstadoMensaje;
import jakarta.persistence.*;
import java.time.LocalDateTime;
/**
 *
 * @author ad
 */

@Entity
@Table(name = "mensajes_tacticos")
public class MensajeTactico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pilarId;

    private String contenidoFragmentado;

    private String contenidoReconstruido;

    @Enumerated(EnumType.STRING)
    private EstadoMensaje estado;

    private LocalDateTime timestamp;

    public MensajeTactico() {
        this.timestamp = LocalDateTime.now();
        this.estado = EstadoMensaje.FRAGMENTADO;
    }

    public MensajeTactico(Long pilarId, String contenidoFragmentado) {
        this.pilarId = pilarId;
        this.contenidoFragmentado = contenidoFragmentado;
        this.timestamp = LocalDateTime.now();
        this.estado = EstadoMensaje.FRAGMENTADO;
    }

    public MensajeTactico(Long id, Long pilarId, String contenidoFragmentado, String contenidoReconstruido, LocalDateTime timestamp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    public Long getId() { return id; }

    public Long getPilarId() { return pilarId; }
    public void setPilarId(Long pilarId) { this.pilarId = pilarId; }

    public String getContenidoFragmentado() { return contenidoFragmentado; }
    public void setContenidoFragmentado(String contenidoFragmentado) { this.contenidoFragmentado = contenidoFragmentado; }

    public String getContenidoReconstruido() { return contenidoReconstruido; }
    public void setContenidoReconstruido(String contenidoReconstruido) {
        this.contenidoReconstruido = contenidoReconstruido;
        this.estado = EstadoMensaje.RECONSTRUIDO; // Se actualiza automáticamente
    }

    public EstadoMensaje getEstado() { return estado; }
    public void setEstado(EstadoMensaje estado) { this.estado = estado; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}

