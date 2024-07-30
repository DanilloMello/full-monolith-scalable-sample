package com.example.services.two.internal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dtos.ServiceCreateResponse;
import com.example.services.one.internal.domains.One;

import java.util.UUID;

public interface TwoJPARepository extends JpaRepository<One, UUID> {

    @Query("INSERT INTO One (name) VALUES(:name)")
    ServiceCreateResponse saveAndReturnDTO(@Param("name") String name);

}
