/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.application.exceptions;

/**
 *
 * @author ad
 */
public class MensajeInvalidoException extends BusinessException {

    public MensajeInvalidoException(String detalle) {
        super("El mensaje táctico es inválido: " + detalle);
    }
}