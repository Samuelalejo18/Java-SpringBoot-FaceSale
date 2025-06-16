package FaceSale.demo.api.controllers;

import FaceSale.demo.api.entities.Usuario;
import FaceSale.demo.api.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/usuarios")
public class UsuarioController extends BaseController<Usuario, UsuarioService>{

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }
}
