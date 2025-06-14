package FaceSale.demo.api.services;

import FaceSale.demo.api.entities.Usuario;
import FaceSale.demo.api.repositories.BaseRepository;
import FaceSale.demo.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends BaseService<Usuario, Integer> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioService(BaseRepository<Usuario, Integer> baseRepository) {
        super(baseRepository);
    }
}
