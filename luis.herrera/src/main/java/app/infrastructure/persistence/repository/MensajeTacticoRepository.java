/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.infrastructure.persistence.repository;

import app.domain.MensajeTactico;
import app.infrastructure.persistence.entity.MensajeTacticoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ad
 */
public interface MensajeTacticoRepository extends JpaRepository<MensajeTacticoEntity, Long> {

    public MensajeTactico save(MensajeTactico mensaje);
}