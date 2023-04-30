package com.kodlamaio.inventoryservice.repository;


import com.kodlamaio.inventoryservice.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ModelRepository extends JpaRepository<Model, UUID> {
}
