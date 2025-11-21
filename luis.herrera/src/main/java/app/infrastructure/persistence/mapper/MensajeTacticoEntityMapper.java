/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.infrastructure.persistence.mapper;

import app.domain.MensajeTactico;
import app.infrastructure.persistence.entity.MensajeTacticoEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author ad
 */
@Component
public class MensajeTacticoEntityMapper {

    /**
     * Convierte de entidad a modelo de dominio
     */
    public MensajeTactico toDomain(MensajeTacticoEntity entity) {
        if (entity == null) return null;

        return new MensajeTactico(
                entity.getId(),
                entity.getPilarId(),
                entity.getContenidoFragmentado(),
                entity.getContenidoReconstruido(),
                entity.getTimestamp()
        );
    }

    /**
     * Convierte de modelo de dominio a entidad
     */
    public MensajeTacticoEntity toEntity(MensajeTactico domain) {
        if (domain == null) return null;

        MensajeTacticoEntity entity = new MensajeTacticoEntity();
        entity.setId(domain.getId());
        entity.setPilarId(domain.getPilarId());
        entity.setContenidoFragmentado(domain.getContenidoFragmentado());
        entity.setContenidoReconstruido(domain.getContenidoReconstruido());
        entity.setTimestamp(domain.getTimestamp());
        return entity;
    }
}