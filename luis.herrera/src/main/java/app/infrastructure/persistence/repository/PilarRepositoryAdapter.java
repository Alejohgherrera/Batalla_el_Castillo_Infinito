/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.infrastructure.persistence.repository;

import app.domain.Pilar;
import app.domain.ports.PilarPort;
import app.infrastructure.persistence.entity.PilarEntity;
import app.infrastructure.persistence.mapper.PilarMapper;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 *
 * @author ad
 */
@Component
public class PilarRepositoryAdapter implements PilarPort {

    private final PilarRepository repository;
    private final PilarMapper mapper;

    public PilarRepositoryAdapter(PilarRepository repository, PilarMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Pilar guardar(Pilar pilar) {
        PilarEntity entity = mapper.toEntity(pilar);
        PilarEntity saved = repository.save(entity);
        return mapper.toDomain(saved);
    }

    @Override
    public List<Pilar> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Pilar obtenerPorId(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }

    @Override
    public Optional<Pilar> findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pilar> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pilar save(Pilar pilar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}