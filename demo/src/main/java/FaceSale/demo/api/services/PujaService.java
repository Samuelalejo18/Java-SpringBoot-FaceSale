package FaceSale.demo.api.services;

import FaceSale.demo.api.entities.Puja;
import FaceSale.demo.api.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PujaService extends BaseService<Puja, Long> {
    @Autowired
    private PujaService pujaService;

    public PujaService(BaseRepository<Puja, Long> baseRepository) {
        super(baseRepository);
    }
}
