/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.infrastructure.persistence.repository;

import app.domain.MensajeTactico;
import app.domain.ports.MensajeTacticoPort;
import app.infrastructure.persistence.entity.MensajeTacticoEntity;
import app.infrastructure.persistence.mapper.MensajeTacticoMapper;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 *
 * @author ad
 */
@Component
public class MensajeTacticoRepositoryAdapter implements MensajeTacticoPort {

    private final MensajeTacticoRepository repository;
    private final MensajeTacticoMapper mapper;

    public MensajeTacticoRepositoryAdapter(MensajeTacticoRepository repository, MensajeTacticoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public MensajeTactico guardar(MensajeTactico mensaje) {
        MensajeTacticoEntity entity = mapper.toEntity(mensaje);
        MensajeTacticoEntity saved = repository.save(entity);
        return mapper.toDomain(saved);
    }

    public List<MensajeTactico> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public MensajeTactico obtenerPorId(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }

    @Override
    public MensajeTactico save(MensajeTactico mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<MensajeTactico> findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MensajeTactico> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}