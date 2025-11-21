package app.adapter.out.persistence;

import app.domain.model.auth.Usuario;
import app.domain.ports.UsuarioPort;
import app.infrastructure.persistence.repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioAdapter implements UsuarioPort {

    private final UsuarioRepository usuarioRepository;

    public UsuarioAdapter(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> buscarPorUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
