package co.edu.uniquindio.poo.proyectosameday.model;

public class MetodoPago {
    private String idMetodo;
    private String tipo;
    private String numero;

    public MetodoPago() {}

    public MetodoPago(String idMetodo, String tipo, String numero) {
        this.idMetodo = idMetodo;
        this.tipo = tipo;
        this.numero = numero;
    }
}