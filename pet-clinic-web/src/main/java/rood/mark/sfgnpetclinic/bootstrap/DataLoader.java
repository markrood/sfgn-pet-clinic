package rood.mark.sfgnpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rood.mark.sfgnpetclinic.model.Owner;
import rood.mark.sfgnpetclinic.model.Vet;
import rood.mark.sfgnpetclinic.services.OwnerService;
import rood.mark.sfgnpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetSerice;
    private final OwnerService ownerService;

    public DataLoader(VetService vetSerice, OwnerService ownerService) {
        this.vetSerice = vetSerice;
        this.ownerService = ownerService;
    }



    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Dick");
        owner1.setLastName("Moe");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Skippy");
        owner2.setLastName("DaBush");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Joe");
        vet1.setLastName("Surf");

        vetSerice.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("My");
        vet2.setLastName("Money");

        vetSerice.save(vet2);

        System.out.println("Loaded Vets");

    }
}
