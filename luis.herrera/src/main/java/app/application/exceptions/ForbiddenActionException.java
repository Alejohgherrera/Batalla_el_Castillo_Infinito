/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.application.exceptions;

/**
 *
 * @author ad
 */
public class ForbiddenActionException extends BusinessException {

    public ForbiddenActionException(String message) {
        super("Acción no permitida: " + message);
    }
}