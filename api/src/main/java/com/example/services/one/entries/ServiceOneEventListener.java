package com.example.services.one.entries;

import org.springframework.context.event.EventListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.events.ServiceCreateEvent;
import com.example.services.one.internal.usecases.ICreateUsecase;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ServiceOneEventListener {

    private final ICreateUsecase service;

    @Transactional
    @EventListener
    public void listiningCreateServiceOne(@NonNull ServiceCreateEvent event) {
        event.getResponse().complete(service.execute(event.getRequest()));
    }
}
