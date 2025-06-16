package FaceSale.demo.api.controllers;


import FaceSale.demo.api.entities.Puja;
import FaceSale.demo.api.services.PujaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Puja")
public class PujaController extends BaseController<Puja, PujaService>  {
    public PujaController(PujaService service) {
        this.service = service;
    }
}
