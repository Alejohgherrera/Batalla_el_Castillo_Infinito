/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.rest.controllers;

import app.adapter.rest.mapper.MensajeTacticoRestMapper;
import app.adapter.rest.request.MensajeReconstruidoRequest;
import app.adapter.rest.request.MensajeTacticoRequest;
import app.adapter.rest.response.MensajeTacticoResponse;
import app.domain.MensajeTactico;
import app.domain.services.MensajeTacticoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ad
 */
@RestController
@RequestMapping("/api/mensajes")
public class MensajeTacticoController {

    private final MensajeTacticoService mensajeService;

    public MensajeTacticoController(MensajeTacticoService mensajeService) {
        this.mensajeService = mensajeService;
    }

    @PostMapping
    public ResponseEntity<MensajeTacticoResponse> registrar(@RequestBody MensajeTacticoRequest request) {
        MensajeTactico guardado = mensajeService.guardarMensaje(request);
        return ResponseEntity.status(201)
                .body(MensajeTacticoRestMapper.toResponse(guardado));
    }

    @PutMapping("/{id}/reconstruir")
    public ResponseEntity<MensajeTacticoResponse> reconstruir(
            @PathVariable Long id,
            @RequestBody MensajeReconstruidoRequest request
    ) {
        MensajeTactico reconstruido = mensajeService.reconstruirMensaje(id, request);
        return ResponseEntity.ok(MensajeTacticoRestMapper.toResponse(reconstruido));
    }
}