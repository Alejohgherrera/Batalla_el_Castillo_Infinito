/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.application.exceptions;

/**
 *
 * @author ad
 */
public class AuthenticationException extends BusinessException {

    public AuthenticationException(String message) {
        super("Error de autenticación: " + message);
    }
}
