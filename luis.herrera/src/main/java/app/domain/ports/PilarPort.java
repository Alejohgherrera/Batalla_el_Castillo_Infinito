/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.ports;

import app.domain.Pilar;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ad
 */
public interface PilarPort {

    Optional<Pilar> findById(Long id);

    List<Pilar> findAll();

    Pilar save(Pilar pilar);

    public Pilar obtenerPorId(Long id);

    public Pilar guardar(Pilar existente);

    public List<Pilar> obtenerTodos();
}
