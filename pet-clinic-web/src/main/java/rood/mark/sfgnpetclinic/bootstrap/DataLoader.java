package rood.mark.sfgnpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rood.mark.sfgnpetclinic.model.Owner;
import rood.mark.sfgnpetclinic.model.Pet;
import rood.mark.sfgnpetclinic.model.PetType;
import rood.mark.sfgnpetclinic.model.Vet;
import rood.mark.sfgnpetclinic.services.OwnerService;
import rood.mark.sfgnpetclinic.services.PetTypeService;
import rood.mark.sfgnpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetSerice;
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;

    public DataLoader(VetService vetSerice, OwnerService ownerService, PetTypeService petTypeService) {
        this.vetSerice = vetSerice;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
    }



    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        System.out.println("Loaded Pet Type");

        Owner owner1 = new Owner();
        owner1.setFirstName("Dick");
        owner1.setLastName("Moe");
        owner1.setAddress("123 Perry");
        owner1.setCity("St. Charles");
        owner1.setTelephone("4444444");

        Pet dicksPet = new Pet();
        dicksPet.setPetType(saveDogPetType);
        dicksPet.setBirthDate(LocalDate.now());
        dicksPet.setName("Rosco");
        dicksPet.setOwner(owner1);
        owner1.getPets().add(dicksPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Skippy");
        owner2.setLastName("DaBush");
        owner2.setAddress("123 Cove");
        owner2.setCity("Golden Eagle");
        owner2.setTelephone("5555555");

        Pet skippysPet = new Pet();
        skippysPet.setName("JustCat");
        skippysPet.setBirthDate(LocalDate.now());
        skippysPet.setPetType(saveCatPetType);
        skippysPet.setOwner(owner2);
        owner2.getPets().add(skippysPet);

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
