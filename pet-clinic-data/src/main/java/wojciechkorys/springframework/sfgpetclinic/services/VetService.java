package wojciechkorys.springframework.sfgpetclinic.services;

import wojciechkorys.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
