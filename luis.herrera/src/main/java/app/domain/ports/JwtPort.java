/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.ports;

/**
 *
 * @author ad
 */
public interface JwtPort {

    /**
     * Genera un token JWT para el username dado.
     * @param username Nombre de usuario
     * @return token JWT
     */
    String generarToken(String username);

    /**
     * Valida un token JWT.
     * @param token Token JWT a validar
     * @return true si es válido, false si no
     */
    boolean validarToken(String token);

    /**
     * Extrae el username de un token JWT válido.
     * @param token Token JWT
     * @return Username
     */
    String getUsernameFromToken(String token);
}