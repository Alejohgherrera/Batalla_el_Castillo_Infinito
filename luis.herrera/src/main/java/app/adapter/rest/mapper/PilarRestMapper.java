package app.adapter.rest.mapper;

import app.adapter.rest.request.ActualizarPosicionRequest;
import app.adapter.rest.response.PilarResponse;
import app.domain.Pilar;
import app.domain.model.enums.EstadoPilar;
import org.springframework.stereotype.Component;

@Component
public class PilarRestMapper {

    public PilarResponse toResponse(Pilar pilar) {
        if (pilar == null) {
            return null;
        }

        return new PilarResponse(
                pilar.getId(),
                pilar.getNombre(),
                null, // Rango no definido
                null, // ArmaPrincipal no definido
                pilar.getPosX(),
                pilar.getPosY(),
                pilar.getEstado() // Devuelve directamente el Enum
        );
    }

    public Pilar fromActualizarPosicionRequest(ActualizarPosicionRequest request, Pilar existente) {
        if (request == null || existente == null) {
            return existente;
        }

        existente.setPosX(request.getPosX());
        existente.setPosY(request.getPosY());

        if (request.getEstado() != null && !request.getEstado().isEmpty()) {
            existente.setEstado(EstadoPilar.valueOf(request.getEstado()));
        }

        return existente;
    }
}
