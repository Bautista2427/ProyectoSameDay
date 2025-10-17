package co.edu.uniquindio.poo.proyectosameday.controller;

import co.edu.uniquindio.poo.proyectosameday.model.Envio;
import co.edu.uniquindio.poo.proyectosameday.model.EstadoEnvio;
import co.edu.uniquindio.poo.proyectosameday.service.EnvioService;
import co.edu.uniquindio.poo.proyectosameday.service.TarifaService;

import java.time.LocalDate;
import java.util.List;

public class EnvioController {
    private final EnvioService envioService;
    private final TarifaService tarifaService;

    public EnvioController(EnvioService envioService, TarifaService tarifaService) {
        this.envioService = envioService;
        this.tarifaService = tarifaService;
    }

    public void crearEnvio(Envio envio) {
        double costo = tarifaService.calcularCostoEnvio(envio);
        envio.setCosto(costo);
        envioService.crearEnvio(envio);
    }

    public void actualizarEstado(Envio envio, EstadoEnvio nuevoEstado) {
        envioService.actualizarEstado(envio, nuevoEstado);
    }

    public List<Envio> listarEnvios() {
        return envioService.listarEnvios();
    }

    public List<Envio> filtrarPorEstado(EstadoEnvio estado) {
        return envioService.filtrarPorEstado(estado);
    }

    public List<Envio> filtrarPorFecha(LocalDate inicio, LocalDate fin) {
        return envioService.filtrarPorFecha(inicio, fin);
    }
}