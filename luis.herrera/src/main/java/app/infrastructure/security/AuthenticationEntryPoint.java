/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.infrastructure.security;

import app.application.exceptions.AuthenticationException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 *
 * @author ad
 */
@Component
public class AuthenticationEntryPoint extends AuthEntryPointJwt implements  Serializable {

    private static final long serialVersionUID = 1L;

    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException {

        
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, 
                           "Error: No autorizado - " + authException.getMessage());
    }
}