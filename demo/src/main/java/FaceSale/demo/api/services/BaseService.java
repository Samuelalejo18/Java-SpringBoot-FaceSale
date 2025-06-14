package FaceSale.demo.api.services;

import FaceSale.demo.api.repositories.BaseRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseService<E, ID extends Serializable> implements InterfaceBaseService<E, ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseService(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public List<E> listAll() throws Exception {

        try {

            List<E> entities = baseRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E getById(ID id) throws Exception {
        try {

            Optional<E> entityOpcional = baseRepository.findById(id);
            return entityOpcional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E update(E entity, ID id) throws Exception {

        try {
            Optional<E> entityOpcional = baseRepository.findById(id);
            E entityUpdate = entityOpcional.get();
            entityUpdate = baseRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public boolean delete(ID id) throws Exception {

        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return false;
    }
}

