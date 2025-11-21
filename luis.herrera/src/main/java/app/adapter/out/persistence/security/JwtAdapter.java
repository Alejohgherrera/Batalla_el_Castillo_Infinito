package app.adapter.out.persistence.security;

import app.infrastructure.security.JwtTokenUtil;
import org.springframework.stereotype.Component;

@Component
public class JwtAdapter {

    private final JwtTokenUtil jwtTokenUtil;

    public JwtAdapter(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    // 🔹 Generar token para un username
    public String generateToken(String username) {
        return jwtTokenUtil.generateJwtToken(username);
    }

    // 🔹 Obtener el username a partir del token
    public String getUsernameFromToken(String token) {
        return jwtTokenUtil.getUserNameFromJwtToken(token);
    }

    // 🔹 Validar token
    public boolean validateToken(String token) {
        return jwtTokenUtil.validateJwtToken(token);
    }
}
