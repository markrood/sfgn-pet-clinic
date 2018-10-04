package rood.mark.sfgnpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rood.mark.sfgnpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
