package org.example.searchengine.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record Document(
        UUID id,
        String name,
        String type,
        String description,
        String url,
        List<String> tags,
        LocalDateTime creationDate
) {
}
