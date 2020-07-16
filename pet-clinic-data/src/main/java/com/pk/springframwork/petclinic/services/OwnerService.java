package com.pk.springframwork.petclinic.services;

import com.pk.springframwork.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
