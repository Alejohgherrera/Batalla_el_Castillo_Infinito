/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.out.persistence;

import app.domain.Pilar;
import app.domain.ports.PilarPort;
import app.infrastructure.persistence.mapper.PilarEntityMapper;
import app.infrastructure.persistence.repository.PilarRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

/**
 *
 * @author ad
 */
@Component
public class PilarRepositoryAdapter implements PilarPort {

    private final PilarRepository repository;
    private final PilarEntityMapper mapper;

    public PilarRepositoryAdapter(PilarRepository repository, PilarEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Pilar guardar(Pilar pilar) {
        return mapper.toDomain(repository.save(mapper.toEntity(pilar)));
    }

    public Optional<Pilar> buscarPorId(Long id) {
        return repository.findById(id).map(mapper::toDomain);
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

    @Override
    public Pilar obtenerPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pilar> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
