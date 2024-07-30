package com.example.services.two.internal.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dtos.ServiceCreateResponse;
import com.example.services.one.internal.domains.One;

public interface TwoJPARepository extends JpaRepository<One, UUID> {

    @Query("INSERT INTO One (name) VALUES(:name)")
    ServiceCreateResponse saveAndReturnDTO(@Param("name") String name);

}
