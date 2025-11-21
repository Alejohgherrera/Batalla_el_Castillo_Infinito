/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.adapter.rest.request.LoginRequest;
import app.adapter.rest.request.RegisterRequest;
import app.domain.model.auth.Credenciales;
import app.domain.model.auth.TokenInfo;
import app.domain.model.auth.Usuario;
import app.domain.ports.JwtPort;
import app.domain.ports.UsuarioPort;
import java.util.Optional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author ad
 */
@Service
public class AuthService {

    private final UsuarioPort usuarioPort;
    private final JwtPort jwtPort;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UsuarioPort usuarioPort, JwtPort jwtPort, PasswordEncoder passwordEncoder) {
        this.usuarioPort = usuarioPort;
        this.jwtPort = jwtPort;
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * Login de usuario: valida credenciales y genera JWT
     * @param credenciales
     * @return 
     */
    public Optional<TokenInfo> login(Credenciales credenciales) {
        Optional<Usuario> usuarioOpt = usuarioPort.buscarPorUsername(credenciales.getUsername());

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            if (passwordEncoder.matches(credenciales.getPassword(), usuario.getPassword())) {
                String token = jwtPort.generarToken(usuario.getUsername());
                return Optional.of(new TokenInfo(token));
            }
        }

        return Optional.empty(); // credenciales inválidas
    }

    /**
     * Registro de nuevo usuario
     * @param usuario
     * @return 
     */
    public Usuario registrarUsuario(Usuario usuario) {
        // Encriptar password antes de guardar
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return usuarioPort.guardar(usuario);
    }

    public TokenInfo login(LoginRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Usuario register(RegisterRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}