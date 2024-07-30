package com.example.gateway.internal.usecases;

import java.util.concurrent.CompletableFuture;

import org.springframework.context.ApplicationEventPublisher;

import com.example.dtos.ServiceCreateRequest;
import com.example.dtos.ServiceCreateResponse;
import com.example.events.ServiceCreateEvent;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ServiceOneCreateEventUseCase implements IServiceOneCreateUsecase{

    private final ApplicationEventPublisher publisher;

    @Override
    public CompletableFuture<ServiceCreateResponse> execute(ServiceCreateRequest request)  {
        CompletableFuture<ServiceCreateResponse> response = new CompletableFuture<>();
        publisher.publishEvent(new ServiceCreateEvent(this, request, response));
        return response;
    }
}