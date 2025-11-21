/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.application.usecases;

import app.domain.Pilar;
import app.domain.ports.PilarPort;
import org.springframework.stereotype.Service;

/**
 *
 * @author ad
 */
@Service
public class ObtenerPilarPorIdUseCase {

    private final PilarPort pilarPort;

    public ObtenerPilarPorIdUseCase(PilarPort pilarPort) {
        this.pilarPort = pilarPort;
    }

    public Pilar ejecutar(Long id) {
        Pilar pilar = pilarPort.obtenerPorId(id);
        if (pilar == null) {
            throw new RuntimeException("Pilar no encontrado con ID: " + id);
        }
        return pilar;
    }
}