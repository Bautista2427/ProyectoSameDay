package co.edu.uniquindio.poo.proyectosameday.mapping.mapper;

import co.edu.uniquindio.poo.proyectosameday.mapping.dto.RepartidorDTO;
import co.edu.uniquindio.poo.proyectosameday.model.Repartidor;

public class RepartidorMapper {
    public static RepartidorDTO toDTO(Repartidor r) {
        if (r == null) return null;
        return new RepartidorDTO(
                r.getIdRepartidor(),
                r.getNombre(),
                r.getTelefono(),
                r.getZonaCobertura(),
                r.getDisponibilidad() != null ? r.getDisponibilidad().name() : "N/A"
        );
    }

    public static Repartidor toEntity(RepartidorDTO dto) {
        if (dto == null) return null;

        Repartidor r = new Repartidor();
        r.setIdRepartidor(dto.getIdRepartidor());
        r.setNombre(dto.getNombre());
        r.setTelefono(dto.getTelefono());
        r.setZonaCobertura(dto.getZonaCobertura());
        return r;
    }
}
