package co.edu.uniquindio.poo.proyectosameday.service;

import co.edu.uniquindio.poo.proyectosameday.model.Envio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReporteService {
    public void generarReporteCSV(List<Envio> envios, String rutaArchivo) {
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            writer.write("ID Envío,Usuario,Estado,Costo\n");
            for (Envio e : envios) {
                writer.write(String.format("%s,%s,%s,%.2f\n",
                        e.getIdEnvio(),
                        e.getUsuario().getNombreCompleto(),
                        e.getEstado(),
                        e.getCosto()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}