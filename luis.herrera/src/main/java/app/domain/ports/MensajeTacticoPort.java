/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.ports;

import app.domain.MensajeTactico;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ad
 */
public interface MensajeTacticoPort {

    MensajeTactico save(MensajeTactico mensaje);

    Optional<MensajeTactico> findById(Long id);

    List<MensajeTactico> findAll();

    public MensajeTactico obtenerPorId(Long id);

    public MensajeTactico guardar(MensajeTactico mensaje);
}
