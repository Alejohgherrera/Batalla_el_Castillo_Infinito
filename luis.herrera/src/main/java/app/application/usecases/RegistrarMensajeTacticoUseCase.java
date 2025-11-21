/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.application.usecases;

import app.domain.MensajeTactico;
import app.domain.ports.MensajeTacticoPort;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 *
 * @author ad
 */
@Service
public class RegistrarMensajeTacticoUseCase {

    private final MensajeTacticoPort mensajePort;

    public RegistrarMensajeTacticoUseCase(MensajeTacticoPort mensajePort) {
        this.mensajePort = mensajePort;
    }

    public MensajeTactico ejecutar(MensajeTactico mensaje) {
        mensaje.setTimestamp(LocalDateTime.now());
        return mensajePort.guardar(mensaje);
    }
}

