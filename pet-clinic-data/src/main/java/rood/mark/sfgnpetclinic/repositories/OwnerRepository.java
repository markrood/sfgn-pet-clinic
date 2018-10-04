package rood.mark.sfgnpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import rood.mark.sfgnpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);
}
