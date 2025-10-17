package co.edu.uniquindio.poo.proyectosameday.mapping.dto;

import java.time.LocalDate;
import java.util.List;

public class EnvioDTO {
    private String idEnvio;
    private String usuarioNombre;
    private String repartidorNombre;
    private String estado;
    private String origen;
    private String destino;
    private double costo;
    private LocalDate fechaCreacion;
    private List<String> serviciosAdicionales;

    public EnvioDTO() {}

    public EnvioDTO(String idEnvio, String usuarioNombre, String repartidorNombre, String estado,
                    String origen, String destino, double costo, LocalDate fechaCreacion, List<String> serviciosAdicionales) {
        this.idEnvio = idEnvio;
        this.usuarioNombre = usuarioNombre;
        this.repartidorNombre = repartidorNombre;
        this.estado = estado;
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaCreacion = fechaCreacion;
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getRepartidorNombre() {
        return repartidorNombre;
    }

    public void setRepartidorNombre(String repartidorNombre) {
        this.repartidorNombre = repartidorNombre;
    }

    public List<String> getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(List<String> serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }
}
