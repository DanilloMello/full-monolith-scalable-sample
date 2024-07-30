package com.example.services.two.internal.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.example.services.two.internal.gateways.DatabaseGateway;
import com.example.services.two.internal.repositories.TwoJPARepository;
import com.example.services.two.internal.usecases.CreateUseCase;
import com.example.services.two.internal.usecases.ICreateUsecase;

@Configuration
@ComponentScan(basePackages = {"com.unitfit.services.two"})
public class TwoConfig {

    @Bean
    @RequestScope
    @ConditionalOnProperty(value = "components.services.two.scale", havingValue = "false")
    public ICreateUsecase twoCreateUsecase(TwoJPARepository jpaRepository){
        return new CreateUseCase(new DatabaseGateway(jpaRepository));
    }


}
