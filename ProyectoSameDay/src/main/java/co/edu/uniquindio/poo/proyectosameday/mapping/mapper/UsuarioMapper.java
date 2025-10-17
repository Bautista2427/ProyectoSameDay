package co.edu.uniquindio.poo.proyectosameday.mapping.mapper;

import co.edu.uniquindio.poo.proyectosameday.mapping.dto.UsuarioDTO;
import co.edu.uniquindio.poo.proyectosameday.model.Usuario;
import co.edu.uniquindio.poo.proyectosameday.model.Direccion;
import co.edu.uniquindio.poo.proyectosameday.model.MetodoPago;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioMapper {
    public static UsuarioDTO toDTO(Usuario usuario) {
        if (usuario == null) return null;

        List<String> direcciones = usuario.getDireccionesFrecuentes() == null ? null :
                usuario.getDireccionesFrecuentes().stream()
                        .map(Direccion::getAlias)
                        .collect(Collectors.toList());

        List<String> metodos = usuario.getMetodosPago() == null ? null :
                usuario.getMetodosPago().stream()
                        .map(MetodoPago::getTipo)
                        .collect(Collectors.toList());

        return new UsuarioDTO(
                usuario.getIdUsuario(),
                usuario.getNombreCompleto(),
                usuario.getCorreo(),
                usuario.getTelefono(),
                direcciones,
                metodos
        );
    }

    public static Usuario toEntity(UsuarioDTO dto) {
        if (dto == null) return null;

        Usuario usuario = new Usuario();
        usuario.setIdUsuario(dto.getIdUsuario());
        usuario.setNombreCompleto(dto.getNombreCompleto());
        usuario.setCorreo(dto.getCorreo());
        usuario.setTelefono(dto.getTelefono());
        return usuario;
    }
}
