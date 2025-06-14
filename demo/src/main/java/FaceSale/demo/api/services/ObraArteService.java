package FaceSale.demo.api.services;

import FaceSale.demo.api.entities.ObraArte;
import FaceSale.demo.api.repositories.BaseRepository;
import FaceSale.demo.api.repositories.ObraArteReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObraArteService extends BaseService<ObraArte, Long> {

    @Autowired
    private ObraArteReposity obraArteReposity;
    public ObraArteService(BaseRepository<ObraArte, Long> baseRepository) {
        super(baseRepository);
    }
}
