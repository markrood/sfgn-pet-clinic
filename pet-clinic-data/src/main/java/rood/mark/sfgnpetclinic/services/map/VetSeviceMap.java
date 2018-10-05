package rood.mark.sfgnpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import rood.mark.sfgnpetclinic.model.Specialty;
import rood.mark.sfgnpetclinic.model.Vet;
import rood.mark.sfgnpetclinic.services.SpecialtyService;
import rood.mark.sfgnpetclinic.services.VetService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetSeviceMap extends AbstractMapService<Vet,Long> implements VetService {

    SpecialtyService specialtyService;

    public VetSeviceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(specialty -> {
                if(specialty.getId() == null){
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
