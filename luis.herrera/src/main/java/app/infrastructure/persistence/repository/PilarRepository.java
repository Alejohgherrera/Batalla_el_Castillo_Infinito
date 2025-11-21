/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.infrastructure.persistence.repository;

import app.domain.Pilar;
import app.infrastructure.persistence.entity.PilarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ad
 */
public interface PilarRepository extends JpaRepository<PilarEntity, Long> {

    public Pilar save(Pilar pilar);
}
