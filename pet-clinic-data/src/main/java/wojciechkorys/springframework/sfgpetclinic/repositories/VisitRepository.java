package wojciechkorys.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import wojciechkorys.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
