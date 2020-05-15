package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByLastName(String lastName);
    Set<Pet> findAll();
    Pet save(Pet owner);
}
