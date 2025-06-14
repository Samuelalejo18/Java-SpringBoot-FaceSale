package FaceSale.demo.api.services;

import java.io.Serializable;
import java.util.List;

public interface InterfaceBaseService<E, ID extends Serializable> {
    public List<E> listAll() throws  Exception ;
    public E getById(ID id) throws  Exception;
    public E save(E entity)throws  Exception;
    public E update(E entity, ID id)throws  Exception;
    public boolean delete(ID id)throws  Exception;


}
