package rood.mark.sfgnpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import rood.mark.sfgnpetclinic.model.PetType;
import rood.mark.sfgnpetclinic.repositories.PetTypeRepository;
import rood.mark.sfgnpetclinic.services.PetTypeService;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Entity
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        Optional<PetType> petTypes = petTypeRepository.findById(aLong);
        return petTypes.orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {

        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {

        petTypeRepository.deleteById(aLong);
    }
}
