package com.example.gateway.internal.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.context.annotation.RequestScope;

import com.example.gateway.internal.usecases.IServiceOneCreateUsecase;
import com.example.gateway.internal.usecases.ServiceOneCreateEventUseCase;

@Configuration
@EnableAsync
@ComponentScan(basePackages = {"com.example.gateway.internal"})
public class GatewayConfig {

    @Bean
    @RequestScope
    @ConditionalOnProperty(value = "components.gateway.scale", havingValue = "false")
    public IServiceOneCreateUsecase workoutCreateUsecaseEventBean(
        ApplicationEventPublisher publisher) {
        return new ServiceOneCreateEventUseCase(publisher);
    }
}
