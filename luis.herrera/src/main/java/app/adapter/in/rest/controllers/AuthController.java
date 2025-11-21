/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.rest.controllers;

import app.adapter.rest.mapper.AuthRestMapper;
import app.adapter.rest.request.LoginRequest;
import app.adapter.rest.request.RegisterRequest;
import app.adapter.rest.response.AuthLoginResponse;
import app.adapter.rest.response.AuthRegisterResponse;
import app.domain.model.auth.TokenInfo;
import app.domain.model.auth.Usuario;
import app.domain.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ad
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthLoginResponse> login(@RequestBody LoginRequest request) {
        TokenInfo token = authService.login(request);
        return ResponseEntity.ok(AuthRestMapper.toLoginResponse(token));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthRegisterResponse> register(@RequestBody RegisterRequest request) {
        Usuario usuario = authService.register(request);
        return ResponseEntity.status(201)
                .body(AuthRestMapper.toRegisterResponse(usuario));
    }
}
