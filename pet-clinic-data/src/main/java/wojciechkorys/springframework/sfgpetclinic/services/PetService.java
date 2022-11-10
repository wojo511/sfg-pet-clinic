package wojciechkorys.springframework.sfgpetclinic.services;

import wojciechkorys.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
