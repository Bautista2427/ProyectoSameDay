package co.edu.uniquindio.poo.proyectosameday.service;

import co.edu.uniquindio.poo.proyectosameday.model.Envio;
import co.edu.uniquindio.poo.proyectosameday.model.EstadoEnvio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EnvioService {
    private List<Envio> envios = new ArrayList<>();

    public void crearEnvio(Envio envio) {
        envio.setFechaCreacion(LocalDate.now());
        envio.setEstado(EstadoEnvio.SOLICITADO);
        envios.add(envio);
    }

    public void actualizarEstado(Envio envio, EstadoEnvio nuevoEstado) {
        envio.setEstado(nuevoEstado);
    }

    public void cancelarEnvio(Envio envio) {
        if (envio.getEstado() == EstadoEnvio.SOLICITADO) {
            envio.setEstado(EstadoEnvio.INCIDENCIA);
        }
    }

    public List<Envio> filtrarPorEstado(EstadoEnvio estado) {
        return envios.stream()
                .filter(e -> e.getEstado() == estado)
                .toList();
    }

    public List<Envio> filtrarPorFecha(LocalDate inicio, LocalDate fin) {
        return envios.stream()
                .filter(e -> !e.getFechaCreacion().isBefore(inicio) && !e.getFechaCreacion().isAfter(fin))
                .toList();
    }

    public List<Envio> listarEnvios() {
        return envios;
    }
}