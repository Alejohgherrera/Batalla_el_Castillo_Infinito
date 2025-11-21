/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.rest.controllers;

import app.adapter.rest.response.TriangulacionResponse;
import app.domain.services.InteligenciaService;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ad
 */
@RestController
@RequestMapping("/api/inteligencia")
public class InteligenciaController {

    private final InteligenciaService inteligenciaService;

    public InteligenciaController(InteligenciaService inteligenciaService) {
        this.inteligenciaService = inteligenciaService;
    }

    @GetMapping("/triangulacion")
    public ResponseEntity<Map<String, Object>> obtenerTriangulacion() {
        return ResponseEntity.ok(inteligenciaService.calcularTriangulacion());
    }
}