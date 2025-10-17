package co.edu.uniquindio.poo.proyectosameday.mapping.dto;

public class RepartidorDTO {
    private String idRepartidor;
    private String nombre;
    private String telefono;
    private String zonaCobertura;
    private String disponibilidad;

    public RepartidorDTO() {}

    public RepartidorDTO(String idRepartidor, String nombre, String telefono, String zonaCobertura, String disponibilidad) {
        this.idRepartidor = idRepartidor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.zonaCobertura = zonaCobertura;
        this.disponibilidad = disponibilidad;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
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
