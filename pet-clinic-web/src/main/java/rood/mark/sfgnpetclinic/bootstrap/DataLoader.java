package rood.mark.sfgnpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rood.mark.sfgnpetclinic.model.Owner;
import rood.mark.sfgnpetclinic.model.Vet;
import rood.mark.sfgnpetclinic.services.OwnerService;
import rood.mark.sfgnpetclinic.services.VetService;
import rood.mark.sfgnpetclinic.services.map.OwnerServiceMap;
import rood.mark.sfgnpetclinic.services.map.VetSeviceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetSerice;
    private final OwnerService ownerService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetSerice = new VetSeviceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Dick");
        owner1.setLastName("Moe");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Skippy");
        owner2.setLastName("DaBush");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Joe");
        vet1.setLastName("Surf");

        vetSerice.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("My");
        vet2.setLastName("Money");

        vetSerice.save(vet2);

        System.out.println("Loaded Vets");

    }
}
