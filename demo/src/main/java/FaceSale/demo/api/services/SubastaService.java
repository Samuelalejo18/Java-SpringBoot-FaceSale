package FaceSale.demo.api.services;

import FaceSale.demo.api.entities.Subasta;
import FaceSale.demo.api.repositories.BaseRepository;
import FaceSale.demo.api.repositories.SubastaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubastaService extends BaseService<Subasta, Long> {
    @Autowired
    private SubastaRepository subastaRepository;
    public SubastaService(BaseRepository<Subasta, Long> baseRepository) {
        super(baseRepository);
    }
}
