package co.edu.uniquindio.poo.proyectosameday.controller;

import co.edu.uniquindio.poo.proyectosameday.model.Direccion;
import co.edu.uniquindio.poo.proyectosameday.model.MetodoPago;
import co.edu.uniquindio.poo.proyectosameday.model.Usuario;
import co.edu.uniquindio.poo.proyectosameday.service.UsuarioService;

import java.util.List;

public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void registrarUsuario(String id, String nombre, String correo, String telefono) {
        Usuario usuario = new Usuario(id, nombre, correo, telefono);
        usuarioService.registrarUsuario(usuario);
    }

    public Usuario iniciarSesion(String correo) {
        return usuarioService.buscarUsuarioPorCorreo(correo);
    }

    public void agregarDireccion(Usuario usuario, Direccion direccion) {
        usuarioService.agregarDireccion(usuario, direccion);
    }

    public void agregarMetodoPago(Usuario usuario, MetodoPago metodo) {
        usuarioService.agregarMetodoPago(usuario, metodo);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }
}