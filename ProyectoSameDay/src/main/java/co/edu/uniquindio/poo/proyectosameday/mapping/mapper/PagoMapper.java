package co.edu.uniquindio.poo.proyectosameday.mapping.mapper;

import co.edu.uniquindio.poo.proyectosameday.mapping.dto.PagoDTO;
import co.edu.uniquindio.poo.proyectosameday.model.Pago;

public class PagoMapper {
    public static PagoDTO toDTO(Pago p) {
        if (p == null) return null;
        return new PagoDTO(
                p.getIdPago(),
                p.getMonto(),
                p.getFecha(),
                p.getMetodoPago() != null ? p.getMetodoPago().getTipo() : "N/A",
                p.getEstado() != null ? p.getEstado().name() : "N/A"
        );
    }

    public static Pago toEntity(PagoDTO dto) {
        if (dto == null) return null;
        Pago p = new Pago();
        p.setIdPago(dto.getIdPago());
        p.setMonto(dto.getMonto());
        p.setFecha(dto.getFecha());
        return p;
    }
}
