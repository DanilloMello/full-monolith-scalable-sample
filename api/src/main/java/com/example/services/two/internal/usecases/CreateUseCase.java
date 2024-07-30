package com.example.services.two.internal.usecases;


import com.example.dtos.ServiceCreateRequest;
import com.example.dtos.ServiceCreateResponse;
import com.example.services.two.internal.domains.Two;
import com.example.services.two.internal.gateways.IDatabaseGateway;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateUseCase implements ICreateUsecase {
    private final IDatabaseGateway database;

    @Override
    public ServiceCreateResponse execute(ServiceCreateRequest event) {
        return this.database.save(new Two(event.name()));
    }
}
