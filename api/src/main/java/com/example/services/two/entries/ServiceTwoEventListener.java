package com.example.services.two.entries;

import org.springframework.lang.NonNull;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

import com.example.events.ServiceCreateEvent;
import com.example.services.one.internal.usecases.ICreateUsecase;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ServiceTwoEventListener {

    private final ICreateUsecase service;

    @ApplicationModuleListener
    public void listiningCreateServiceOne(@NonNull ServiceCreateEvent event) {
        event.getResponse().complete(service.execute(event.getRequest()));
    }
}
