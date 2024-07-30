package com.example.services.one.internal.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.services.one.internal.domains.One;

public interface OneJPARepository extends JpaRepository<One, UUID> {

}
