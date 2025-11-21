/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.infrastructure.persistence.mapper;

import app.domain.Pilar;
import app.infrastructure.persistence.entity.PilarEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author ad
 */
@Component
public class PilarEntityMapper {

    /**
     * Convierte de entidad a modelo de dominio
     */
    public Pilar toDomain(PilarEntity entity) {
        if (entity == null) return null;

        return new Pilar(
                entity.getId(),
                entity.getNombre(),
                entity.getPosX(),
                entity.getPosY(),
                entity.getEstado()
        );
    }

    /**
     * Convierte de modelo de dominio a entidad
     */
    public PilarEntity toEntity(Pilar domain) {
        if (domain == null) return null;

        PilarEntity entity = new PilarEntity();
        entity.setId(domain.getId());
        entity.setNombre(domain.getNombre());
        entity.setPosX(domain.getPosX());
        entity.setPosY(domain.getPosY());
        entity.setEstado(domain.getEstado());
        return entity;
    }
}