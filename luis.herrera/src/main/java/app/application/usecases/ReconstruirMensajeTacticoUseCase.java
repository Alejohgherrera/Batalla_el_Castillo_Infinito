/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.application.usecases;

import app.domain.MensajeTactico;
import app.domain.ports.MensajeTacticoPort;
import org.springframework.stereotype.Service;

/**
 *
 * @author ad
 */
@Service
public class ReconstruirMensajeTacticoUseCase {

    private final MensajeTacticoPort mensajePort;

    public ReconstruirMensajeTacticoUseCase(MensajeTacticoPort mensajePort) {
        this.mensajePort = mensajePort;
    }

    public MensajeTactico ejecutar(Long id, String reconstruccion) {

        MensajeTactico mensaje = mensajePort.obtenerPorId(id);
        if (mensaje == null) {
            throw new RuntimeException("Mensaje táctico no encontrado con ID " + id);
        }

        mensaje.setContenidoReconstruido(reconstruccion);

        return mensajePort.guardar(mensaje);
    }
}