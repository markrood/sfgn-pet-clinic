package rood.mark.sfgnpetclinic.services;

import rood.mark.sfgnpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
