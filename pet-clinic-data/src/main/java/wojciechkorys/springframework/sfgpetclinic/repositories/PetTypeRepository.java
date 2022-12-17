package wojciechkorys.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wojciechkorys.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
