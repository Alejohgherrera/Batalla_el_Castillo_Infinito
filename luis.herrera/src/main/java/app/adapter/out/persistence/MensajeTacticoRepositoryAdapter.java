/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.out.persistence;

import app.domain.MensajeTactico;
import app.domain.ports.MensajeTacticoPort;
import app.infrastructure.persistence.mapper.MensajeTacticoEntityMapper;
import app.infrastructure.persistence.repository.MensajeTacticoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

/**
 *
 * @author ad
 */
@Component
public class MensajeTacticoRepositoryAdapter implements MensajeTacticoPort {

    private final MensajeTacticoRepository repository;
    private final MensajeTacticoEntityMapper mapper;

    public MensajeTacticoRepositoryAdapter(MensajeTacticoRepository repository,
                                           MensajeTacticoEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public MensajeTactico guardar(MensajeTactico mensaje) {
        return mapper.toDomain(repository.save(mapper.toEntity(mensaje)));
    }

    public Optional<MensajeTactico> buscarPorId(Long id) {
        return repository.findById(id).map(mapper::toDomain);
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

    @Override
    public MensajeTactico obtenerPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}