package co.edu.uniquindio.poo.proyectosameday.service;

import co.edu.uniquindio.poo.proyectosameday.model.EstadoDisponibilidad;
import co.edu.uniquindio.poo.proyectosameday.model.Repartidor;

import java.util.ArrayList;
import java.util.List;

public class RepartidorService {
    private List<Repartidor> repartidores = new ArrayList<>();

    public void registrarRepartidor(Repartidor r) {
        repartidores.add(r);
    }

    public void cambiarDisponibilidad(Repartidor r, EstadoDisponibilidad estado) {
        r.setDisponibilidad(estado);
    }

    public List<Repartidor> listarRepartidores() {
        return repartidores;
    }

    public Repartidor buscarPorId(String id) {
        return repartidores.stream()
                .filter(rep -> rep.getIdRepartidor().equals(id))
                .findFirst()
                .orElse(null);
    }
}