package org.example.searchengine.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface DocumentElasticRepository extends ReactiveCrudRepository<DocumentEntity, UUID> {
}
