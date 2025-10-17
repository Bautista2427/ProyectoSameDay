package co.edu.uniquindio.poo.proyectosameday.model;

import java.time.LocalDate;

public class Incidencia {
    private String idIncidencia;
    private String descripcion;
    private LocalDate fecha;
    private TipoIncidencia tipo;
    private Envio envioRelacionado;

    public Incidencia() {}

    public Incidencia(String idIncidencia, String descripcion, LocalDate fecha, TipoIncidencia tipo, Envio envioRelacionado) {
        this.idIncidencia = idIncidencia;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.tipo = tipo;
        this.envioRelacionado = envioRelacionado;
    }
}