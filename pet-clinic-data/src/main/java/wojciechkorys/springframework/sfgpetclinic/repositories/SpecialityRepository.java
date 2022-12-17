package wojciechkorys.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wojciechkorys.springframework.sfgpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
