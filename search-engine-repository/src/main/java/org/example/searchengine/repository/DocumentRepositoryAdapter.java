package org.example.searchengine.repository;

import lombok.RequiredArgsConstructor;
import org.example.searchengine.domain.Document;
import org.example.searchengine.domain.DocumentRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class DocumentRepositoryAdapter implements DocumentRepository {

    private final DocumentElasticRepository elasticRepository;

    @Override
    public Mono<Document> findById(UUID id) {
        return elasticRepository.findById(id)
                .map(DocumentEntity::toDomain);
    }

    @Override
    public Mono<Document> create(Document document) {
        return Mono.just(document)
                .map(DocumentEntity::fromDomain)
                .flatMap(elasticRepository::save)
                .map(DocumentEntity::toDomain);
    }
}
