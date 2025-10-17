package co.edu.uniquindio.poo.proyectosameday.controller;

import co.edu.uniquindio.poo.proyectosameday.model.Pago;
import co.edu.uniquindio.poo.proyectosameday.service.PagoService;

import java.time.LocalDate;
import java.util.List;

public class PagoController {
    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    public void registrarPago(Pago pago) {
        pagoService.registrarPago(pago);
    }

    public List<Pago> listarPagosPorFecha(LocalDate inicio, LocalDate fin) {
        return pagoService.listarPagosPorFecha(inicio, fin);
    }
}