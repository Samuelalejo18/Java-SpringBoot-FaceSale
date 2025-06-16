package FaceSale.demo.api.controllers;

import FaceSale.demo.api.entities.ObraArte;
import FaceSale.demo.api.services.ObraArteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/ObraArte")
public class ObraArteController extends BaseController<ObraArte, ObraArteService> {
    public ObraArteController(ObraArteService service) {
        this.service = service;
    }
}
