/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.rest.mapper;

import app.adapter.rest.response.AuthLoginResponse;
import app.adapter.rest.response.AuthRegisterResponse;
import app.domain.model.auth.TokenInfo;
import app.domain.model.auth.Usuario;

/**
 *
 * @author ad
 */
public class AuthRestMapper {

    public static AuthLoginResponse toLoginResponse(TokenInfo token) {
        return new AuthLoginResponse(token.getToken(), token.getUsername());
    }

    public static AuthRegisterResponse toRegisterResponse(Usuario usuario) {
        return new AuthRegisterResponse("Usuario registrado: " + usuario.getUsername());
    }
}