package com.example.services.two.internal.usecases;

import com.example.dtos.ServiceCreateRequest;
import com.example.dtos.ServiceCreateResponse;

public interface ICreateUsecase {
    ServiceCreateResponse execute(ServiceCreateRequest event);
}
