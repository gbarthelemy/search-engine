package org.example.searchengine.api.controller;

import lombok.RequiredArgsConstructor;
import org.example.searchengine.domain.DocumentService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/documents")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService documentService;

    @GetMapping("/{id}")
    public Mono<DocumentDto> get(@PathVariable(name = "id") String id) {
        return Mono.just(id)
                .map(UUID::fromString)
                .flatMap(documentService::findById)
                .map(DocumentDto::fromDomain);
    }

    @PostMapping
    public Mono<DocumentDto> post(@RequestBody DocumentDto document) {
        return Mono.just(document)
                .map(DocumentDto::toDomain)
                .flatMap(documentService::create)
                .map(DocumentDto::fromDomain);
    }
}
