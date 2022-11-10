package wojciechkorys.springframework.sfgpetclinic.services;

import wojciechkorys.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
