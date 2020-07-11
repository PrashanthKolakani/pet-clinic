package com.pk.springframwork.petclinic.services;

import com.pk.springframwork.petclinic.model.Vet;

import java.util.Set;

public interface vetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set <Vet> findAll();
}
