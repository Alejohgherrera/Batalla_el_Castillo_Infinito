/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.validators;

import app.adapter.rest.request.ActualizarPosicionRequest;
import app.application.exceptions.BusinessException;

/**
 *
 * @author ad
 */
public class PilarValidator {

    public static void validarActualizarPosicion(ActualizarPosicionRequest request) {
        if (request.getPilarId() == null) {
            throw new BusinessException("El ID del Pilar es obligatorio.");
        }
        if (request.getEstado() == null || request.getEstado().isEmpty()) {
            throw new BusinessException("El estado del Pilar no puede estar vacío.");
        }
        // Ejemplo adicional: rango de coordenadas
        if (request.getPosX() < -1000 || request.getPosX() > 1000) {
            throw new BusinessException("posX fuera de rango permitido.");
        }
        if (request.getPosY() < -1000 || request.getPosY() > 1000) {
            throw new BusinessException("posY fuera de rango permitido.");
        }
    }
}