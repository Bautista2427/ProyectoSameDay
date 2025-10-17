package co.edu.uniquindio.poo.proyectosameday.controller;

import co.edu.uniquindio.poo.proyectosameday.model.EstadoDisponibilidad;
import co.edu.uniquindio.poo.proyectosameday.model.Repartidor;
import co.edu.uniquindio.poo.proyectosameday.service.RepartidorService;

import java.util.List;

public class RepartidorController {
    private final RepartidorService repartidorService;

    public RepartidorController(RepartidorService repartidorService) {
        this.repartidorService = repartidorService;
    }

    public void registrarRepartidor(String id, String nombre, String doc, String telefono, String zona) {
        Repartidor r = new Repartidor(id, nombre, doc, telefono, zona);
        repartidorService.registrarRepartidor(r);
    }

    public void cambiarDisponibilidad(Repartidor r, EstadoDisponibilidad estado) {
        repartidorService.cambiarDisponibilidad(r, estado);
    }

    public List<Repartidor> listarRepartidores() {
        return repartidorService.listarRepartidores();
    }
}