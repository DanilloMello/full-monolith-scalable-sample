package com.example.gateway.internal.usecases;

import java.util.concurrent.CompletableFuture;

import com.example.dtos.ServiceCreateRequest;
import com.example.dtos.ServiceCreateResponse;

public interface IServiceOneCreateUsecase {
    CompletableFuture<ServiceCreateResponse> execute(ServiceCreateRequest request);
}
