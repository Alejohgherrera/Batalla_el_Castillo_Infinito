package app.adapter.in.rest.controllers;

import app.adapter.rest.mapper.PilarRestMapper;
import app.adapter.rest.request.ActualizarPosicionRequest;
import app.adapter.rest.response.PilarResponse;
import app.domain.Pilar;
import app.domain.services.PilarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pilares")
public class PilarController {

    private final PilarService pilarService;
    private final PilarRestMapper pilarRestMapper;

    public PilarController(PilarService pilarService, PilarRestMapper pilarRestMapper) {
        this.pilarService = pilarService;
        this.pilarRestMapper = pilarRestMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PilarResponse> obtenerPilar(@PathVariable Long id) {
        Pilar pilar = pilarService.obtenerPilar(id);
        return ResponseEntity.ok(pilarRestMapper.toResponse(pilar));
    }

    @PostMapping("/actualizar-posicion")
    public ResponseEntity<PilarResponse> actualizarPosicion(@RequestBody ActualizarPosicionRequest request) {
        Pilar actualizado = pilarService.actualizarPosicion(request);
        return ResponseEntity
                .status(201)
                .body(pilarRestMapper.toResponse(actualizado));
    }
}
