/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.rest.mapper;

import app.adapter.rest.request.MensajeReconstruidoRequest;
import app.adapter.rest.request.MensajeTacticoRequest;
import app.adapter.rest.response.MensajeTacticoResponse;
import app.domain.MensajeTactico;

/**
 *
 * @author ad
 */
public class MensajeTacticoRestMapper {

    public static MensajeTacticoResponse toResponse(MensajeTactico mensaje) {
        return new MensajeTacticoResponse(
                mensaje.getId(),
                mensaje.getPilarId(),
                mensaje.getContenidoReconstruido() != null
                        ? mensaje.getContenidoReconstruido()
                        : mensaje.getContenidoFragmentado()
        );
    }

    public static MensajeTactico fromRequest(MensajeTacticoRequest request) {
        MensajeTactico m = new MensajeTactico();
        m.setPilarId(request.getPilarId());
        m.setContenidoFragmentado(request.getContenidoFragmentado());
        return m;
    }

    public static MensajeTactico aplicarReconstruccion(
            MensajeReconstruidoRequest request,
            MensajeTactico existente
    ) {
        existente.setContenidoReconstruido(request.getContenidoReconstruido());
        return existente;
    }
}
