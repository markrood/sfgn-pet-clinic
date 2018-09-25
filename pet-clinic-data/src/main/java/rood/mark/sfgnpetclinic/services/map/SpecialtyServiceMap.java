package rood.mark.sfgnpetclinic.services.map;

import rood.mark.sfgnpetclinic.model.Specialty;
import rood.mark.sfgnpetclinic.services.SpecialtyService;

import java.util.Set;

public class SpecialtyServiceMap extends AbstractMapService<Specialty,Long> implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
      return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
