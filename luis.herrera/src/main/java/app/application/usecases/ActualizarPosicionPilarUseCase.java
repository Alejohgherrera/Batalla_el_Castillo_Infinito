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
public class ActualizarPosicionPilarUseCase {

    private final PilarPort pilarPort;

    public ActualizarPosicionPilarUseCase(PilarPort pilarPort) {
        this.pilarPort = pilarPort;
    }

    public Pilar ejecutar(Pilar nuevaData) {

        Pilar existente = pilarPort.obtenerPorId(nuevaData.getId());
        if (existente == null) {
            throw new RuntimeException("No existe un Pilar con el ID " + nuevaData.getId());
        }

        existente.setPosX(nuevaData.getPosX());
        existente.setPosY(nuevaData.getPosY());
        existente.setEstado(nuevaData.getEstado());

        return pilarPort.guardar(existente);
    }
}
