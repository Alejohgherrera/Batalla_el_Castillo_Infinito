/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.domain.model.auth.Usuario;
import app.domain.ports.UsuarioPort;
import app.infrastructure.security.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author ad
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsuarioPort usuarioPort;

    public UserDetailsServiceImpl(UsuarioPort usuarioPort) {
        this.usuarioPort = usuarioPort;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioPort.buscarPorUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));
        return new UserDetailsImpl(usuario);
    }
}