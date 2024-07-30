package com.example.services.two.internal.gateways;

import com.example.dtos.ServiceCreateResponse;
import com.example.services.two.internal.domains.Two;

public interface IDatabaseGateway {
   ServiceCreateResponse save(Two entity);
}
