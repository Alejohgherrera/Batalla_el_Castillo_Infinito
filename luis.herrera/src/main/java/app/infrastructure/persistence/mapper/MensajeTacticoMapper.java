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
public class MensajeTacticoMapper {

    public MensajeTacticoEntity toEntity(MensajeTactico mensaje) {
        MensajeTacticoEntity entity = new MensajeTacticoEntity();
        entity.setId(mensaje.getId());
        entity.setPilarId(mensaje.getPilarId());
        entity.setContenidoFragmentado(mensaje.getContenidoFragmentado());
        entity.setContenidoReconstruido(mensaje.getContenidoReconstruido());
        entity.setTimestamp(mensaje.getTimestamp());
        return entity;
    }

    public MensajeTactico toDomain(MensajeTacticoEntity entity) {
        return new MensajeTactico(
                entity.getId(),
                entity.getPilarId(),
                entity.getContenidoFragmentado(),
                entity.getContenidoReconstruido(),
                entity.getTimestamp()
        );
    }
}