package FaceSale.demo.api.services;

import FaceSale.demo.api.entities.Puja;
import FaceSale.demo.api.repositories.BaseRepository;
import FaceSale.demo.api.repositories.PujaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PujaService extends BaseService<Puja, Long> {
    @Autowired
    private PujaRepository pujaRepository;

    public PujaService(BaseRepository<Puja, Long> baseRepository) {
        super(baseRepository);
    }
}
