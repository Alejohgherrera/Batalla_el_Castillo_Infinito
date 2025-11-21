package app.domain.services;

import app.domain.Pilar;
import app.infrastructure.persistence.entity.PilarEntity;
import app.infrastructure.persistence.repository.PilarRepository;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class InteligenciaService {

    private final PilarRepository pilarRepository;

    public InteligenciaService(PilarRepository pilarRepository) {
        this.pilarRepository = pilarRepository;
    }

    public Map<String, Object> calcularTriangulacion() {
        List<PilarEntity> pilaresEntity = pilarRepository.findAll();

        if (pilaresEntity.isEmpty()) {
            throw new RuntimeException("No hay datos suficientes para calcular triangulación.");
        }

        // Convertir entidades a dominio
        List<Pilar> pilares = pilaresEntity.stream()
                .map(e -> new Pilar(
                        e.getId(),
                        e.getNombre(),
                        e.getPosX(),
                        e.getPosY(),
                        e.getEstado()
                ))
                .collect(Collectors.toList());

        double promX = pilares.stream().mapToInt(Pilar::getPosX).average().orElse(0);
        double promY = pilares.stream().mapToInt(Pilar::getPosY).average().orElse(0);

        return Map.of(
                "posiblePosicionMuzan", Map.of("x", promX, "y", promY),
                "nivelConfianza", 0.78,
                "descripcion", "Probabilidad alta de presencia demoníaca en las coordenadas dadas."
        );
    }
}
