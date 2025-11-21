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
public class PilarMapper {

    public PilarEntity toEntity(Pilar pilar) {
        PilarEntity entity = new PilarEntity();
        entity.setId(pilar.getId());
        entity.setNombre(pilar.getNombre());
        entity.setPosX(pilar.getPosX());
        entity.setPosY(pilar.getPosY());
        entity.setEstado(pilar.getEstado());
        return entity;
    }

    public Pilar toDomain(PilarEntity entity) {
        return new Pilar(
                entity.getId(),
                entity.getNombre(),
                entity.getPosX(),
                entity.getPosY(),
                entity.getEstado()
        );
    }
}
