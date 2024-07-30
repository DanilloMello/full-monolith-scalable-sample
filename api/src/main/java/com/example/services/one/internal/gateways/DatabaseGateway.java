package com.example.services.one.internal.gateways;

import com.example.dtos.ServiceCreateResponse;
import com.example.services.one.internal.domains.One;
import com.example.services.one.internal.repositories.OneJPARepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DatabaseGateway implements IDatabaseGateway {

    private final OneJPARepository repository;

    @Override
    public ServiceCreateResponse save(One entity){
        repository.save(entity);
        return new ServiceCreateResponse(entity.getId().toString(), entity.getName());
    }

}