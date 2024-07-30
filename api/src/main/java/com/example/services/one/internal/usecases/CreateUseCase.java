package com.example.services.one.internal.usecases;

import com.example.dtos.ServiceCreateRequest;
import com.example.dtos.ServiceCreateResponse;
import com.example.services.one.internal.domains.One;
import com.example.services.one.internal.gateways.IDatabaseGateway;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUseCase implements ICreateUsecase {
    
    private final IDatabaseGateway database;

    @Override
    public ServiceCreateResponse execute(ServiceCreateRequest event) {
        return this.database.save(new One(event.name()));
    }
}
