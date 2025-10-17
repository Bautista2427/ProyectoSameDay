package co.edu.uniquindio.poo.proyectosameday.mapping.dto;

import java.util.List;

public class UsuarioDTO {
    private String idUsuario;
    private String nombreCompleto;
    private String correo;
    private String telefono;
    private List<String> direcciones; // nombres o alias
    private List<String> metodosPago; // nombres o tipos de pago

    public UsuarioDTO() {}

    public UsuarioDTO(String idUsuario, String nombreCompleto, String correo, String telefono,
                      List<String> direcciones, List<String> metodosPago) {
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
        this.direcciones = direcciones;
        this.metodosPago = metodosPago;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<String> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<String> direcciones) {
        this.direcciones = direcciones;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<String> getMetodosPago() {
        return metodosPago;
    }

    public void setMetodosPago(List<String> metodosPago) {
        this.metodosPago = metodosPago;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
