package org.example.searchengine.api.controller;

import org.example.searchengine.domain.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record DocumentDto(
        String id,
        String name,
        String type,
        String description,
        String url,
        List<String> tags,
        LocalDateTime creationDate
) {
    public static DocumentDto fromDomain(Document document) {
        return new DocumentDto(
                document.id().toString(),
                document.name(),
                document.type(),
                document.description(),
                document.url(),
                document.tags(),
                document.creationDate()
        );
    }

    public Document toDomain() {
        return new Document(UUID.fromString(id), name, type, description, url, tags, creationDate);
    }
}
