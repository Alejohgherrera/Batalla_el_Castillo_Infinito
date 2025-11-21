/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.validators;

import app.adapter.rest.request.MensajeReconstruidoRequest;
import app.adapter.rest.request.MensajeTacticoRequest;
import app.application.exceptions.BusinessException;

/**
 *
 * @author ad
 */
public class MensajeTacticoValidator {

    public static void validarNuevoMensaje(MensajeTacticoRequest request) {
        if (request.getPilarId() == null) {
            throw new BusinessException("El ID del Pilar es obligatorio para enviar un mensaje.");
        }
        if (request.getContenidoFragmentado() == null || request.getContenidoFragmentado().isEmpty()) {
            throw new BusinessException("El contenido fragmentado no puede estar vacío.");
        }
    }

    public static void validarReconstruccion(MensajeReconstruidoRequest request) {
        if (request.getContenidoReconstruido() == null || request.getContenidoReconstruido().isEmpty()) {
            throw new BusinessException("El contenido reconstruido no puede estar vacío.");
        }
    }
}