package co.edu.uniquindio.poo.proyectosameday.controller;

import co.edu.uniquindio.poo.proyectosameday.model.Envio;
import co.edu.uniquindio.poo.proyectosameday.service.ReporteService;

import java.util.List;

public class ReporteController {
    private final ReporteService reporteService;

    public ReporteController(ReporteService reporteService) {
        this.reporteService = reporteService;
    }

    public void generarReporteCSV(List<Envio> envios, String ruta) {
        reporteService.generarReporteCSV(envios, ruta);
    }
}