package co.edu.uniquindio.poo.proyectosameday.service;

import co.edu.uniquindio.poo.proyectosameday.model.Incidencia;

import java.util.ArrayList;
import java.util.List;

public class IncidenciaService {
    private List<Incidencia> incidencias = new ArrayList<>();

    public void registrarIncidencia(Incidencia incidencia) {
        incidencias.add(incidencia);
    }

    public List<Incidencia> listarIncidencias() {
        return incidencias;
    }
}