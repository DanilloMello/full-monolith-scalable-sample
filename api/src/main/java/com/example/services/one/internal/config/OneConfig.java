package com.example.services.one.internal.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.example.services.one.internal.gateways.DatabaseGateway;
import com.example.services.one.internal.repositories.OneJPARepository;
import com.example.services.one.internal.usecases.CreateUseCase;
import com.example.services.one.internal.usecases.ICreateUsecase;

@Configuration
@ComponentScan(basePackages = {"com.example.services.one"})
public class OneConfig {

    @Bean
    @RequestScope
    @ConditionalOnProperty(value = "components.services.one.scale", havingValue = "false")
    public ICreateUsecase OneCreateUsecase(OneJPARepository jpaRepository){
        return new CreateUseCase(new DatabaseGateway(jpaRepository));
    }


}
