package FaceSale.demo.api.services;

import FaceSale.demo.api.entities.GanadorSubasta;
import FaceSale.demo.api.repositories.BaseRepository;
import FaceSale.demo.api.repositories.GanadorSubastaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GanadorSubastaService extends BaseService<GanadorSubasta, Long> {

    @Autowired
    private GanadorSubastaRepository ganadorSubastaRepository;
    public GanadorSubastaService(BaseRepository<GanadorSubasta, Long> baseRepository) {
        super(baseRepository);
    }
}
