package rood.mark.sfgnpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rood.mark.sfgnpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
