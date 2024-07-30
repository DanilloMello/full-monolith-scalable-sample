package com.example.services.one.internal.gateways;


import com.example.dtos.ServiceCreateResponse;
import com.example.services.one.internal.domains.One;

public interface IDatabaseGateway {
   ServiceCreateResponse save(One entity);
}
