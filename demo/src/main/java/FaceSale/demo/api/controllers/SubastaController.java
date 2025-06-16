package FaceSale.demo.api.controllers;

import FaceSale.demo.api.entities.Subasta;
import FaceSale.demo.api.services.SubastaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Subasta")
public class SubastaController extends BaseController<Subasta, SubastaService> {
    public SubastaController(SubastaService service) {
        this.service = service;
    }
}
