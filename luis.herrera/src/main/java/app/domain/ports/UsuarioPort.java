/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.ports;

import app.domain.model.auth.Usuario;
import java.util.Optional;

/**
 *
 * @author ad
 */
public interface UsuarioPort {

    /**
     * Busca un usuario por su username.
     * @param username Nombre de usuario
     * @return Usuario si existe, vacío si no
     */
    Optional<Usuario> buscarPorUsername(String username);

    /**
     * Guarda un usuario en la base de datos.
     * @param usuario Usuario a guardar
     * @return Usuario guardado con ID asignado
     */
    Usuario guardar(Usuario usuario);
}