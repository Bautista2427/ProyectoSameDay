package co.edu.uniquindio.poo.proyectosameday.model;

public class Direccion {
    private String idDireccion;
    private String alias;
    private String calle;
    private String ciudad;
    private double latitud;
    private double longitud;

    public Direccion() {}

    public Direccion(String idDireccion, String alias, String calle, String ciudad, double latitud, double longitud) {
        this.idDireccion = idDireccion;
        this.alias = alias;
        this.calle = calle;
        this.ciudad = ciudad;
        this.latitud = latitud;
        this.longitud = longitud;
    }
}