package app.domain.services;

import app.adapter.rest.request.MensajeReconstruidoRequest;
import app.adapter.rest.request.MensajeTacticoRequest;
import app.domain.MensajeTactico;
import app.domain.model.enums.EstadoMensaje;
import app.infrastructure.persistence.repository.MensajeTacticoRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class MensajeTacticoService {

    private final MensajeTacticoRepository mensajeRepository;

    public MensajeTacticoService(MensajeTacticoRepository mensajeRepository) {
        this.mensajeRepository = mensajeRepository;
    }

    public MensajeTactico registrarMensaje(MensajeTactico mensaje) {
        return mensajeRepository.save(mensaje);
    }

    public Optional<MensajeTactico> obtenerPorId(Long id) {
        return mensajeRepository.findById(id)
                .map(entity -> entity.toDomain()); // convierte entity a domain
    }

    public MensajeTactico reconstruirMensaje(Long id, String contenidoReconstruido) {
        MensajeTactico mensaje = obtenerPorId(id)
                .orElseThrow(() -> new RuntimeException("Mensaje no encontrado."));

        mensaje.setContenidoReconstruido(contenidoReconstruido);
        mensaje.setEstado(EstadoMensaje.RECONSTRUIDO);

        return registrarMensaje(mensaje);
    }

    public MensajeTactico guardarMensaje(MensajeTacticoRequest request) {
        MensajeTactico mensaje = new MensajeTactico();
        mensaje.setPilarId(request.getPilarId());
        mensaje.setContenidoFragmentado(request.getContenidoFragmentado());
        mensaje.setEstado(EstadoMensaje.PENDIENTE);
        return registrarMensaje(mensaje);
    }

    public MensajeTactico reconstruirMensaje(Long id, MensajeReconstruidoRequest request) {
        return reconstruirMensaje(id, request.getContenidoReconstruido());
    }
}
