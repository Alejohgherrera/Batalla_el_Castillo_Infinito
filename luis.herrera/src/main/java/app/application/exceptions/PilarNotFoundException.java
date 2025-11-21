/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.application.exceptions;

/**
 *
 * @author ad
 */
public class PilarNotFoundException extends BusinessException {

    public PilarNotFoundException(Long id) {
        super("No se encontró el Pilar con ID: " + id);
    }
}
