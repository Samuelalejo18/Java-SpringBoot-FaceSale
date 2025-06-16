package FaceSale.demo.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;

public interface InterfaceBaseController<E,ID extends Serializable>{

    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody  E entity);
    public ResponseEntity<?> update(@RequestBody E entity, ID id);
    public ResponseEntity<?> delete(@PathVariable ID id);

}
