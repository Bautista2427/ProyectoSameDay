package co.edu.uniquindio.poo.proyectosameday.service;

import co.edu.uniquindio.poo.proyectosameday.model.Envio;

public interface CalculadoraTarifaStrategy {
    double calcularTarifa(Envio envio);
}