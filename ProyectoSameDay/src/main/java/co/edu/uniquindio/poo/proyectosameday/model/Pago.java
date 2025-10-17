package co.edu.uniquindio.poo.proyectosameday.model;

import java.time.LocalDate;

public class Pago {
    private String idPago;
    private double monto;
    private LocalDate fecha;
    private MetodoPago metodoPago;
    private EstadoPago estado;

    public Pago() {}

    public Pago(String idPago, double monto, LocalDate fecha, MetodoPago metodoPago, EstadoPago estado) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.estado = estado;
    }

    public EstadoPago getEstado() {
        return estado;
    }

    public void setEstado(EstadoPago estado) {
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

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}