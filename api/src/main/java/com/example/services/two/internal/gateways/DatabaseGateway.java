package com.example.services.two.internal.gateways;

import com.example.dtos.ServiceCreateResponse;
import com.example.services.two.internal.domains.Two;
import com.example.services.two.internal.repositories.TwoJPARepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DatabaseGateway implements IDatabaseGateway {

    private final TwoJPARepository repository;

    @Override
    public ServiceCreateResponse save(Two entity){
        return repository.saveAndReturnDTO(entity.getName());
    }

}