package com.example.events;

import java.util.concurrent.CompletableFuture;

import org.springframework.context.ApplicationEvent;

import com.example.dtos.ServiceCreateRequest;
import com.example.dtos.ServiceCreateResponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceCreateEvent extends ApplicationEvent {

    private final CompletableFuture<ServiceCreateResponse> response;
    private final ServiceCreateRequest request;

    public ServiceCreateEvent(Object source, ServiceCreateRequest request, CompletableFuture<ServiceCreateResponse> response) {
        super(source);
        this.response = response;
        this.request = request;
    }
}

