package org.example.searchengine.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentRepository repository;

    public Mono<Document> findById(UUID id) {
        return repository.findById(id);
    }

    public Mono<Document> create(Document document) {
        return repository.create(document);
    }
}
