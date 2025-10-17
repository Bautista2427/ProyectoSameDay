package co.edu.uniquindio.poo.proyectosameday.model;

public class Tarifa {
    private double costoBase;
    private double costoPorKm;
    private double costoPorKg;
    private double recargoPrioridad;

    public Tarifa() {}

    public Tarifa(double costoBase, double costoPorKm, double costoPorKg, double recargoPrioridad) {
        this.costoBase = costoBase;
        this.costoPorKm = costoPorKm;
        this.costoPorKg = costoPorKg;
        this.recargoPrioridad = recargoPrioridad;
    }
}