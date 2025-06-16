package FaceSale.demo.api.controllers;


import FaceSale.demo.api.entities.GanadorSubasta;

import FaceSale.demo.api.services.GanadorSubastaService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/GanadorSubasta")
public class GanadorSubastaController extends BaseController<GanadorSubasta, GanadorSubastaService> {
    public GanadorSubastaController(GanadorSubastaService service) {
        this.service = service;
    }

}
