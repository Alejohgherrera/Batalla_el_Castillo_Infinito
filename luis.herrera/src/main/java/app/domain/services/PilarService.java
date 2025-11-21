/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.adapter.rest.request.ActualizarPosicionRequest;
import app.domain.Pilar;
import app.infrastructure.persistence.entity.PilarEntity;
import app.infrastructure.persistence.repository.PilarRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;



/**
 *
 * @author ad
 */

@Service
public class PilarService {

    private final PilarRepository pilarRepository;

    public PilarService(PilarRepository pilarRepository) {
        this.pilarRepository = pilarRepository;
    }

    public Optional<PilarEntity> obtenerPilarPorId(Long id) {
        return pilarRepository.findById(id);
    }

    public Pilar guardarPilar(Pilar pilar) {
        return pilarRepository.save(pilar);
    }

    public Pilar actualizarPilar(Pilar pilar) {
        return pilarRepository.save(pilar);
    }

    public Pilar obtenerPilar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    public Pilar actualizarPosicion(ActualizarPosicionRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}