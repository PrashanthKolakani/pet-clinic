package com.pk.springframwork.petclinic.services;

import com.pk.springframwork.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set <Pet> findAll();
}
