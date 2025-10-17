package co.edu.uniquindio.poo.proyectosameday.service;

import co.edu.uniquindio.poo.proyectosameday.model.Pago;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PagoService {
    private List<Pago> pagos = new ArrayList<>();

    public void registrarPago(Pago pago) {
        pago.setFecha(LocalDate.now());
        pagos.add(pago);
    }

    public List<Pago> listarPagosPorFecha(LocalDate inicio, LocalDate fin) {
        return pagos.stream()
                .filter(p -> !p.getFecha().isBefore(inicio) && !p.getFecha().isAfter(fin))
                .toList();
    }

    public List<Pago> listarPagos() {
        return pagos;
    }
}