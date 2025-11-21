/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.validators;

import app.adapter.rest.request.LoginRequest;
import app.adapter.rest.request.RegisterRequest;
import app.application.exceptions.BusinessException;

/**
 *
 * @author ad
 */
public class AuthValidator {

    public static void validarLogin(LoginRequest request) {
        if (request.getUsername() == null || request.getUsername().isEmpty()) {
            throw new BusinessException("El username es obligatorio.");
        }
        if (request.getPassword() == null || request.getPassword().isEmpty()) {
            throw new BusinessException("El password es obligatorio.");
        }
    }

    public static void validarRegister(RegisterRequest request) {
        validarLogin(new LoginRequest(){{
            setUsername(request.getUsername());
            setPassword(request.getPassword());
        }});
        if (request.getRole() == null || request.getRole().isEmpty()) {
            throw new BusinessException("El rol es obligatorio.");
        }
    }
}
