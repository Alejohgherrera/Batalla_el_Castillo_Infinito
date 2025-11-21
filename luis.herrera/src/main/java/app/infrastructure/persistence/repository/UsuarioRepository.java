package app.infrastructure.persistence.repository;

import app.domain.model.auth.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de usuarios para acceder a la base de datos.
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    /**
     * Busca un usuario por su username.
     *
     * @param username nombre de usuario
     * @return Optional con el usuario si existe, vacío si no
     */
    Optional<Usuario> findByUsername(String username);
}
