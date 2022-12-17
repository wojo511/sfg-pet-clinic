package wojciechkorys.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wojciechkorys.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
