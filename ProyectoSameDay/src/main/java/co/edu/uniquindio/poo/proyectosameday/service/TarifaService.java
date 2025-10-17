package co.edu.uniquindio.poo.proyectosameday.service;

import co.edu.uniquindio.poo.proyectosameday.model.Envio;
import co.edu.uniquindio.poo.proyectosameday.service.CalculadoraTarifaStrategy;

public class TarifaService {
    private CalculadoraTarifaStrategy estrategia;

    public TarifaService(CalculadoraTarifaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(CalculadoraTarifaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularCostoEnvio(Envio envio) {
        return estrategia.calcularTarifa(envio);
    }
}