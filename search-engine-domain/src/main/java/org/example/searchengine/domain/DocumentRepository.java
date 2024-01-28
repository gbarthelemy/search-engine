package org.example.searchengine.domain;

import reactor.core.publisher.Mono;

import java.util.UUID;

public interface DocumentRepository {
    Mono<Document> findById(UUID id);

    Mono<Document> create(Document document);
}
