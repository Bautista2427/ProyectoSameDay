package co.edu.uniquindio.poo.proyectosameday.service;

import co.edu.uniquindio.poo.proyectosameday.model.Envio;

public class TarifaBasicaStrategy implements CalculadoraTarifaStrategy {
    @Override
    public double calcularTarifa(Envio envio) {
        double base = 5000;
        double costoPeso = envio.getPeso() * 200;
        double costoVolumen = envio.getVolumen() * 100;
        return base + costoPeso + costoVolumen;
    }
}