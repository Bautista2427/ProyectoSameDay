package co.edu.uniquindio.poo.proyectosameday.model;

import java.util.List;

public class Repartidor {
    private String idRepartidor;
    private String nombre;
    private String documento;
    private String telefono;
    private EstadoDisponibilidad disponibilidad;
    private String zonaCobertura;
    private List<Envio> enviosAsignados;

    public Repartidor() {}

    public Repartidor(String idRepartidor, String nombre, String documento, String telefono, String zonaCobertura) {
        this.idRepartidor = idRepartidor;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.zonaCobertura = zonaCobertura;
    }

    public EstadoDisponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(EstadoDisponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Envio> getEnviosAsignados() {
        return enviosAsignados;
    }

    public void setEnviosAsignados(List<Envio> enviosAsignados) {
        this.enviosAsignados = enviosAsignados;
    }

    public String getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(String idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }
}