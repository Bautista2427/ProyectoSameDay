package co.edu.uniquindio.poo.proyectosameday.service;


import co.edu.uniquindio.poo.proyectosameday.model.Direccion;
import co.edu.uniquindio.poo.proyectosameday.model.MetodoPago;
import co.edu.uniquindio.poo.proyectosameday.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorCorreo(String correo) {
        return usuarios.stream()
                .filter(u -> u.getCorreo().equalsIgnoreCase(correo))
                .findFirst()
                .orElse(null);
    }

    public void actualizarPerfil(Usuario usuario, String nuevoNombre, String nuevoTelefono) {
        usuario.setNombreCompleto(nuevoNombre);
        usuario.setTelefono(nuevoTelefono);
    }

    public void agregarDireccion(Usuario usuario, Direccion direccion) {
        usuario.getDireccionesFrecuentes().add(direccion);
    }

    public void agregarMetodoPago(Usuario usuario, MetodoPago metodo) {
        usuario.getMetodosPago().add(metodo);
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}