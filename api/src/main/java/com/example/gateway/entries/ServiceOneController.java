package com.example.gateway.entries;

import java.util.concurrent.CompletableFuture;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import com.example.dtos.ServiceCreateRequest;
import com.example.dtos.ServiceCreateResponse;
import com.example.gateway.internal.usecases.IServiceOneCreateUsecase;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ServiceOneController {

    private final IServiceOneCreateUsecase service;    

    @MutationMapping
    public CompletableFuture<ServiceCreateResponse> createExampleOne(@Argument ServiceCreateRequest request) {
        return service.execute(request);       
    }
}
