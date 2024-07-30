package com.example.services.two.internal.repositories;

import com.example.dtos.ServiceCreateRequest;
import com.example.dtos.ServiceCreateResponse;

public interface ITwoCustomRepository {
    ServiceCreateResponse save(ServiceCreateRequest name);
}
