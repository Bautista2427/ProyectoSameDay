package co.edu.uniquindio.poo.proyectosameday.mapping.dto;

import java.time.LocalDate;

public class PagoDTO {
    private String idPago;
    private double monto;
    private LocalDate fecha;
    private String metodo;
    private String estado;

    public PagoDTO() {}

    public PagoDTO(String idPago, double monto, LocalDate fecha, String metodo, String estado) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.metodo = metodo;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
