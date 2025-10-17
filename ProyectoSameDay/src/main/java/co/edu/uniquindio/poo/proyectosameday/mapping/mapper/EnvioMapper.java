package co.edu.uniquindio.poo.proyectosameday.mapping.mapper;

import co.edu.uniquindio.poo.proyectosameday.mapping.dto.EnvioDTO;
import co.edu.uniquindio.poo.proyectosameday.model.Envio;
import co.edu.uniquindio.poo.proyectosameday.model.ServicioAdicional;


import java.util.List;
import java.util.stream.Collectors;

public class EnvioMapper {
    public static EnvioDTO toDTO(Envio e) {
        if (e == null) return null;

        List<String> servicios = e.getServiciosAdicionales() == null ? null :
                e.getServiciosAdicionales().stream()
                        .map(ServicioAdicional::getNombre)
                        .collect(Collectors.toList());

        return new EnvioDTO(
                e.getIdEnvio(),
                e.getUsuario() != null ? e.getUsuario().getNombreCompleto() : "N/A",
                e.getRepartidor() != null ? e.getRepartidor().getNombre() : "Sin asignar",
                e.getEstado() != null ? e.getEstado().name() : "N/A",
                e.getOrigen() != null ? e.getOrigen().getAlias() : "N/A",
                e.getDestino() != null ? e.getDestino().getAlias() : "N/A",
                e.getCosto(),
                e.getFechaCreacion(),
                servicios
        );
    }

    public static Envio toEntity(EnvioDTO dto) {
        if (dto == null) return null;
        Envio e = new Envio();
        e.setIdEnvio(dto.getIdEnvio());
        e.setCosto(dto.getCosto());
        e.setFechaCreacion(dto.getFechaCreacion());
        return e;
    }
}
